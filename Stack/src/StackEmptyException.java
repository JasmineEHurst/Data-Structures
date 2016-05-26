
public class StackEmptyException extends RuntimeException{
 
	String message = "Need to add item to stack first.";
	
	/**
	 * Constructs a new runtime exception with null as its detail message
	 * */
	public StackEmptyException(){
		super();
	}
	
	public StackEmptyException(String message){
		System.out.println(message);
	}
	
	public String getMessage(){
		return message;
	}
}
