import java.util.Scanner;

public class Demo049{
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        int reversedNumber = 0;

        
        number = Math.abs(number);

     
        while (number != 0) {
            int lastDigit = number % 10;           
            reversedNumber = reversedNumber * 10 + lastDigit;  
            number = number / 10;                 
        }

      
        System.out.println("Reversed number: " + reversedNumber);

       
        scanner.close();
    }
}
