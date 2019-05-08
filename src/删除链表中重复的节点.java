
public class 删除链表中重复的节点 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplication(ListNode pHead)
    {

        if(pHead == null||pHead.next == null){
            return pHead;
        }else {
            ListNode pre,p,next,head;
            head = new ListNode(-1);
            head.next = pHead;
            pre = head;
            p = pHead;
            next = null;
            while (p!=null && p.next!=null){
                next = p.next;
                if(p.val == next.val){      //找到重复的之后就不断向后找
                    while (next!=null&&next.val == p.val){
                        next = next.next;
                    }
                    pre.next = next;
                    p = next;   //p下移
                }else {
                    pre = p;
                    p = next;
                }
            }

            return head.next;

        }

    }
}
