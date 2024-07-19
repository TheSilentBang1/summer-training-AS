package day6;

public class kadane_algo {
    // public static void findSubArrays(int [] arr){
    //     for(int i = 0;i<arr.length;i++){
    //         for(int j = i;j<arr.length;j++){
    //             //for printing array
    //             for(int k = i;k<=j;k++){
    //                 System.out.print(arr[k]);
    //             }
    //             System.out.println();
                
    //         }
    //     }
    // }

    public static int kadaneAlgo(int [] arr){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0;i<arr.length;i++){
            currSum+=arr[i];
            maxSum = Math.max(currSum,maxSum);
            if(currSum<0){
                currSum = 0;
            }
        }
        return maxSum;
    }
    

    public static void main(String args[]){
        int [] arr = {1,2,3,4,5,6};
        // findSubArrays(arr);
        System.out.println(kadaneAlgo(arr));

    }

    
}
