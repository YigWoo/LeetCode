package sort;

import common.ListNode;
import common.ListNodeUtil;

import java.util.Arrays;
import java.util.List;

public class Lc148SortList {
    private static ListNode mergeSortList(ListNode head) {
        return mergeSort(head);
    }

    private static ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode fastNode = head;
        ListNode slowNode = head;
        ListNode prevNode = null;

        /* 计算 list 的中点，保存在 slowNode  */
        /* prevNode 保存 slowNode 的上一个节点 */
        while (fastNode != null && fastNode.next != null) {
            prevNode = slowNode;
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        prevNode.next = null;

        ListNode first = mergeSort(head);
        ListNode second = mergeSort(slowNode);

        return merge(first, second);
    }

    private static ListNode merge(ListNode first, ListNode second) {
        ListNode result = new ListNode(0); // dummy node
        ListNode current = result;
        while (first != null && second != null) {
            if (first.val < second.val) {
                current.next = first;
                first = first.next;
            } else {
                current.next = second;
                second = second.next;
            }
            current = current.next;
        }

        if (first != null) {
            current.next = first;
        }

        if (second != null) {
            current.next = second;
        }

        return result.next;
    }

    @SuppressWarnings("unused")
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
        ListNode listNode1 = mergeSortList(listNode);
        ListNodeUtil.printListNode(listNode1);
    }
}
