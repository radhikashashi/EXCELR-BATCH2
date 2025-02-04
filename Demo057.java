import java.util.Scanner;

public class Demo057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        int lastDigit = number % 10;

        
        while (number >= 10) {
            number /= 10;
        }
        int firstDigit = number;

  
        int sum = firstDigit + lastDigit;

       
        System.out.println("Sum of first and last digits: " + sum);

        scanner.close();
    }
}
