import javax.xml.stream.events.Characters;
import java.util.*;

public class 求两个整数二进制格式有多少个位不同 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aa = scanner.nextInt();
        int bb = scanner.nextInt();
        String sta = Integer.toBinaryString(aa);
        String stb = Integer.toBinaryString(bb);
        char[] arra = sta.toCharArray();
        char[] arrb = stb.toCharArray();
        List<Character> aList = new ArrayList<Character>();
        List<Character> bList = new ArrayList<Character>();
        int count = 0;
        for(int i=0;i<arra.length;i++){
            aList.add(arra[i]);
        }
        for(int i=0;i<arrb.length;i++){
            bList.add(arrb[i]);
        }
        Collections.reverse(aList);
        Collections.reverse(bList);

        for(int i=0;i<arra.length;i++){
            arra[i] = aList.get(i);
        }
        for(int i=0;i<arrb.length;i++){
            arrb[i] = bList.get(i);
        }

        if (arra.length<arrb.length){
            for(int i=0;i<arra.length;i++){
                if(arra[i] != arrb[i]){
                    count ++;
                }
            }
            for(int i=arra.length;i<arrb.length;i++){
                if(arrb[i] != '0'){
                    count++;
                }
            }
        }else if(arra.length>arrb.length){
            for(int i=0;i<arrb.length;i++) {
                if (arrb[i] != arra[i]) {
                    count++;
                }
            }
            for(int i=arrb.length-1;i<arra.length;i++){
                if(arra[i] != '0'){
                    count++;
                }
            }
        }else {
            for(int i=0;i<arra.length;i++){
                if(arrb[i] != arra[i]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
