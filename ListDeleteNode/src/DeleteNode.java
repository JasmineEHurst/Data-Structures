
public class DeleteNode {

	private class ListNode<T>{
		T data;
		ListNode<T> next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/* *
	 * Deletes a given node (except the tail node) by replacing its contents 
	 * with its linked/neighbor/next node
	 * */
	public static void deleteNode(ListNode node){
		if(node.next == null){
			return;
		}
		node.data = node.next.data;
		node.next = node.next.next;
	}
}
