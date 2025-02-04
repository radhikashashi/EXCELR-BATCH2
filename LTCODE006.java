public class LTCODE006 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        LTCODE006 solution = new LTCODE006();
        
        int[] nums1 = {1, 1, 2};
        int k1 = solution.removeDuplicates(nums1);
        System.out.println("k = " + k1 + ", nums = " + arrayToString(nums1, k1)); 

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("k = " + k2 + ", nums = " + arrayToString(nums2, k2)); 
    }

    private static String arrayToString(int[] nums, int k) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < k; i++) {
            sb.append(nums[i]);
            if (i < k - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}