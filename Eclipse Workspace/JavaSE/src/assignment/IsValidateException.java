package assignment;

public class IsValidateException extends RuntimeException {
	private String message;
	public IsValidateException() {
	}
	public IsValidateException(String message) {
		super();
		this.message = message;
	}
	@Override
	public String toString() {
		return "IsValidateException [message=" + message + "]";
	}
	
	public String getMessage() {
		return message;
	}
}
