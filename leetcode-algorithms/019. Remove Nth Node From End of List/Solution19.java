/**
 * 描述:
 * 日期: 2018/4/15--14:41
 * <p>
 * Given linked list: 1->2->3->4->5, and n = 2.
 * <p>
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 *
 * @author yanpeicai
 */
public class Solution19 {


	public static void main(String[] args) {
		Solution19 solution = new Solution19();


		ListNode listNode1 = solution.new ListNode(1);
		ListNode listNode2 = solution.new ListNode(2);
		ListNode listNode3 = solution.new ListNode(3);
		ListNode listNode4 = solution.new ListNode(4);
		ListNode listNode5 = solution.new ListNode(5);


//		listNode1.next = listNode2;
//		listNode2.next = listNode3;
//		listNode3.next = listNode4;
//		listNode4.next = listNode5;

		printNodeValue(listNode1);
		ListNode result = solution.removeNthFromEnd(listNode1, 1);
		printNodeValue(result);
	}

	private ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode start=new ListNode(0), fast, slow;
		start.next = head;
		fast = slow = start;

		/*
		 * 利用快慢差来找到倒数第n个
		 */
		while (fast.next != null) {
			if (n <= 0) {
				slow = slow.next;
			}
			fast = fast.next;
			n--;
		}
		if (slow.next != null) {
			slow.next = slow.next.next;
		}
		return start.next;

	}


	@SuppressWarnings("Duplicates")
	private static void printNodeValue(ListNode temp) {
		int i = 0;
		while (temp != null && i < 10) {
			i++;
			System.out.print(temp.val);
			temp = temp.next;
			if (temp != null)
				System.out.print("->");
		}
		System.out.println();
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}