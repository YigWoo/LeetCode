package common;

import java.util.List;

public class ListNodeUtil {
    public static void printListNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static ListNode createListNode(int n) {
        if (n == 0) return null;

        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 2; i <= n; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        return head;
    }

    public static ListNode createListNode(List<Integer> values) {
        if (values == null || values.size() == 0) {
            return null;
        }

        ListNode head = new ListNode(values.get(0));
        ListNode current = head;

        for (int i = 1; i < values.size(); i++) {
            current.next = new ListNode(values.get(i));
            current = current.next;
        }
        return head;
    }
}
