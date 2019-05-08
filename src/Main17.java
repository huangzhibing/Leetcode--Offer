import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        double[] aa = new double[2*n];

        for(int i=0;i<n;i++){
            aa[i] = scanner.nextDouble();
        }

        Arrays.sort(aa);

        double total = 0;
        double nantotal = n*aa[n];
        double nvtotal = n*(aa[n]/2.0);
        total = nantotal+nvtotal;

        DecimalFormat df = new DecimalFormat("#.000000");
        System.out.println(df.format(total));
    }
}
