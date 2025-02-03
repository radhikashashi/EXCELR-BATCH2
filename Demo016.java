import java.util.Scanner;

 class Demo016 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();

        
        String normalizedInput = input.toLowerCase();

        
        String reversed = new StringBuilder(normalizedInput).reverse().toString();

       
        if (normalizedInput.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }

      
        scanner.close();
    }
}
