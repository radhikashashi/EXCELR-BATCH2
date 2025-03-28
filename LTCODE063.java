/* Number of Distinct Averages */
import java.util.*;

class LTCODE063 {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Float> distinctAverages = new HashSet<>();
        
        int a = 0, b = nums.length - 1;
        while (a < b) {
            distinctAverages.add((nums[a] + nums[b]) / 2.0f);
            a++; 
            b--;
        }
        
        return distinctAverages.size();
    }
}

