import java.util.PriorityQueue;

public class LTCODE015 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); 
            }
        }
        return minHeap.peek(); 
    }

    public static void main(String[] args) {
        LTCODE015 sol = new LTCODE015();
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        System.out.println(sol.findKthLargest(nums1, 2));

        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        System.out.println(sol.findKthLargest(nums2, 4)); 
    }
}
