import java.util.Scanner;

class Demo05{
    public static void main(String[] args) {
        
        String validUsername = "001";
        String validPassword = "user_001";

        Scanner scanner = new Scanner(System.in);
        boolean isAuthenticated = false;

        
        while (!isAuthenticated) {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            
            if (inputUsername.equals(validUsername) && inputPassword.equals(validPassword)) {
                System.out.println("Happy New Year 2025!");
                isAuthenticated = true;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }

        scanner.close();
    }
}
