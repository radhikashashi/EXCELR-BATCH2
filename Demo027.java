import java.util.Scanner;
 class Demo027 {


    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int terms = scanner.nextInt();

    
        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            
            System.out.println("Fibonacci series:");
            for (int i = 0; i < terms; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

        
        scanner.close();
    }
}
