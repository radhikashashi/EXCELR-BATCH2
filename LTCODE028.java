

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class LTCODE028 {
    public boolean isPalindrome(ListNode head) {
         ListNode prevHead=null;
    ListNode p=head;
    while(head !=null)
    {
        ListNode recordNext=head.next;
        head.next=prevHead;
        prevHead=head;
        head=recordNext;
    }
    while(prevHead!=null && p!=null)
    {
        if(prevHead.val!= p.val)
        return false;
        prevHead=prevHead.next;
        p=p.next;
    }

    return true;
}
    }
