package linkedlist;

import common.ListNode;

public class Lc237DeleteNode {

	/**
	 * swap the node value with next node, and delete the next node
	 * @param node node to be deleted
	 */
	public void deleteNode(ListNode node) {
		if (node == null || node.next == null) return;

		node.val = node.next.val;
		node.next = node.next.next;
	}
}
