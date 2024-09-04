public class backTracking {
    static int sum = 0;

    // public static void sumArray(int [] arr,int i,int k){
    //     if(i == arr.length){
    //         return;
    //     }
    //     sum += arr[i];
    //     if(sum>k){
    //         sum -=arr[i];
    //         return;
    //     }
    //     sumArray(arr,i+1,k);
    // }

    static boolean backtrackArray(int [] arr,int i,int k){
        if(i==arr.length)return true;
        if(sum>k) return false;
        sum+=arr[i];
        if(!backtrackArray(arr, i+1, k)){
            sum-=arr[i];
        }
        return true;
    }

    public static void main(String[] args ){
        int [] arr = {1,2,3,4,5,6};
        // sumArray(arr,0,14);
        // System.out.println(sum);
        backtrackArray(arr, 0, 14);
        System.out.println(sum);
    }
}
