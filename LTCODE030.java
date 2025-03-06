

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class LTCODE030{
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) { 
               
                ListNode entry = head;
                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry; 
            }
        }
        
        return null; 
    }
}
