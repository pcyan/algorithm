/**
 * 描述:
 * 日期: 2018/4/9--17:23
 *
 * @author yanpeicai
 *
 * 多思考java中的引用
 */
public class Solution2 {

	public static void main(String[] args) {
		/*
		 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
		 * Output: 7 -> 0 -> 8
		 * Explanation: 342 + 465 = 807.
		 */

		ListNode listNode3 = new Solution2().new ListNode(3);
		ListNode listNode4 = new Solution2().new ListNode(4);
		ListNode listNode42 = new Solution2().new ListNode(4);
		ListNode listNode2 = new Solution2().new ListNode(2);
		ListNode listNode6 = new Solution2().new ListNode(6);
		ListNode listNode5 = new Solution2().new ListNode(5);

		listNode2.next = listNode4;
		listNode4.next = listNode3;
		listNode5.next = listNode6;
		listNode6.next = listNode42;

		ListNode temp = new Solution2().addTwoNumbers(listNode2, listNode5);
		printNodeValue(temp);

		System.out.println();

		ListNode temp2 = new Solution2().addTwoNumbers(new Solution2().new ListNode(5), new Solution2().new ListNode(5));
		printNodeValue(temp2);
	}

	private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode ln1 = l1, ln2 = l2, head, node;
		int carry = 0, remainder, sum;
		head = node = new ListNode(0);

		while(ln1 != null || ln2 != null || carry != 0) {
			sum = (ln1 != null ? ln1.val : 0) + (ln2 != null ? ln2.val : 0) + carry;
			carry = sum / 10;
			remainder = sum % 10;
			node = node.next = new ListNode(remainder);
			ln1 = (ln1 != null ? ln1.next : null);
			ln2 = (ln2 != null ? ln2.next : null);
		}
		return head.next;
	}

	private static void printNodeValue(ListNode temp) {
		int i=0;
		while (temp != null && i<10) {
			i++;
			System.out.print(temp.val);
			temp = temp.next;
			if (temp != null)
				System.out.print("->");
		}
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
