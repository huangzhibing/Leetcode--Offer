import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long m = scanner.nextLong();
        int flag = 1;

        while(m>n){
            m=m-n;
            flag++;
        }
        System.out.println(flag);
    }
}
