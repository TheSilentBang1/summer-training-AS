package day4;
import java.util.*;

public class reversing_partof_arr {
    public static void swapStartEnd(int [] arr,int start,int end){ 
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void reversePartOfArr(int [] arr,int i,int j){ 
        int start = i;
        int end = j;
        while(start<=end){
            swapStartEnd(arr, start, end);
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        
        int [] arr = new int [10];
        System.out.println("Enter array elements: ");
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter reverse start index: ");
        int i = sc.nextInt();
        System.out.println("Enter reverse end index: ");
        int j = sc.nextInt();
        sc.close();
        
        reversePartOfArr(arr,i,j);
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
    
}
