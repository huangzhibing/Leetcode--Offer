package sort;

public class Bubblensort {
    public static void bubbleSort(int[] number){
        int temp = 0;
        for(int i=0;i<number.length-1;i++){
            for(int j=0;j<number.length-1-i;j++){
                if(number[j]>number[j+1]){
                    temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
        }
    }
}
