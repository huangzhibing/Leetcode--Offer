import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long longint = scanner.nextLong();
        List<Character> list = null;
        int count = 0;
        int a,b,c,d;
        a = b = c = d =0;
        for(long i=0;i<=longint;i++){
            list = new ArrayList<Character>();
            String str = String.valueOf(i);
            for(int j=0;j<str.length();j++){
                list.add(str.charAt(j));
            }
            if(list.contains('2')&&list.contains('0')&&list.contains('1')&&list.contains('8')){
                for(int n=0;n<list.size();n++){
                    if('2' == list.get(n)){
                        a = n;
                    }else if('0' == list.get(n)){
                        b = n;
                    }else if('1' == list.get(n)){
                        c = n;
                    }else if('8' == list.get(n)){
                        d = n;
                    }
                }
                if(a<b&&b<c&&c<d){
                    count++;
                }
            }

        }
        System.out.println(count);

    }
}
