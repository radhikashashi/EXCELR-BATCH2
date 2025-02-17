class LTCODE017 {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) return i + 1;
        }
        return n + 1;
    }

    public static void main(String[] args) {
        LTCODE017 sol = new LTCODE017();
        System.out.println(sol.firstMissingPositive(new int[]{1, 2, 0})); 
        System.out.println(sol.firstMissingPositive(new int[]{3, 4, -1, 1})); 
        System.out.println(sol.firstMissingPositive(new int[]{7, 8, 9, 11, 12})); 
}
}
