public class Demo076 {
    public static void main(String[] args) {
        int[] numbers = {15, 42, 89, 7, 99, 34, 56}; 

        if (numbers.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        
        for (int num : numbers) {
            if (num > max) {
                secondMax = max; 
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second maximum found.");
        } else {
            System.out.println("The second maximum number in the array is: " + secondMax);
        }
    }
}
