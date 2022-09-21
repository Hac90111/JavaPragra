package ExceptionHandling;


// Custom exception using RuntimeException from library
public class CustomException extends RuntimeException {

    // Constructor to catch the message
    public CustomException(String message) {
        super(message);
    }
}
