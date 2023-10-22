package library.user;

import library.Library;
import library.book.Book;
import library.exceptions.BookNotFoundException;
import library.exceptions.LibraryException;
import library.exceptions.MaximumBookExceededException;

public class Teacher extends User {
    public Teacher(String id, String name) {
        this.id=id;
        this.name=name;
    }

    public static int TEACHER_LIMIT=4;

    @Override
    public Book borrowBook(Book book){

        if (Library.bookList.contains(book)) {
        if( book.getAvailabilityStatus()){

            book.setAvailabilityStatus(false);

            // check if the borrowed books are not more than the Library limit
            if(borrowedBooks.size()< Teacher.TEACHER_LIMIT) {
                borrowedBooks.add(book);
            }else{

                // Throw exception if the borrowed books are above limit

                throw new MaximumBookExceededException(" Maximum Book Borrowed for User  With ID "+this.getId());

            }

        }
        }else{
            throw new LibraryException(" Book With ISBN "+ book.getISBN() +" Not Found In Library Management System , Kindly Add this book to Library");

        }

        return  book;


    }


}



