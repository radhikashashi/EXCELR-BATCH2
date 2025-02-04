class LTCODE001 {

    public boolean isPalindrome(int x) {
        
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

  
        return original == reversed;
    }

    public static void main(String[] args) {
       
        LTCODE001 obj = new LTCODE001();

        
        int test1 = 121;
        int test2 = -121;
        int test3 = 10;
        int test4 = 0;

        
        System.out.println("Is " + test1 + " a palindrome? " + obj.isPalindrome(test1)); 
        System.out.println("Is " + test2 + " a palindrome? " + obj.isPalindrome(test2)); 
        System.out.println("Is " + test3 + " a palindrome? " + obj.isPalindrome(test3)); 
        System.out.println("Is " + test4 + " a palindrome? " + obj.isPalindrome(test4)); 
    }
}
