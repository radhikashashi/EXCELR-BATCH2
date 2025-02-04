import java.util.Scanner;

public class Demo047 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        int count = String.valueOf(Math.abs(number)).length(); 

        
        System.out.println("Number of digits: " + count);

      
        scanner.close();
    }
}
