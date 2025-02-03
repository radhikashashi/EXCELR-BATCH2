import java.util.Scanner;

class Demo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String loginid = "";
        String pwd = "";
        String reply;

        do {
            System.out.println("Welcome to Mallareddy University");
            System.out.println("Have you visited our site earlier? (yes/no)");
            reply = sc.nextLine();

            if (reply.equalsIgnoreCase("no")) {
                System.out.println("Login here");
                System.out.println("Enter your ID: ");
                loginid = sc.nextLine();
                System.out.println("Enter your Password: ");
                pwd = sc.nextLine();
            } else {
                System.out.println("You are our valued customer");
            }
        } while (!(loginid.equals("shashank") && pwd.equals("12345")));

        System.out.println("Login successful! Welcome, Shashank.");
        sc.close();
        
    }
}
