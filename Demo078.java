import java.util.Arrays;

public class Demo078 {
    public static void main(String[] args) {
        int[] numbers = {300, 89, 50, 129, 798, 69, 142, 9999}; 

        rearrangeArray(numbers);

        System.out.println("Array after rearranging (Even left, Odd right): " + Arrays.toString(numbers));
    }

    public static void rearrangeArray(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }

            
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }

            
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
