package day4;
import java.util.Scanner;

public class sum_array {
    public static int sumArr(int [] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i]; 
        }
        return sum;
    }
    public static void main (String args[]){
        int [] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(sumArr(arr));

    }
    
}
