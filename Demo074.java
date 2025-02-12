public class Demo074 {

        
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n - i - 1; j++) {
                
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

            public static void main(String[] args) {
        int[] array = {710, 930, 350, 570, 290, 110};
        
        System.out.println("Original array:");
        printArray(array);
        
        bubbleSort(array); 
        
        System.out.println("Sorted array:");
        printArray(array);
    }
}