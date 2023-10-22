package library.book;

import library.Borrowable;

public class Novel extends Book implements Borrowable {

    private String author;
    private String publisher;

    public Novel(String title, String author, String ISBN, Boolean availabilityStatus) {
        super(title, author, ISBN, availabilityStatus);
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public void borrow() {

        //Libran approaval
        //dept approaval
        //stdent approaval

        this.setAvailabilityStatus(false);
    }
}
