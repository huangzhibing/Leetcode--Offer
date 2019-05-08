import sun.java2d.SurfaceDataProxy;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int test = n;

        for(int i=0;i<=n-6;i++){
            int kk = 0;
            kk = n%test;
            count += kk;
            test--;
        }
        if(n>=12){
            int bb = n/6;
            count = count*bb;
        }
        System.out.println(count+1);
    }

}
