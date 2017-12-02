package sort;

import common.ListNode;
import common.ListNodeUtil;

import java.util.Arrays;
import java.util.List;

public class Lc148SortList {
    private static ListNode slowSortList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode headerNode = head;

        while (headerNode != null) {
            // 初始化 minNode
            ListNode minNode = headerNode;
            ListNode currentNode = headerNode.next;

            while (currentNode != null) {
                if (currentNode.val < minNode.val) {
                    minNode = currentNode;
                }
                currentNode = currentNode.next;
            }
            // now exchange values minNode and headerNode
            if (minNode != headerNode) {
                swapVal(headerNode, minNode);
            }

            headerNode = headerNode.next;
        }

        return head;
    }

    private static void swapVal(ListNode headerNode, ListNode minNode) {
        Integer tmp = minNode.val;
        minNode.val = headerNode.val;
        headerNode.val = tmp;
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 6, 7, 2, 3);
        ListNode listNode = ListNodeUtil.createListNode(integers);
        ListNode listNode1 = slowSortList(listNode);
        ListNodeUtil.printListNode(listNode1);
    }
}
