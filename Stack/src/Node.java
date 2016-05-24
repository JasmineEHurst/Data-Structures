
public class Node {
	int data;
	Node link;
	
	public Node(){
		link = null;
		data = 0;
	}
	
	public Node(int data, Node node){
		this.data = data;
		this.link = node;
	}
	
	public void setLink(Node node){
		link = node;
	}
	
	public void setData(int d){
		data = d;
	}
	public Node getLink(){
		return link;
	}
	public int getData(){
		return data;
	}
	
}
