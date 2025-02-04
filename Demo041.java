import java.util.Scanner;

 class Demo041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a LowerCase Character:");
        char lowercaseChar = scanner.next().charAt(0);

    
        char uppercaseChar = Character.toUpperCase(lowercaseChar);

        System.out.println("UpperCase Version: " + uppercaseChar);
        
    }
}
