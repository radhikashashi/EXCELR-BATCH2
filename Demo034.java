import java.util.Scanner;

class Demo034{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + "is a Even Number...");
        } else{
            System.out.println(number + "is a Odd Number...");
        }
        scanner.close();
    }
}