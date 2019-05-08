
import com.sun.deploy.util.StringUtils;

import java.awt.geom.FlatteningPathIterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class 相邻消消乐 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Stack<Integer> stack1 = new Stack();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        String str = scanner.next();
        for(int i=0;i<str.length();i++){
            linkedList.add(str.charAt(i) - '0');
        }

        int flag = 0;
        while (!linkedList.isEmpty()) {
            if(stack1.isEmpty()){
                stack1.push(linkedList.pop());
            }
            if(linkedList.get(0)==0&&stack1.peek()==1||linkedList.get(0) == 1&&stack1.peek()==0){
                stack1.pop();
                linkedList.pop();
            }else {
                stack1.push(linkedList.pop());
            }
        }

        System.out.println(stack1.size());
    }
}
