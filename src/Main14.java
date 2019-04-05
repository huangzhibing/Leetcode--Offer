import java.text.DecimalFormat;
import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[][] nn1 = new int[n][100000];
//        for(int j=0;j<n;j++) {
//            int nn = scanner.nextInt();
//            for (int i = 0; i < nn; i++) {
//                nn1[n][i] = scanner.nextInt();
//            }
//        }
//
//        System.out.println(n+1);
//        System.out.println(4*n);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] Li = new int[N];
        for(int i=0;i<N;i++){
            Li[i] = scanner.nextInt();
        }
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(N-0.5));
    }
}
