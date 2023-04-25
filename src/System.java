import java.util.Scanner;

public class System {
    private Library library;
    private Login login;
    private User currentUser;

    public System() {
        library = new Library();
        login = new Login();
        currentUser = null;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);

        login.addUser("user1","password1");
        login.addUser("user2","password2");
        login.addUser("admin","adminpassword");

        while(true){
            if (currentUser == null) {
                System.out.println("Enter username: ");
                String username = scanner.nextLine();

                System.out.println("Enter password: ");
                String password = scanner.nextLine();

                if(login.verifyLogin(username,password)){
                    if(username.equals("admin")){
                        currentUser = new Admin();
                    } else {
                        currentUser = new User();
                    }
                    System.out.println("You are logged in!");
                } else {
                    System.out.println("Invalid username or password");
                }
            } else {
                System.out.println("1. View available books");
                System.out.println("2. View books currently on loan");
                System.out.println("3. Loan a book");
                if(currentUser instanceof Admin){
                    System.out.println("4. Run report");
                }
                System.out.println("0. Log out");

                System.out.println("Enter selected option: ");
                String input = scanner.nextLine();


                switch (input){
                    case "1" :
                        showAvailableBooks();
                        break;
                    case "2" :
                        showBooksOnLoan();
                        break;
                    case "3" :
                        loanBook();
                        break;
                    case "4" :
                        if(currentUser instanceof Admin){
                            runReport();
                        } else {
                            System.out.println("Invalid option");
                        }
                        break;
                    case "0" :
                        currentUser = null;
                        System.out.println("You are logged out");
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            }
        }
    }

    private void showAvailableBooks(){
        System.out.println("Available books:");
        library.getBooks();
    }

    private void showBooksOnLoan(){
        System.out.println("Books on loan: ");
        library.getBooksOnLoan();
    }

    private void loanBook(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book number: ");
        int bookNumber = scanner.nextInt();
        scanner.nextLine();

    }

    private void runReport() {
        System.out.println("Books on loan: ");
        library.getBooksOnLoan();

        System.out.println("Loan count by book");
    }
}
