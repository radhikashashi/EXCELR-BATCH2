import java.util.Scanner;

class Demo014 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        
        System.out.println("Original value of a: " + a);

        
        System.out.println("After a++ (post-increment), a: " + (a++));
        System.out.println("Value of a after post-increment: " + a);

       
        System.out.println("After a-- (post-decrement), a: " + (a--));
        System.out.println("Value of a after post-decrement: " + a);

       
        System.out.println("After ++a (pre-increment), a: " + (++a));

        
        System.out.println("After --a (pre-decrement), a: " + (--a));

        
        scanner.close();
    }
}
