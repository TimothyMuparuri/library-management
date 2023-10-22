package library.exceptions;

public class MaximumBookExceededException extends  RuntimeException {
    public MaximumBookExceededException(String message) {
        super(message);
    }
}
