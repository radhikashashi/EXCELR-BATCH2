class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class LTCODE020 {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head, second = head, temp = head;

        
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

       
        ListNode fast = first;
        while (fast.next != null) {
            second = second.next;
            fast = fast.next;
        }

        
        int tempVal = first.val;
        first.val = second.val;
        second.val = tempVal;

        return head;
    }
}
