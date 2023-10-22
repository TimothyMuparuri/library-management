import library.Library;
import library.book.Book;
import library.exceptions.BookNotFoundException;
import library.exceptions.LibraryException;
import library.exceptions.MaximumBookExceededException;
import library.exceptions.UserNotFoundException;
import library.user.Student;
import library.user.Teacher;
import library.user.User;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class LibraryManagementApp {

    public static void main(String[] args) {
        Library library = new Library();
        User student = new Student("Alice", "S123");
        User teacher = new Teacher("Bob", "T456");

        Book book1 = new Book("Introduction to Java", "John Doe", "123456", true);
        Book book2 = new Book("OOP Concepts", "Jane Smith", "789101", true);
        Book book3 =  new Book(" 12 Factor Application"," Ryan Daal ","368",true);

        library.addBookToLibrary(book1);
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book3);

        try {
            student.borrowBook(book1);
            teacher.borrowBook(book2);
            //student.borrowBook(book3);
            // Demonstrate returning books and handling exceptions.
            student.returnBook(book1);
            //student.returnBook(book1); // Simulate trying to return the same book again.
            teacher.returnBook(book1);


        } catch (BookNotFoundException | UserNotFoundException |LibraryException | MaximumBookExceededException e) {
            System.out.println("Error: " + e.getMessage());
        }

        library.displayLibraryBooks();
    }

}