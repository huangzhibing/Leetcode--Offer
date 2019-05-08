import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.*;

public class Main30 {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static String calculate(int m, int k) {
        ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();
        map.put(0,1);
        map.put(4,1);
        int count = 0;  //计时
        while (count<m){
            for(int nn : map.keySet()){
                if(nn < 4) {
                    int value = map.get(nn);
                    map.remove(nn);
                    map.put(nn + 1, value);
                }
            }

            int time = map.get(4);
            if(time >=1 ){
                for(int n=0;n<time;n++){
                    map.put(0,map.get(0)+1);
                }
            }

            count++;
        }
        return null;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] line = in.nextLine().split(",");
        int m = Integer.valueOf(line[0]);
        int k = Integer.valueOf(line[1]);;
        System.out.println(calculate(m, k));

    }
}