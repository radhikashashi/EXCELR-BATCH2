import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class LTCODE031 {
    public ListNode removeNodes(ListNode head, int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num); 
        }
        
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        
        while (current.next != null) {
            if (set.contains(current.next.val)) {
                current.next = current.next.next; 
            } else {
                current = current.next;
            }
        }
        
        return dummy.next;
    }
}
