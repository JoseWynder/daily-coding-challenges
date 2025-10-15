package neetCode;

// https://neetcode.io/problems/merge-two-sorted-linked-lists?list=neetcode150

public class MergeTwoSortedLinkedLists {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void printNode(ListNode head) {
        System.out.print("[");
        while(head != null) {
            System.out.print(head.val + ", ");
            head = head.next;
        }
        System.out.print("null]");
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode mergeList = new ListNode();
        ListNode rootNode = mergeList;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                mergeList.next = list1;
                list1 = list1.next;
            } else {
                mergeList.next = list2;
                list2 = list2.next;
            }
            mergeList = mergeList.next;
        }

        if (list1 != null) {
            mergeList.next = list1;
        } else {
            mergeList.next = list2;
        }

        return rootNode.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(5)));
        System.out.print("[1, 1, 2, 3, 4, 5] == ");
        printNode(mergeTwoLists(list1, list2));

        list2 = new ListNode(1, new ListNode(2));
        System.out.print("\n[1, 2] == ");
        printNode(mergeTwoLists(null, list2));

        System.out.print("\n[] == ");
        printNode(mergeTwoLists(null, null));
    }
}
