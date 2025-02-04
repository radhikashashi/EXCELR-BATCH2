import java.util.Scanner;

public class Demo059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

       
        boolean isPrime = num > 1 && IntStream.range(2, (int) Math.sqrt(num) + 1).noneMatch(i -> num % i == 0);

       
        System.out.println(isPrime ? num + " is prime." : num + " is not prime.");

        scanner.close();
    }
}
