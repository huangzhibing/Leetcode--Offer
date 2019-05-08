
import java.util.Scanner;
import java.util.HashMap;
public class 用Hash找出字符串最多次的字母 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
            HashMap<Character,Integer> map = new HashMap<>();
        int count = 1;
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))) {
                map.put(Character.valueOf(str.charAt(i)),map.get(str.charAt(i))+1);
            }else {
                map.put(Character.valueOf(str.charAt(i)), 1);
            }
        }

        int max = 0;
        char result = ' ';

        //hashmap的遍历
        for(Character c:map.keySet()){
            if(map.get(c) > max){
                max = map.get(c);
                result = c;
            }
        }

        System.out.println(result);

//        int count = 0;
//        int kk = num;
//        if(arr[num-1]+arr[0] <= weight){
//            while (true){
//                if(arr[kk-1]+arr[kk-2] > weight){
//                    count+=2;
//                    kk-=2;
//                }else {
//                    break;
//                }
//            }
//        }
//        num = kk;
//        if(num%2 == 0){
//            for(int j=0;j<=num/2-1;j++){
//                if(arr[j]+arr[num-j-1] <= weight){
//                    count+=1;
//                }else {
//                    count+=2;
//                }
//            }
//        }else {
//            for(int j=0;j<=num/2;j++){
//                if(j == num/2){
//                    count+=1;
//                    break;
//                }
//                if(arr[j]+arr[num-j-1] <= weight){
//                    count+=1;
//                }else {
//                    count+=2;
//                }
//            }
//        }
//        System.out.println(count);
    }
}
