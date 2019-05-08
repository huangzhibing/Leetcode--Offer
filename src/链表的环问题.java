
import java.util.LinkedList;
import java.util.Scanner;

public class 链表的环问题 {
    public static class LinkNode{
        private String data;
        private LinkNode next;
        LinkNode(){}
        LinkNode(String data){
            this.data = data;
            this.next = null;
        }
    }
    //检查是否有环
    public static boolean checkLoop(LinkNode linkNode){
        LinkNode slow,fast;
        slow = fast = linkNode;
        while (fast != null && fast.next != null) {   //当链表长度是奇数和偶数的时候
            slow = linkNode.next;
            fast = linkNode.next.next;
            if(slow.data == fast.data){
                return true;
            }
        }
        if(fast == null||fast.next == null){
            return false;
        }
        return false;
    }
    //计算环的长度
    public static int loopLength(LinkNode linkNode){
        if(!checkLoop(linkNode)){
            return 0;
        }
        LinkNode slow,fast;
        slow = fast = linkNode;
        int length = 0;
        boolean begin = false;
        while (fast != null&&fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow.data == fast.data && begin == true){    //第二次相遇刚好快指针多走了一圈
                break;
            }
            if(slow.data == fast.data && begin == false){   //第一次相遇开始计时
                begin = true;
            }
            if(begin == true){
                length++;
            }

        }
        return length;
    }
    //找到相遇的点
    public static LinkNode findNode(LinkNode linkNode){
        LinkNode slow,fast;
        slow = fast = linkNode;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow.data == fast.data){
                break;
            }
        }
        if(fast == null || fast.next == null){
            return null;
        }
        slow = linkNode;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.next().split(",");
        LinkNode head = new LinkNode();
        LinkNode ent = head;
        for(int i=0;i<str.length;i++){      //尾插法（链表和输入顺序相同）
            LinkNode linkNode = new LinkNode(str[i]);
            ent.next = linkNode;    //先把linknode接到ent后面
            ent = linkNode;         //再把ent往后移一位
        }

        for(int i=0;i<str.length;i++){      //头插法（链表和输入顺序相反）
            LinkNode linkNode = new LinkNode(str[i]);
            linkNode.next = head.next;      //先把新来的尾巴接到头的后面
            head.next = linkNode;           //再把头的下一个指向新来的
        }
    }
}
