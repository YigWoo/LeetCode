package linkedlist;

import common.ListNode;
import common.ListNodeUtil;
import org.junit.Test;

public class Lc206ReverseLinkedListTest {

    private Lc206ReverseLinkedList sut = new Lc206ReverseLinkedList();

    @Test
    public void reverseList() throws Exception {
        ListNode head = ListNodeUtil.createListNode(5);

        ListNode list = sut.reverseList(head);
        ListNodeUtil.printListNode(list);
    }

}