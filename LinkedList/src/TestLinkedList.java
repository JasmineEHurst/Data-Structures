
public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myList = new LinkedList();

		myList.add(new Integer(1));
		myList.add(new Integer(2));
		myList.add(new Integer(3));
		myList.add(new Integer(5));
		/* Add two nodes in their proper order*/
		myList.addInOrder(new Integer(4));
		myList.addInOrder(new Integer(0));
		myList.printList();
		System.out.println("\nCurrent head is" + myList.getHead());
		/* Delete head and one other node */
		System.out.println("List after deleting head");
		myList.deleteNode(myList.getHead(), myList.getHead());
		myList.deleteNode(myList.getHead(), myList.getHead().next);
		myList.printList();
		/* Get length of list */
		System.out.println("\n" + myList.getCount(myList.getHead()));
		/* Set head after reversing list */
		myList.setHead(myList.reverse(myList.getHead()));
		myList.printList();
	}

}
