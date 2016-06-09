import java.util.*;

public class RemoveDuplicates {

	private class Node{
		int data;
		Node next;
		public Node(int data){
			this.data = data;
		}
	}
	
	private class LinkedList{
		Node head;
		int size;
		
		public void add(int data){
			if(head == null){
				head = new Node(data);
			}else{
				Node newNode = new Node(data);
				Node focusNode = head;
				/* Shift through the list until the end is found */
				while(focusNode.next != null){
					focusNode = focusNode.next;
				}
				focusNode.next = newNode;
				incrementSize();
			}
		}
		
		public void incrementSize(){
			size++;
		}
	}
	
	public static void main(String[] args) {
		RemoveDuplicates outerClass = new RemoveDuplicates();
		RemoveDuplicates.LinkedList myList = outerClass.new LinkedList();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(4);
		myList.add(4);
		myList.add(5);
		
		removeDuplicates(myList);
		Node focusNode = myList.head;
		while(focusNode != null){
			System.out.printf("%d ",focusNode.data);
			focusNode = focusNode.next;
		}

	}
	
	public static void removeDuplicates(LinkedList list){
		HashSet<Integer> hashset = new HashSet<Integer>();
		Node modified = null;
		Node focusNode = list.head;
		while(focusNode != null){
			if(hashset.contains(focusNode.data)){
				modified.next = focusNode.next;
			}else{
				hashset.add(focusNode.data);
				modified = focusNode;
			}
			focusNode = focusNode.next;
		}
	}

}
