package library;

import library.book.Book;

public interface Borrowable {
    int BORROW_LIMIT=5;
    void borrow();
}
