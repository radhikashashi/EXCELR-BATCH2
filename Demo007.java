import java.util.Scanner;

 class Demo07 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

    
        System.out.print("Enter your phone number: ");
        long phoneNumber = scanner.nextLong();

    
        System.out.println("\nHere is the information you entered:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);

        
        scanner.close();
    }
}
