import java.util.EmptyStackException;
public class Stack<T> {
	
	private Node<T> top;
	
	public T pop(){
		if(top == null)
			throw new EmptyStackException();
		T item = top.data;
		top = top.link;
		return item;
	}
	public void push(T item){
		Node<T> node = new Node(item);
		node.link = top;
		top = node;
	}
}
