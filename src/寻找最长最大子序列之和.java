import java.util.Scanner;

public class 寻找最长最大子序列之和 {
    /**
     * 求解思路：在算法一和算法二中，我们一直在用两个变量来标识遍历数组
     *  j代表当前序列的重点，i代表当前序列的起点
     *  如果我们只是单纯的想知道最大连续子序列的和，而不想知道最佳连续子序列的起点和终点的话
     *  那么这个i是完全可以被优化掉的
     * 时间复杂度：O(N)
     * 这个算法就是我们经常采用的算法之一，但是有遗憾的是没办法标识最佳连续子序列的位置
     */
    public static int maxSubSum4(int[] a) {
        int maxSum = 0;
        int tempSum = 0;

        for (int i = 0; i < a.length; i++) {
            tempSum += a[i];

            if (tempSum > maxSum)
                maxSum = tempSum;
            else if (tempSum < 0)
                tempSum = 0;
        }
        return maxSum;
    }

    /**
     * 求解思路：用sum(j)表示a1到aj的和，很容易求出动态规划的递归式：
     *  sum(j) = max(sum(j-1)+aj , aj)
     * 时间复杂度：O(N)
     * 动态规划的好处在于，能很清楚的返回最佳连续子序列和的起始位置和终点位置
     *
     */
    public static int maxSubSum5(int[] a) {
        int maxSum = 0;
        int tempSum = 0;
        int begin = 0;

        for (int i = 0; i < a.length; i++) {
            if (tempSum > 0)
                tempSum += a[i];
            else {
                tempSum = a[i];
                begin = i;  //标记
            }

            if (tempSum > maxSum) {
                maxSum = tempSum;
                //可以在这里获取最佳连续子序列和的起点位置begin和重点位置i
            }

        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for(int i=0;i<N;i++){
            a[i] = scanner.nextInt();
        }

        int minSum = 0;

        //暴力法
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int thisSum = 0;

                for (int k = i; k <= j; k++)
                    thisSum += a[k];

                if (thisSum < minSum) {
                    minSum = thisSum;
                }
            }

        }
        System.out.println(minSum);
    }
}
