
public class Demo063 {

    public static void main(String[] args) {
        
    int [] arr = {20, 30, 40, 60, 80};

    if (arr.length > 0) {

        int sum = arr[0] + arr[arr.length - 1];

        System.err.println("Sum of the First and Last Element Of Array: "+sum);

    } else {

        System.err.println("The Array is Empty");
    
    }
}

}
