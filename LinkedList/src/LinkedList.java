
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
	
	
	public int compare(Node list1node, Node list2node){
		if(list1node == null && list2node == null)
			return 0;
		 while(list1node != null && list2node != null && list1node.data == list2node.data){
			 list1node = list1node.next;
			 list2node = list2node.next;
		 }
		 
		 if(list1node == null && list2node != null){
			 return -1;
		 }
		 if(list2node == null && list1node != null){
			 return 1;
		 }
		 if (list1node != null && list2node != null){
			 return ((int)list1node.data > (int)list2node.data ? 1 : -1);
		 }
		 return 0;
		 
	}
	
	
	
	public void deleteNode(Node head, Node node){
		if(node == head){
			//Cannot have empty list
			if(head.next == null){
				return;
			}
			head.data = head.next.data;
			
			head.next = head.next.next;
//			node = head.next;
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
	
	
	
	public void incrementSize(){
		size++;
	}
	
	
	public boolean isEmpty(){
		if(size == 0)
			return true;
		return false;
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
	

	/* Iterative function for obtaining length of list */
	public int getCount(){
		Node temp = head;
		int count = 0;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	
	/* Recursive function for obtaining length of list */
	public int getCount(Node head){
		if(head == null)
			return 0;
		else{
			return 1 + getCount(head.next);
		}
	}
	
	public Node getHead(){
		return head;
	}
	
	public int getSize(){
		return size;
	}
	
	/* Function reverses linkedlist
	 * Returns new head of linkedllist */
	public Node reverse(Node head){
		// The first node is the tail, so its link will be null
		Node prev = null;
		Node current = head;
		Node next = null;
		while(current != null){
			// The next node from original list, will switch current to this node later
			next = current.next;
			// Connect current node to the one previous (backwards), if its the tail prev is null
			current.next = prev;
			// Now that the connection is made, switch current node to previous for next loop
			prev = current;
			// Switch to next node from original list
			current = next;
		}
		head = prev;
		return head;
	}
	
	public void setHead(Node node){
		head = node;
	}
}
