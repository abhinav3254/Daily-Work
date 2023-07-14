package exception;

public class InsufficeintBalanceException extends RuntimeException {
	String message;
	public InsufficeintBalanceException() {}
	public InsufficeintBalanceException(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	public String toString() {
		return "InsufficientBalanceException: "+message;
	}
}
