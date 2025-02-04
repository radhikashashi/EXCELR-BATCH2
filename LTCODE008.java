public class LTCODE008 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1; nums1 = nums2; nums2 = temp;
        }
        int m = nums1.length, n = nums2.length, left = 0, right = m;
        while (left <= right) {
            int p1 = (left + right) / 2, p2 = (m + n + 1) / 2 - p1;
            int maxLeft1 = (p1 == 0) ? Integer.MIN_VALUE : nums1[p1 - 1], minRight1 = (p1 == m) ? Integer.MAX_VALUE : nums1[p1];
            int maxLeft2 = (p2 == 0) ? Integer.MIN_VALUE : nums2[p2 - 1], minRight2 = (p2 == n) ? Integer.MAX_VALUE : nums2[p2];
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                return (m + n) % 2 == 0 ? (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0 : Math.max(maxLeft1, maxLeft2);
            } else if (maxLeft1 > minRight2) {
                right = p1 - 1;
            } else {
                left = p1 + 1;
            }
        }
        throw new IllegalArgumentException("Input arrays are not sorted.");
    }
    
    public static void main(String[] args) {
        LTCODE008 sol = new LTCODE008();
        System.out.println(sol.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));  // 2.0
        System.out.println(sol.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4})); // 2.5
    }
}
