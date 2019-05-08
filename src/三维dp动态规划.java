import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class 三维dp动态规划 {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    private static int totalPrice(int categoryCount, int totalVolume, int totalWeight, int[] volume, int[] weight,
                                  int[] stock, int[] price, int[] itemType) {
        int[][][] m = new int[categoryCount+1][totalVolume+1][totalWeight+1];
        int i=0,j=0;
        int x=0,y=0;
        int k=0,max=0;
        for(x=0;x<=totalVolume;x++){
            for(y=0;y<=totalWeight;y++){
                if ((x / volume[1] > 0) && (y / weight[1] > 0))
                {
                    m[1][x][y] = min(x / volume[1], y / weight[1]) * price[1];//重量和体积都满足的情况的个数,乘以价值等于m[1][x][y]取最大值
                }
                else
                {
                    m[1][x][y] = 0;
                }
            }
        }
        for(i=2;i<=categoryCount;i++)
        {
            for (x = 0; x <= totalVolume; x++)
            {
                for (y = 0; y <= totalWeight; y++)
                {
                    max = m[i - 1][totalVolume][totalWeight];
                    if ((x >= volume[i]) && (y >= weight[i]))
                    {
                        for (k = 0; k <= min(x / volume[i], y / weight[i]); k++)
                        {
                            if ((m[i - 1][x - k * volume[i]][y - k * weight[i]] + k * price[i]) > max)
                            {
                                max = (m[i - 1][x - k * volume[i]][y - k * weight[i]] + k * price[i]);
                            }
                        }
                        m[i][x][y] = max;
                    }
                    else
                    {
                        m[i][x][y] = m[i - 1][x][y];
                    }
                }
            }
        }

        return m[categoryCount][totalVolume][totalWeight];

    }
    public static int min(int a,int b) {
        int m;
        m = a;
        if (b < a)
            m = b;
        return m;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] line = in.nextLine().split(",");
        //总共商品种类
        int categoryCount = Integer.valueOf(line[0]);
        //快递体积
        int totalVolume = Integer.valueOf(line[1]);
        //快递重量
        int totalWeight = Integer.valueOf(line[2]);

        //物品体积
        int[] volume = new int[50];
        //重量
        int[] weight = new int[50];
        //件数
        int[] stock = new int[50];
        //价格
        int[] price = new int[50];
        //类型
        int[] itemType = new int[50];

        for (int i = 1; i <= categoryCount; i++) {
            line = in.nextLine().split(",");
            volume[i] = Integer.valueOf(line[0]);
            weight[i] = Integer.valueOf(line[1]);
            stock[i] = Integer.valueOf(line[2]);
            price[i] = Integer.valueOf(line[3]);
            itemType[i] = Integer.valueOf(line[4]);
        }

        in.close();

        System.out.println(totalPrice(categoryCount, totalVolume, totalWeight, volume, weight, stock, price, itemType));

    }
}
