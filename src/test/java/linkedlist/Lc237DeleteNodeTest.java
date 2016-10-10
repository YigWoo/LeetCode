package linkedlist;

import org.junit.Test;

public class Lc237DeleteNodeTest {
	private Lc237DeleteNode sut = new Lc237DeleteNode();

	@Test
	public void deleteNode() throws Exception {
		ListNode listNode = TestUtil.createListNode(4);

		sut.deleteNode(listNode.next.next);

		TestUtil.printListNode(listNode);
	}

}