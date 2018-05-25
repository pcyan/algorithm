/**
 * 描述:
 * 日期: 2018/4/15--15:55
 *
 * @author yanpeicai
 */
public class Solution141 {

	public static void main(String[] args) {

		Solution141 solution = new Solution141();

		ListNode listNode1 = solution.new ListNode(1);
		ListNode listNode2 = solution.new ListNode(2);
		ListNode listNode3 = solution.new ListNode(3);
		ListNode listNode4 = solution.new ListNode(4);
		ListNode listNode5 = solution.new ListNode(5);


		listNode1.next = solution.new ListNode(1);
		;
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode2;
		listNode5.next = listNode1;

		System.out.println(solution.hasCycle(listNode1));
	}

	public boolean hasCycle(ListNode head) {
		if(head==null){
			return false;
		}
		ListNode walker = head;
		ListNode runner = head;

		while(walker!=null && runner.next!=null ){
			if(walker==runner.next){
				return true;
			}

		}

		return false;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
