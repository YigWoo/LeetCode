package linkedlist;

import common.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Lc328OddEvenLinkedListTest {

	private Lc328OddEvenLinkedList sut;

	@Before
	public void setUp() throws Exception {
		sut = new Lc328OddEvenLinkedList();
	}

	@Test
	public void generalCase() throws Exception {
		ListNode listNode = TestUtil.createListNode(5);

		ListNode res = sut.oddEvenList(listNode);

		TestUtil.printListNode(res);
	}

	@Test
	public void listNull() throws Exception {
		ListNode res = sut.oddEvenList(null);
		assertThat(res).isNull();
	}

	@Test
	public void oneNodeCase() throws Exception {
		ListNode head = new ListNode(1);

		ListNode result = sut.oddEvenList(head);

		assertThat(result).isNotNull();
		assertThat(result.val).isEqualTo(1);
	}
}