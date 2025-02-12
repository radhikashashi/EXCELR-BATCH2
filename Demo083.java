import java.util.Scanner;

public class Demo083{

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a String: ");

        String input = scanner.nextLine().trim();

        if(input.isEmpty()) {

            System.err.println("String is Empty.Please Enter a valid String");
            
            return;
        }

        char firstChar = Character.toLowerCase(input.charAt(0));

        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {

            System.err.println("The First Character is '" + input.charAt(0) +"' is a Vowel.");

        } else if(Character.isLetter(firstChar)) {

            System.out.println("The First Character is '" + input.charAt(0) +"' is a Consonant.");
        
        } else {

            System.err.println("The First Character is not a Letter");
        }

        scanner.close();

    }
}