package doit;

public class MyException extends IndexOutOfBoundsException{
String message;

public MyException(String message) {
	this.message = message;
}

public String getMessage () {
	return message;
}
}
