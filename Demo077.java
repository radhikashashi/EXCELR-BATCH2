
import java.util.Arrays;

public class Demo077{

    public static void main(String[] args) {
        
        int [] originalArray = {100, 200, 300, 400, 500, 600} ;

        int [] copiedArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
        
            copiedArray[i] = originalArray[i];
        }

        System.err.println("Original Array: "+ Arrays.toString(originalArray));

        System.err.println("Copied Array: "+ Arrays.toString(copiedArray));

    }
}