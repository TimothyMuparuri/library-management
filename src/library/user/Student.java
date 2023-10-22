package library.user;

import library.Library;
import library.book.Book;
import library.exceptions.BookNotFoundException;
import library.exceptions.MaximumBookExceededException;

public class Student extends User {

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static int STUDENT_BOOK_LIMIT = 1;

    @Override
    public Book borrowBook(Book book) {

        if (Library.bookList.contains(book)) {
            if (book.getAvailabilityStatus()) {

                // check if the borrowed books are not more than the Library limit
                if (borrowedBooks.size() < Student.STUDENT_BOOK_LIMIT) {
                    borrowedBooks.add(book);
                } else {

                    // Throw exception if the borrowed books are above limit

                    throw new MaximumBookExceededException(" Maximum Book Borrowed for User  With ID " + this.getId());
                }
            }
        } else {
            throw new BookNotFoundException(" Provided Book Is Not Found in the Library FOr ISBN " + book.getISBN());
        }

        return book;

    }

}
