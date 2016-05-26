
public class EmptyQueueException extends RuntimeException{

	private String message = "Add an element to the queue first";
	/**
	 * Constructs a new runtime exception with null as its detail message
	 **/
	public EmptyQueueException(){
		super();
	}
	
	public EmptyQueueException(String message){
		System.out.println(message);
	}
	
	/**
	 * Overrides getMessage in throwable
	 * */
	public String getMessage(){
		return message;
	}
}
