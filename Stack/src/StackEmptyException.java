
public class StackEmptyException extends RuntimeException{
 
	String message = "Need to add item to stack first.";
	
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
