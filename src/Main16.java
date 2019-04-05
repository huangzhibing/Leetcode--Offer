
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stringStack = new Stack<String>();
        String s = scanner.nextLine();
        StringBuilder temp = new StringBuilder();
        StringBuilder result = new StringBuilder();

        char kk;
        for(int i=s.length()-1;i>=0;i--){
            kk = s.charAt(i);
            if(kk==' '||kk==','||kk=='.'||kk=='\''||kk=='-'){
                result.append(temp);
                result.append(kk);
                temp.delete(0,temp.length());
            }
            else {
                temp.insert(0,kk);
            }
        }
        if(!temp.equals("")){
            result.append(temp);
        }
        System.out.println(result.toString());

    }
}
