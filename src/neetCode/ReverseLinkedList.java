package neetCode;

// https://neetcode.io/problems/reverse-a-linked-list?list=neetcode150

public class ReverseLinkedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void printListNode(ListNode head) {
        System.out.print("[");
        for (ListNode current = head; current != null; current = current.next) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        while(current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3))));
        System.out.print("[3, 2, 1, 0] == ");
        printListNode(reverseList(listNode));

        listNode = null;
        System.out.print("[] == ");
        printListNode(reverseList(listNode));
    }
}
