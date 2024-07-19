package day6;

public class subArrays {
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

    public static int findMaxSumSubArr(int [] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                int sum = 0;
                for(int k = i;k<=j;k++){
                    sum+=arr[k];
                    maxSum = Math.max(sum,maxSum);
                }
                System.out.println();
            }
        }
        return maxSum;
    }
    

    public static void main(String args[]){
        int [] arr = {1,2,3,4,5,6};
        // findSubArrays(arr);
        System.out.println(findMaxSumSubArr(arr));
    
    
    }

    
}
