import java.util.Scanner;

public class Demo051 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        int originalNumber = number;

        
        int reversedNumber = 0;

        
        while (number != 0) {
            int lastDigit = number % 10;           
            reversedNumber = reversedNumber * 10 + lastDigit;  
            number = number / 10;                  
        }

        
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
         scanner.close();
    }
}
