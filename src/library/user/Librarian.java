package library.user;

import library.book.Book;
import library.exceptions.MaximumBookExceededException;

public class Librarian extends User{

    private String libraryId;

    public Librarian(String libraryId) {
        super();
        this.libraryId=libraryId;
    }

    @Override
    public Book  borrowBook(Book book){

        if( book.getAvailabilityStatus()){

            book.setAvailabilityStatus(false);

            // check if the borrowed books are not more than the Library limit
                borrowedBooks.add(book);
            }

        return book;

    }

    @Override
    public void returnBook(Book book) {
        book.setAvailabilityStatus(true);
        this.borrowedBooks.remove(book);
    }

    public String getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }
}
