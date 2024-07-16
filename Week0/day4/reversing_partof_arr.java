package day4;

public class reversing_partof_arr {
    public static void swapStartEnd(int [] arr,int start,int end){ 
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void reverse_Arr(int [] arr){ 
        int start = 0;
        int end = (arr.length - 1);
        while(start<=end){
            swapStartEnd(arr, start, end);
            start++;
            end--;
        }
    }
    
}
