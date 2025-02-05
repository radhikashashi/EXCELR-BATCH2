package Test;

import java.util.Scanner;

public class Test002 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        String reply = "";

        
        while (!reply.equalsIgnoreCase("no")) {
            
            System.out.println("Happy Sankranthi!");

            
            System.out.print("Do you want to see the message again? (yes/no): ");
            reply = scanner.nextLine();
        }

        
        scanner.close();

        
        System.out.println("Goodbye!");
    }
}
