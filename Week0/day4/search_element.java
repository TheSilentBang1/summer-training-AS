package day4;
import java.util.*;

public class search_element {

    public static int searchArr(int [] arr,int key){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == key){
                System.out.print("Key found at location : ");
                return i;
            }
        }
        System.out.println("Key not found");
        return -1;
    }

    public static void main(String args[]){
        int [] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter key: ");
        int key = sc.nextInt();
        sc.close();
        

        System.out.println(searchArr(arr,key));
}


    
}
