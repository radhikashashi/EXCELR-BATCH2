/* Daily Temperatures */
import java.util.ArrayDeque;

class LTCODE059 {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int res[] = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && temp[i]>= temp[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i] = 0;
            }
            else{
                res[i] = stack.peek() - i;

            }
            stack.push(i);
        }

        return res;

        
    }
}