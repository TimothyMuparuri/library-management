package library;

import library.book.Book;
import library.exceptions.BookNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static List<Book> bookList = new ArrayList<>();


    public Book addBookToLibrary(Book book) {
        bookList.add(book);
        return book;
    }

    public void removeBookUsingBook(Book book) {

        bookList.remove(book);
    }

    public void removeBookUsingIndex(int index) {

        bookList.remove(index);

    }

    public void removeBookUsingISBN(int isbn) {

        //create a book object to check if book is there
        Book book1 = null;

        for (Book book : bookList) {

            if (book.getISBN().equals(isbn)) {

                //assign book to book1  to make sure we find the book
                book1 = book;
                bookList.remove(book);
            }

        }

        if (book1 == null) {

            throw new BookNotFoundException("The Library has no such book with Given ISBN NUmber " + isbn);
        }
    }

    public boolean checkBookIsAvailable(Book book) {

        if (book.getAvailabilityStatus()) {
            return bookList.contains(book);
        } else {

            throw new BookNotFoundException(" Book Not Found exception " + book.toString());
        }

    }

    public void displayLibraryBooks() {
        int count = 1;
        System.out.println(" <<<<<<<<<WELCOME TO LIBRARY MANAGEMENT SYSTEM >>>>>>>>>>>>>>>>>");
        System.out.println("AVAILABLE BOOKS ARE ::::");
        for (Book book : bookList) {

            System.out.println(count + " " + book.display());
            count++;

        }

        if (bookList.isEmpty()) {

            throw new BookNotFoundException(" NO BOOKS FOUND IN THE LIBRARY AT THE MOMENT");
        }
    }


}
