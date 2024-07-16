package day4;

public class swap_elements {
    public static void changeArr(int [] arr){ 
        // here, arr[0] or arr is passed to the function, ie, address of first element of array
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    public static void swapElements(int a,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
    public static void main (String args[]){
        int [] arr = {1,2,3,4,5};
        changeArr(arr);
        for(int i:arr){
            System.out.println(i+" ");
        }
        // int a =1,b=3;
        // swapElements(a, b);
        // System.out.println(a);
        // System.out.println(b);
    }
    
}
