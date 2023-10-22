package library.book;

import library.Borrowable;

public class TextBook extends Book implements Borrowable {

    private String subject;
    public TextBook(String title, String author, String ISBN, Boolean availabilityStatus) {
        super(title, author, ISBN, availabilityStatus);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    @Override
    public String toString() {
        return "TextBook{" +
                "subject='" + subject + '\'' +
                '}';
    }

    @Override
    public void borrow() {
        //logic for textbook
        //dept approaval
        this.setAvailabilityStatus(false);
    }
}
