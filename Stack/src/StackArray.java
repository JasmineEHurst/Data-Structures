/*
 * 
 * ArrayList implementation of Stack
 * 
 * Uses EmptyStackException instead of custom 
 * exception class "StackEmptyException"
 * */
import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackArray<T> {
	
	private ArrayList stack;
	
	public T pop(){
		if(isEmpty(stack))
			throw new EmptyStackException();
		return (T) stack.remove(stack.size()-1);
		
	}
	public void push(T item){
		Node<T> newNode = new Node(item);
		stack.add(newNode);
	}
	
	public boolean isEmpty(ArrayList stack){
		return stack.isEmpty();
	}

}
