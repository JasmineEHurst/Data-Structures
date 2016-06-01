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
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		ListNode<Integer> placeholder = new ListNode<Integer>(0, null);
		ListNode<Integer> current;
		current = placeholder;
		/* Create temporary lists to protect original lists*/
		ListNode<Integer> list1 = l1, list2 = l2;

		while(list1.next != null && list2.next!=null){
			if(list1.data <= list2.data){
				current.next = list1;
				list1 = list1.next;
			}else{
				current.next = list2;
				list2 = list2.next;
			}
			/* Transition full list to the next node*/	
			current = current.next;
		}
		/*Append the rest of the nodes of the longer list*/
		current.next = list1 != null ? list1 : list2;
		return placeholder.next;
	}
	
}
