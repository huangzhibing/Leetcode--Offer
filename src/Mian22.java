import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mian22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0;i<n;i++){
            list.add(scanner.nextInt());
        }

        int count = 0;
        for(int i=0;i<n;i++){
            int key = list.get(i);
            if (key == 1) {
                System.out.println(0);
            }
            while (key != 1) {
                if(key == 0){
                    System.out.println(-1);
                }
                if (key % 2 != 0) {
                    key = 3 * key + 1;
                    count++;
                } else if (key % 2 == 0) {
                    key = key / 2;
                    count++;
                }
                if (key == 1) {
                    System.out.println(count);
                    count = 0;
                }
            }
        }

    }
}
