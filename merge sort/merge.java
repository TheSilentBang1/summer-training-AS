public class merge{
    static void merge(int[]arr,int low,int mid,int high){
        int size = high + low-1;
        int [] temp = new int[size];
        int i = mid,j=high,k = size-1;
        while(i>=low && j>=mid-1){
            if(arr[i]>arr[j]){
                temp[k] = arr[i];
                i--;
            }
            else{
                temp[k] = arr[j];
                j--;
            }
            k--;
        }
        while(j>=mid+1){
            temp[k] = arr[j];
            k--;j--;
        }
        for(i=low;i<high;i++){
            arr[i] = temp[i-low];
        }
        

    }
}