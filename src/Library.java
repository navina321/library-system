import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<User> users;
    private List<Admin> admins;

    public Library(){
        books =new ArrayList<>();
        users = new ArrayList<>();
        admins=new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void addUser (User user){
        users.add(user);
    }

    public void addAdmin (Admin admin){
        admins.add(admin);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Admin> getAdmins() {
        return admins;
    }

    public void loanBook(User user, Book book) throws Exception {
        if (book.isOnLoan()) {
            throw new Exception("Book is already on loan");
        }

        book.setOnLoan(true);
        user.borrowBook(book);
    }

    public void returnBook(User user, Book book){
        book.setOnLoan(false);
        user.returnBook(book);
    }

    public List<Book> getBooksOnLoan(){
        List<Book> booksOnLoan = new ArrayList<>();
        for(Book book : books){
            if(book.isOnLoan()){
                booksOnLoan.add(book);
            }
        }
        return booksOnLoan;
    }

    public void generateReport(Admin admin){
        List<Book> booksOnLoan = getBooksOnLoan();
        admin.generateReport(booksOnLoan);
    }
}
