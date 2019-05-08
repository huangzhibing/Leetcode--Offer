import java.awt.print.PrinterAbortException;
import java.util.*;

/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。(递归法)
 */

public class 递归法反向打印链表 {
    public static class ListNode {
        String val;
        ListNode next = null;
        ListNode(String val) {
            this.val = val;
        }
        ListNode(){}
    }

    static ArrayList<String> arrayList = new ArrayList<String>();
    public static ArrayList<String> printListFromTailToHead(ListNode listNode) {
        if(listNode!=null){
            printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.next().split(",");
        ListNode head = new ListNode();
        ListNode ent = head;
        for(int i=0;i<str.length;i++){
            ListNode listNode = new ListNode(str[i]);
            ent.next = listNode;
            ent = listNode;
        }
        //
        // 从第K个开始翻转
        //
        int K = scanner.nextInt();

        for(int i=0;i<K;i++){
            head = head.next;       //把指针移动到K-1号下标出
            System.out.print(str[i]+","); //把前K个打印出来
        }
        ArrayList<String> arrayList2 = new ArrayList<String>();

        arrayList2 = printListFromTailToHead(head.next);    //从第k个开始递归反转
        for(int i=0;i<arrayList2.size();i++){
            System.out.print(arrayList2.get(i)+",");
        }

    }

}
