package assignment;

public class StackOverFlowException extends RuntimeException{
	private String message;
	
	public StackOverFlowException() {
	}

	public StackOverFlowException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "StackOverFlowException [message=" + message + "]";
	}
	
	public String getMessage() {
		return message;
	}
}
