import com.sun.istack.internal.NotNull;

public class Main {

    public static void main(String[] args) {


        int[] a = {2, 4, 3};
        int[] b = {5, 6, 4};

        ListNode aListNote = createListNote(a);
        ListNode bListNote = createListNote(b);

        Solution solution = new Solution();

        ListNode result = solution.addTwoNumbers(aListNote, bListNote);

        printListNode(aListNote);
        printListNode(bListNote);
        printListNode(result);
    }

    private static void printListNode(@NotNull ListNode listNode){
        System.out.print("[ ");
        while (listNode!=null){
            System.out.print(listNode.val+" ");
            listNode=listNode.next;
        }
        System.out.print("]");
        System.out.println();
    }

    private static ListNode createListNote(int[] num) {
        ListNode head=null;
        ListNode pre=null;
        for (int aNum : num) {
            ListNode current = new ListNode(aNum);
            if (pre == null) {
                pre = current;
                head = current;
            } else {
                pre.next = current;
                pre = current;
            }
        }
        return head;
    }


}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 *
 * 难点在于进位和null值的处理
 * 进位记录
 * null值=0
 *
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return null;
    }
}
