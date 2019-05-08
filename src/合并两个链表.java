import java.util.ArrayList;
import java.util.HashMap;

public class 合并两个链表 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                head = l1;
                l1 = l1.next;
                head = head.next;
            }else{
                head = l2;
                l2 = l2.next;
                head = head.next;
            }
        }
        //当有一个链表为空时直接把接到尾巴
        if(l1 == null){
            head.next = l2;
        }else{
            head.next = l1;
        }
        return head;
    }
    public static void main(String[] args) {

        System.out.println();
    }
}