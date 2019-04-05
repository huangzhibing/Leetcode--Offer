package sort;

import javafx.beans.binding.NumberBinding;

public class QuickSort {
    public static int getMiddle(int[] number,int low,int high){
        int temp = number[low]; //把枢轴先拿出来
        while(low<high) {
            while (number[high] > temp) {
                high--;
            }
            number[low] = number[high];     //比枢轴小的移到枢轴的位置
            while (number[low] < temp) {
                low++;
            }
            number[high] = number[low];     //比枢轴大的就去补上刚刚那个空位
        }
        number[low] = temp;     //结束的时候枢轴给上个代码段的把尾巴
        return low;
        }

        public static void quickSort(int[] number,int low,int high){
            if(low<high){
                int middle = getMiddle(number,low,high);    //将number数组整理后一分为二
                quickSort(number,low,middle-1);
                quickSort(number,middle+1,high);
            }
        }
        public static void quickMain(int[] number){
            if(number.length > 0){
                quickSort(number,0,number.length-1);
            }
        }
    }
