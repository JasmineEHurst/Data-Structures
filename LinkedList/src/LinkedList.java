
public class LinkedList {
	Node<Integer> head;
	int size;
	
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
	public void deleteNode(){
		
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
}
