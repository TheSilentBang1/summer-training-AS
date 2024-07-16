package day4;

import java.util.Scanner;

public class bubble_sort {

    public static void bubbleSort(int [] arr){
        for(int turn = 1;turn<arr.length;turn++){
            for(int i = 0;i<arr.length-turn;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        int [] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
                arr[i] = sc.nextInt();
        }
        sc.close();

        bubbleSort(arr);

        for(int i:arr){
            System.out.print(i+" ");
    }
}

}
