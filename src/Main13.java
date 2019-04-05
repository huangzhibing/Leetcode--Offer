import java.lang.reflect.Array;
import java.util.*;

public class Main13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        StringBuilder str = null;
        for(int i=0;i<N;i++){
           str = new StringBuilder();
           String source = scanner.next();
           boolean p = false,pp = false;
           char pre = ' ';

           for(int j=0;j<source.length();j++){  //无论是对哪种情况的判断，在当前这个值的判断总是直接写在if里面，而两个p只是用来记录前面的状态而已。
               if(p == true&&source.charAt(j) == pre){
                    continue;
               }else if(p == false&&pp == true&&source.charAt(j) == pre){
                    continue;
               }else {
                   pp = p;  //!!把上一次的状态存了，如果上一次是true，那么AABB，在第一个B的时候的状态会是p=flase,pp=true
                   if(pre == source.charAt(j)){
                       p = true;
                   }else {
                       p = false;
                   }
                   pre = source.charAt(j);
                   str.append(source.charAt(j));
               }
           }
           System.out.println(str);
        }

    }
}
