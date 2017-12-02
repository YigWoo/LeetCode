package sort;

import common.ListNode;
import common.ListNodeUtil;

import java.util.Arrays;
import java.util.List;

public class Lc148SortList {
    private static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }

        // 初始化 minNode
        ListNode minNode = head;

        ListNode current = head;
        while (current.next != null) {
            if (current.val < minNode.val) {
                minNode = current;
            }
            current = current.next;
        }

        return current;
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 6, 7, 2, 3);
        ListNode listNode = ListNodeUtil.createListNode(integers);
        ListNodeUtil.printListNode(listNode);
    }
}
