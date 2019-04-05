import javax.xml.crypto.Data;
import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int count = 0;  //次数
        int count2 = 0;
        int result = 0;
        List<Integer> point = new ArrayList<>();   //记录每种颜色出现的下标
        int[] list = new int[n];
        List<Integer> list2 = new ArrayList<>();

        for(int i=0;i<n;i++){
            list[i] = scanner.nextInt();
        }
        long startTime = System.currentTimeMillis();
//        Arrays.asList(list);
        for(int i=0;i<n;i++){
            if(list2.contains(list[i])){
                count--;
            }
            list2.add(list[i]);
            count++;
            if(count == m){
                for(int j=list2.size()-1;j>=0;j--){
                    if(point.contains(list2.get(j))){
                        count2--;
                    }
                    result++;
                    point.add(list2.get(j));
                    count2++;
                    if(count2 == m){
                        System.out.println(result);
                        long endTime = System.currentTimeMillis();
                        System.out.println((endTime-startTime));
                        break;
                    }
                }
                break;
            }
            if(i == n-1){
                System.out.println(-1);
            }
        }

    }
}
