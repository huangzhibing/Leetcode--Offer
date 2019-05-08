import sun.awt.image.ImageWatched;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class 高阶贪心算法 {

    public static int solve(int sum,int[] n){
        int ans = 0;
        for(int i=n.length-1;i>=0;i--){
            if (sum/n[i] != 0){
                ans += sum/n[i];
                sum%=n[i];
            }else {
                continue;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int type = scanner.nextInt();
        int[] n = new int[type];
        for(int i=0;i<type;i++){
            n[i] = scanner.nextInt();
        }

        Arrays.sort(n);
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        for(int j=total;j>=1;j--){

            linkedList.add(solve(j,n));
        }

        int[] aa = new int[total];
        for(int i=0;i<linkedList.size();i++){
            aa[i] = linkedList.get(i);
        }

        Arrays.sort(aa);
        System.out.println(aa[linkedList.size()-1]);
    }
}
