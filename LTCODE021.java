import java.util.Arrays;

class LTCODE021 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; 
        
        reverse(nums, 0, n - 1);    
        reverse(nums, 0, k - 1);    
        reverse(nums, k, n - 1);    
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }

    public static void main(String[] args) {
        LTCODE021 sol = new LTCODE021();
        
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        sol.rotate(nums1, 3);
        System.out.println(Arrays.toString(nums1)); 

        int[] nums2 = {-1, -100, 3, 99};
        sol.rotate(nums2, 2);
        System.out.println(Arrays.toString(nums2)); 
    }
}
