package PS005;
public class PS005 {
    public static void main(String[] args) {
        int i = 1; 

        
        while (i <= 10) {
            
            if (i == 5 || i == 7) {
                i++; 
                
                continue; 
            }

            
            System.out.println(i);
            i++; 
        }
    }
}
