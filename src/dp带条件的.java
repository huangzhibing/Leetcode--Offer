import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class dp带条件的 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int [][] aa = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                aa[i][j] = scanner.nextInt();
            }
        }

            int[][] dp = new int[m + 1][n + 1];
            dp[m][n] = 1;
            for (int i = m - 1; i >= 0; i--) {
                for (int j = n - 1; j >= 0; j--) {
                    dp[i][j] = Math.max(1, Math.min(dp[i + 1][j], dp[i][j + 1]) - aa[i][j]);
                }
            }
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }



    }
}
