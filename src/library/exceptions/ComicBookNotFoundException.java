package library.exceptions;

public class ComicBookNotFoundException extends  RuntimeException{
    public ComicBookNotFoundException(String message) {
        super(message);
    }
}
