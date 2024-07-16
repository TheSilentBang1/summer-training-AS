package day4;

public class reverse_array {
    // public static void reverse_Arr_1(int[] args){

    //     int[] newarray = new int[args.length];

    //     for( int i = 0; i < args.length; i++){
    //         newarray[i] = args[ args.length - i - 1];
    //     }

    //     for( int i = 0; i < args.length; i++){
    //         System.out.print(newarray[i] + " ");
    //     }
    // }

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

    public static void main(String args[]){
        int [] arr = {1,2,3,4,5};
        reverse_Arr(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }


    }
        
    
}
