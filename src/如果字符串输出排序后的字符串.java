import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class 如果字符串输出排序后的字符串 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] chars = new char[str.length()];
        for(int i=0;i<str.length();i++){
            chars[i] = str.charAt(i);
        }

        Arrays.sort(chars);

        int index=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]>='a'){
                index = i;
                break;
            }
        }
        for(int i=index;i<chars.length;i++){
            System.out.print(chars[i]);
        }
        for (int i=0;i<index;i++){
            System.out.print(chars[i]);
        }
    }
}
