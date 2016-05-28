/* *
 * 
 * Assumes the LinkedLists are sorted
 * 
 * */
public class MergeLists {

	private static class ListNode<T>{
		T data;
		ListNode<T> next;
		public ListNode(T d, ListNode<T> next){
			this.data = d;
			this.next = next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static ListNode<Integer> mergeLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2){
		ListNode<Integer> placeholder = new ListNode<Integer>(0, null);
		
		return placeholder;
	}
	
}
