import java.util.List;

public class Admin extends Person{

    public Admin(String name, String email, String password) {
        super(name, email, password, true);
    }

    public void generateReport(List<Book> books){

    }
}
