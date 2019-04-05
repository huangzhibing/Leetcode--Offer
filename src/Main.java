import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    int aaaa = 0;


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        float[] posibility = new float[n];
//        float[] x = new float[n];
//
//        for(int i=0;i<n;i++){
//            x[i] = scanner.nextFloat();
//            posibility[i] = scanner.nextFloat()/100;
//        }
//        float E = 0;
//        for(int i=0;i<x.length;i++){
//            E += x[i]*posibility[i];
//        }
//        String formatE = String.format("%.03f",E);
//        System.out.println(formatE);

        Scanner scanner = new Scanner(System.in);
        float L = scanner.nextFloat();
        float R = scanner.nextFloat();
        double x = R*Math.cos(L/R);
        double y = R*Math.sin(L/R);
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(x)+" "+df.format(-y));
        System.out.println(df.format(x)+" "+df.format(y));
    }
}
