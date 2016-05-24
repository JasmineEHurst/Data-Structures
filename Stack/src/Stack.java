/*
 * 
 * Stack implementation of linkedlist
 * 
 * */
public class Stack {
	Node top;
	int size;
	
	public Stack(){
		top = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return top == null;
	}
	public int getSize(){
		return size;
	}
	public void push(int data){
		Node newNode = new Node(data, null);
		if(top == null){
			top = newNode;
		}else{
			newNode.setLink(top);
			top = newNode;
		}
		size++;
	}
	
	public int pop(){
//		if(!isEmpty()){
			Node focusNode = top;
			top = focusNode.getLink();
			size--;
			return focusNode.getData();
//	}
	}
	
	public int peek(){
		return top.getData();
	}
	public void display(){
		if(size == 0){
			return;
		}
		Node focusNode = top;
		while(focusNode != null){
			System.out.println(focusNode.getData());
			focusNode = focusNode.getLink();
		}
	}
}
