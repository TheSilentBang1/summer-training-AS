package day5;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class min_array {

    //function to return index of minimum element

    static int minArr(int [] arr){
        int min = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[min]>arr[i]){
                min = i;
            }
        }
        return min;

    }



    static int minPartOfArr(int [] arr,int j){
        int min = j;
        for(int i = j+1;i<arr.length;i++){
            if(arr[min]>arr[i]){
                min = i;
            }
        }
        return min;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int [] arr = {5,3,1,45,2,53};
        System.out.println(minArr(arr));
        System.out.println("Enter the starting index: ");
        int j = sc.nextInt();
        System.out.println(minPartOfArr(arr,j));
        sc.close();
    }
}
