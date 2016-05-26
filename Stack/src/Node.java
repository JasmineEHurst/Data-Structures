/*
 * Make data 
 * */
public class Node<T> {
	T data;
	Node<T> link;
	
	public Node(){
		link = null;
		data = null;
	}
	
	public Node(T data){
		this.data = data;
	}
	
	public void setLink(Node node){
		link = node;
	}
	
	public void setData(T d){
		data = d;
	}
	public Node getLink(){
		return link;
	}
	public int getData(){
		return (int) data;
	}
	
}
