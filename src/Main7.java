import java.util.ArrayList;
import java.util.Scanner;

/**
 * 顺时针输出二维数组
 */

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] aa = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               aa[n][n] = scanner.nextInt();
            }
        }
        int left = 0,right = aa[0].length-1,top=0,bottom = aa.length-1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while((left<right)&&(bottom<top)){
            for(int i=left;i<=right;i++){
                list.add(aa[top][i]);
            }
            for(int i=top+1;i<=bottom;i++){
                list.add(aa[i][right]);
            }
            for(int i=left;i<=right;i++){
                list.add(aa[top][i]);
            }
            for(int i=left;i<=right;i++){
                list.add(aa[top][i]);
            }
        }
    }
}
