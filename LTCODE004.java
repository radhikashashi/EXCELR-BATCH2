class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }

    
    public static ListNode deserialize(String data) {
        if (data == null || data.isEmpty()) {
            return null;
        }
        String[] values = data.split(",");
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        for (String value : values) {
            current.next = new ListNode(Integer.parseInt(value.trim()));
            current = current.next;
        }
        return dummyHead.next;
    }
}

public class LTCODE004 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, current = dummyHead;
        int carry = 0;
        
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        
        return dummyHead.next;
    }

    public static void main(String[] args) {
        LTCODE004 solution = new LTCODE004();
        
     
        ListNode l1 = ListNode.deserialize("2,4,3");
        ListNode l2 = ListNode.deserialize("5,6,4");
        ListNode result1 = solution.addTwoNumbers(l1, l2);
        printList(result1); 
        
       
        ListNode l3 = ListNode.deserialize("0");
        ListNode l4 = ListNode.deserialize("0");
        ListNode result2 = solution.addTwoNumbers(l3, l4);
        printList(result2);
        
       
        ListNode l5 = ListNode.deserialize("9,9,9,9,9,9,9");
        ListNode l6 = ListNode.deserialize("9,9,9,9");
        ListNode result3 = solution.addTwoNumbers(l5, l6);
        printList(result3); 
    }
    
    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
            if (node != null) System.out.print(" -> ");
        }
        System.out.println();
    }
}
