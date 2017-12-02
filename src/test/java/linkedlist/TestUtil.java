package linkedlist;

import common.ListNode;

class TestUtil {
	static void printListNode(ListNode head) {
		while (head != null) {
			System.out.print(head.val + "->");
			head = head.next;
		}
		System.out.println("null");
	}

	static ListNode createListNode(int n) {
		if (n == 0) return null;

		ListNode head = new ListNode(1);
		ListNode current = head;
		for (int i = 2; i <= n; i++) {
			current.next = new ListNode(i);
			current = current.next;
		}
		return head;
	}
}
