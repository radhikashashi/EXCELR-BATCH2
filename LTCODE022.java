class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class LTCODE022 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next; 
            } else {
                curr = curr.next; 
            }
        }
        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LTCODE022 sol = new LTCODE022();

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(2);
        printList(sol.deleteDuplicates(head1)); 

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(2);
        head2.next.next.next = new ListNode(3);
        head2.next.next.next.next = new ListNode(3);
        printList(sol.deleteDuplicates(head2)); 
    }
}
