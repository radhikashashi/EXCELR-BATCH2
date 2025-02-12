public class Demo075 {
    public static void main(String[] args) {
        int[] numbers = {15, 42, 89, 7, 99, 34, 56}; 
        
        int max = numbers[0]; 

        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; 
            }
        }

        System.out.println("The maximum number in the array is: " + max);
    }
}
