
public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myList = new LinkedList();

		myList.add(new Integer(1));
		myList.add(new Integer(2));
		myList.add(new Integer(3));
		myList.add(new Integer(5));
		myList.addInOrder(new Integer(4));
		
		myList.addInOrder(new Integer(0));
		myList.printList();
		System.out.println("\nCurrent head is" + myList.getHead());
		System.out.println("List after deleting head");
		myList.deleteNode(myList.getHead(), myList.getHead().next);

		myList.printList();
	}

}
