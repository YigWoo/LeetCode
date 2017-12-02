package linkedlist;

import common.ListNode;
import common.ListNodeUtil;
import org.junit.Test;

public class Lc237DeleteNodeTest {
    private Lc237DeleteNode sut = new Lc237DeleteNode();

    @Test
    public void deleteNode() throws Exception {
        ListNode listNode = ListNodeUtil.createListNode(4);

        assert listNode != null;
        sut.deleteNode(listNode.next.next);

        ListNodeUtil.printListNode(listNode);
    }

}