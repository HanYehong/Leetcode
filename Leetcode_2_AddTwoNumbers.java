/**
 * @author HanYehong
 *
 * @date 2018.12.30
 */

/**
 * @description
 * 给出两个非空的链表用来表示两个非负的整数。
 * 其中，它们各自的位数是按照逆序的方式存储的，并且它们的每个节点只能存储一位数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class Leetcode_2_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode reNode = new ListNode( 0 );
        ListNode head = reNode;
        int c = 0; // 进位
        while(l1 != null || l2 != null){
            int l1_value = l1 != null ? l1.val : 0;
            int l2_value = l2 != null ? l2.val : 0;
            int temp = l1_value + l2_value + c;
            reNode.next = new ListNode(temp % 10);
            c = temp / 10;
            reNode = reNode.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        if(c > 0){
            reNode.next = new ListNode(1);
        }
        return head.next;
    }

}