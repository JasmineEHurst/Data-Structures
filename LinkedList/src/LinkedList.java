
public class LinkedList {
	private Node<Integer> head;
	private int size;
	
	public void add(Object data){
		if(head == null){
			head = new Node(data);
		}else{
			Node<Integer> newNode = new Node(data);
			Node focusNode = head;
			/* Shift through the list until the end is found */
			while(focusNode.next != null){
				focusNode = focusNode.next;
			}
			focusNode.next = newNode;
			incrementSize();
		}
	}
	
	public void add(Object data,int index){
		Node focusNode = head;
		Node newNode = new Node(data);
//		if(index == 0){
//			System.out.println("Cannot add at placement 0");
//			return;
//		}
		if(head != null){
			/* Traverse to node before selected index*/
			for(int i = 0; i < index - 1 && focusNode.next != null; i++){
				focusNode = focusNode.next;
			}
		}
		newNode.next = focusNode.next;
		focusNode.next = newNode;
		incrementSize();
	}

	
	public void printList(){
		if(head != null){
			Node<Integer> focusNode = head;
			while(focusNode != null){
				System.out.printf("%d ",focusNode.getData());
				focusNode = focusNode.next;
			}
		}
	}
	public void incrementSize(){
		size++;
	}
	
	public void addInOrder(int data){
		if(isEmpty()){
			head = new Node(data);
		}else if(data < head.data){
			Node temp = head;
			Node newNode = new Node(data);
			newNode.next = temp;
			head = newNode;
			
		}else{
			Node current = head;
			while(current.next != null){
				if(data < (int)current.next.data){
					Node newNode = new Node(data);
					newNode.next = current.next;
					current.next = newNode;
					return;
				}else{
					current = current.next;
				}
			}
		}
			
	}
	
	public boolean isEmpty(){
		if(size == 0)
			return true;
		return false;
	}
	
	public void deleteNode(Node head, Node node){
		if(node.data == head.data){
			//Cannot have empty list
			if(head.next == null){
				return;
			}
			head.data = head.next.data;
			node = head.next;
			head.next = head.next.next;
			// free memory
            System.gc();
			return;
		}
		Node<Integer> current = head;
		while(current.next != null){
			if(current.next == node){
				current.next = current.next.next;
				// free memory
	            System.gc();
				return;
			}
			current = current.next;
		}
		return;
		
		
	}
	
	public Node getHead(){
		return head;
	}
	
	public int getSize(){
		return size;
	}
}
