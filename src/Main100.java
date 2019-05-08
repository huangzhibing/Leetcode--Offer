import java.util.Scanner;

public class Main100 {
//    static int count = 0;
//    public static int qiege(int n,int m,int[][] nm){
//
//        int mid1 = n/2;
//        int mid2 = m/2;
//        if(nm[mid1-1][mid2] == nm[mid1+1][mid2] && nm[mid1][mid2+1] == nm[mid1][mid2-1] &&nm[mid1-1][mid2] == nm[mid1][mid2-1]){
//            return 4;
//        }else if(mid1 == 0&& mid2 == 0){
//            return 0;
//        }
//        return qiege(mid1,mid2,nm);
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int m =scanner.nextInt();
        int[][] nm = new int[n][m];
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                nm[i][j] = scanner.nextInt();
            }
        }
        if(m%2 == 1){
            if(n%2 == 1){
                System.out.println((m/2+1)*(n/2+1)+(n/2)*(m/2));
            }else {
                System.out.println((m/2+m/2+1)*n/2);
            }
        }else {
            System.out.println((m/2)*n);
        }

    }

}
