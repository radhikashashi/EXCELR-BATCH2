/**
 * Definition for singly-linked list.
  */
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

class LTCODE029 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}