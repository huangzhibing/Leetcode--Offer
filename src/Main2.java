//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int Num = scanner.nextInt();
//        int M = scanner.nextInt();
//        int[] A = new int[Num];
//        for(int i=0;i<Num;i++){
//            A[i] = scanner.nextInt();
//        }
//
//        int temp = 0;
//        for(int i = 0 ; i < Num-1; i ++)
//        {
//            for(int j = 0 ;j < Num-1-i ; j++)
//            {
//                if(A[j] > A[j+1])  //交换两数位置
//                {
//                    temp = A[j];
//                    A[j] = A[j+1];
//                    A[j+1] = temp;
//                }
//            }
//        }
//
//        int[] B = new int[Num/2+1];
//        if(Num/2 == M){ //全排
//            for(int i=0;i<Num/2;i++){
//                B[i] = A[i] + A[Num-i-1];
//            }
//        }else {
//            for(int i=0;i<Num/2;i++){
//                B[i] = A[i] + A[Num-3];
//            }
////            B[Num/2] = A[Num-1];
//        }
//
//        int[] B = new int[Num/2+1];
//        if(Num%2 == 0){ //偶数
//            for(int i=0;i<Num/2;i++){
//                B[i] = A[i] + A[Num-i-1];
//            }
//        }else {
//            for(int i=0;i<Num/2;i++){
//                B[i] = A[i] + A[Num-i-2];
//            }
////            B[Num/2] = A[Num-1];
//        }
//
//        Arrays.sort(B);
//        System.out.println(B[B.length-1]);
//    }
//}
