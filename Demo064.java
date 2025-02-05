public class Demo064{
    public static void main(String[] args) {
        
        int [] arr = {10, 20, 30, 40, 50, 60};

        if (arr.length > 1){

            int temp = arr[0];
            
            arr[0] = arr[arr.length - 1];
            
            arr[arr.length - 1] = temp;

            System.err.println("Array After Swapping First and Last Array: ");

            for (int i = 0; i < arr.length; i++) {

                System.err.println(arr[i] + " ");
            
            }
            
        } else {
            System.err.println("Array Doesn't Have Enough Elements to Swap");
        }
    }
}