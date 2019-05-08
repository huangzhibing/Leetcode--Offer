public class 青蛙跳台阶 {

    //基数排序找重复
    public int find(int arr[],int n){
        for(int i=0;i<n;i++){
            while(i!=arr[i]){
                if(arr[i] == arr[arr[i]]){
                    return arr[i];
                }
                Swap(arr[i],arr[arr[i]]);
            }
        }
        return 0;
    }
    public void Swap(int x,int y){
        int temp;
        temp = x;
        x = y;
        y = temp;
    }

    //青蛙跳台阶
    public int find(int N){
        if(N == 0){
            return 0;
        }else if(N == 1){
            return 1;
        }else if(N == 2){
            return 2;
        }else {
            return find(N-1)+find(N-2);
        }
    }
}
