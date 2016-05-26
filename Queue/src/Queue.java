
public class Queue<T> {
/* *
 *  Instead of creating the Node in a separate class,
 *  will use a private class instead
 *  
 * */
	private static class Node<T> {
		private T data;
		private Node link;
		
		public Node(T data){
			this.data = data;
		}
	}
	
	private Node<T> first;
	private Node<T> last;
	

	public void enqueue(T item){
		Node<T> newNode = new Node<T>(item);
		if(last != null){
			last.link = newNode;
		}
		last = newNode;
		if(first == null){
			first = last;
		}
	}
	
	public T dequeue(){
		if(first == null) throw new EmptyQueueException();
		T data = first.data;
		first = first.link;
		if(first == null){
			last = null;
		}
		return data;
	}
}
