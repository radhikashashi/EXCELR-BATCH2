import java.util.Scanner;

 class Demo026 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        input = input.toLowerCase();

       
        int vowelCount = 0;
        int consonantCount = 0;

        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

           
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
            
            else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }

        
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        
        scanner.close();
    }
}
