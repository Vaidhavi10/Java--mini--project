import java.util.Scanner;

class Login {
    private String username;
    private String password;

    // Constructor
    Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Login verification method
    public boolean verifyLogin(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername) &&
               password.equals(enteredPassword);
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Default login details
        Login login = new Login("admin", "1234");

        int attempts = 3;
        boolean loggedIn = false;

        System.out.println("=================================");
        System.out.println("   STUDENT MANAGEMENT SYSTEM");
        System.out.println("=================================");

        while (attempts > 0) {

            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (login.verifyLogin(username, password)) {
                System.out.println("\nLogin Successful!");
                System.out.println("Welcome to Student Management System.");
                loggedIn = true;
                break;
            } else {
                attempts--;
                System.out.println("\nInvalid Username or Password!");

                if (attempts > 0) {
                    System.out.println("Attempts remaining: " + attempts);
                }
            }
        }

        if (!loggedIn) {
            System.out.println("\nToo many failed attempts.");
            System.out.println("Access Denied!");
        }

        sc.close();
    }
}