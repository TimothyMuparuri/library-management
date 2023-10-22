package library.user;

import library.book.Book;
import library.Library;
import library.exceptions.BookNotFoundException;
import library.exceptions.MaximumBookExceededException;
import library.exceptions.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;

public abstract class User {

    protected String id;
    protected String name;
    protected String surname;
    List<Book> borrowedBooks = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }

    public   abstract Book  borrowBook(Book book);

    public void returnBook(Book book) {

        if (!this.borrowedBooks.isEmpty()) {

            if (this.borrowedBooks.contains(book)) {
                book.setAvailabilityStatus(true);
                this.borrowedBooks.remove(book);
            }else{
                throw new BookNotFoundException( "Book Not Found Exception In UserID "+ this.id +" Borrowed List");
            }
        }else {
            throw new BookNotFoundException("Book Not Found Exception In UserID "+ this.id +" Borrowed List");
        }
    }


}
