package day3;


public class arrays {
    // in x, a copy of arr is not made, the addresses in arr is copied to x, x points to arr memory
    public static void displayArr(int []x){
        //code for displaying an integer array
        for(int i = 0;i<x.length;i++){
            System.out.println(x[i]+" ");
        }
    }
    
    public static void main(String args[]){
        // int [] arr = new int[10];
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // arr[9] = 4;
        // // System.out.println(arr);
        // displayArr(arr);

        // char [] arr1 = new char[10];
        // arr1[0] = 'a';
        // arr[1] = 'b';
        // arr[2] = 'c';
        // System.out.println(arr1);

        // String str = new String("example");
        // System.out.println(str);

    }
}
