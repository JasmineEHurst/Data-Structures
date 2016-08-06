
public class Node<T> {
	T data;
	Node next;
	
	public Node(T data){
		this.data = data;
	}
	
	
	public T getData(){
		return data;
	}
	
	public void setData(T data){
		this.data = data;
	}
	
	public String toString(){
		return " " + data;
	}
}
