import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        while(scanner.hasNext()){
            String s = scanner.next();
            int aa = Integer.parseInt(s);
            String ss = scanner.next();
            int bb = Integer.parseInt(ss);
            if(aa%2==0){   //a为偶数
                if(bb%2==0){   //b也为偶数
                    System.out.println((aa+bb)/2);
                }else {
                    System.out.println((aa-bb-1)/2);
                }
            }else {
                if(bb%2==0){   //b也为偶数
                    System.out.println((bb-aa+1)/2);
                }else {
                    System.out.println((aa+bb)/-2);
                }
            }
        }

    }
}
