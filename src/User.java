import java.util.ArrayList;
import java.util.List;

public class User extends Person{
    private List<Book> borrowedBooks;


    public User(String name, String email, String password) {
        super(name, email, password, false);
        borrowedBooks = new ArrayList<>();
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}
