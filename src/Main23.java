import javax.sound.midi.Soundbank;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Queue<Integer> queue =  new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            queue.add(i+1);
        }

        int count = 0;
        while (queue.size() >1 ) {
            Integer integer = queue.poll();
            count++;
            if (count % m == 0) {
                System.out.print(integer+" ");
            }else {
                queue.add(integer);
            }
        }
        System.out.println();
        System.out.println(queue.poll());
    }
}
