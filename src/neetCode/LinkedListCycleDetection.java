package neetCode;

// https://neetcode.io/problems/linked-list-cycle-detection?list=neetcode150

public class LinkedListCycleDetection {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass()) return false;
            ListNode listNode = (ListNode) obj;
            return val == listNode.val;
        }
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = listNode.next;
        System.out.println("true == " + hasCycle(listNode));

        listNode = new ListNode(1, new ListNode(2));
        System.out.println("false == " + hasCycle(listNode));
    }

}
