package day6;

public class rotate_Array {

    public static void rotateByOne(int [] arr){
        int temp = arr[arr.length-1];
        for(int i = arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    // public static void rotateByK(int [] arr,int k){
    //     int temp = arr[arr.length-1];
    //     for(int i = arr.length-1;i>0;i--){
    //         arr[i] = arr[i-1];
    //     }
    //     arr[0] = temp;
    // }
    public static void main(String args[]){
        int [] arr = {1,2,3,4};
        int k = 2;
        rotateByOne(arr);
        // rotateByK(arr,k);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
