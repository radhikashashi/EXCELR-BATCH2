package PS002;
import java.util.Scanner;

 class Multiple {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        
        System.out.print("Enter the multiple to find: ");
        int multiple = scanner.nextInt();

       
        int nextMultiple = ((number / multiple) + 1) * multiple;

        
        System.out.println("The next multiple of " + multiple + " after " + number + " is: " + nextMultiple);

        
        scanner.close();
    }
}
