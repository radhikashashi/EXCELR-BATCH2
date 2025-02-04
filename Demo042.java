import java.util.Scanner;

class Demo042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an uppercase character:");
        char uppercaseChar = scanner.next().charAt(0);

        
        char lowercaseChar = Character.toLowerCase(uppercaseChar);

        System.out.println("Lowercase version: " + lowercaseChar);
    }
}
