import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Library library = new Library();
        Login login = new Login();
        System system = new System();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Library System");

        while(true){
            System.out.println("Enter 'login' to login or 'exit' to quit:");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("login")) {
                if (login.login()) {
                    system.run();
                } else {
                    System.out.println("Invalid username or password. Please try again.");
                }
            } else if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

    }
}
