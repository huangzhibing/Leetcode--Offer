//import java.io.CharArrayReader;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main3 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        int M = scanner.nextInt();
//        int k = scanner.nextInt();
//        int[][] aa = new int[N][M];
//        for(int i=0;i<N;i++){
//            for(int j=0;j<M;j++){
//                aa[i][j] = scanner.nextInt();
//            }
//        }
//        System.out.println(N-1);
//    }
//    public int FindGreatestSumOfSubArray(int[] array) {
//        int[] list = new int[array.length];
//        int total = 0;
//        for(int i = 0; i< array.length; i++){
//            total = total + array[i];
//            list.add(total);
//        }
//        Arrays.sort(list);
//
//    }
//}
