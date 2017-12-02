package linkedlist;

import common.ListNode;
import org.junit.Test;

public class Lc206ReverseLinkedListTest {

    private Lc206ReverseLinkedList sut = new Lc206ReverseLinkedList();

    @Test
    public void reverseList() throws Exception {
        ListNode head = TestUtil.createListNode(5);

        ListNode list = sut.reverseList(head);
        TestUtil.printListNode(list);
    }

}