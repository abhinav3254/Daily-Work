package assignment;

public class StackUnderFlowException extends RuntimeException {
	private String message;
	public StackUnderFlowException() {
		// TODO Auto-generated constructor stub
	}
	public StackUnderFlowException(String message) {
		super();
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	
}
