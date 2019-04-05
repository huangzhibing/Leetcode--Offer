import java.util.Scanner;

public class Main1{
    public static void main(String[] args) {
        char[][] juzhen = new char[3][3];
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            for (int i = 0; i < 3; i++) {
                String s = scanner.next();
                for (int j = 0; j < 3; j++) {
                    juzhen[i][j] = s.charAt(j);
                }
            }
            boolean flag = true;
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(juzhen[i][j] == juzhen[2-i][2-j]){
                        flag = true;
                    }else {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag == true){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }


    }
}
