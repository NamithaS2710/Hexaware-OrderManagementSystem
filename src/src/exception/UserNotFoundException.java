package exception;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
    	super(" User Not Found: " + message);
    }
}