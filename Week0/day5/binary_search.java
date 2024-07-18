package day5;
import java.util.*;



public class binary_search {
    public static int binarySearch(int [] arr,int key){
        int s = 0;
        int e = arr.length-1;
        int mid = (s+e)/2;

        while(s<=e){
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid]>key){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
            mid = (s+e)/2;

        }
        return -1;

        
    }

    public static int lowerBound(int [] arr,int key){
        int s = 0;
        int e = arr.length-1;
        int mid = (s+e)/2;
        int ans = -1;

        while(s<=e){
            if(arr[mid] == key){
                ans = mid;
                e = mid-1;
            }
            else if(arr[mid]>key){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
            mid = (s+e)/2;

        }
        return ans;
    }

    public static int upperBound(int [] arr,int key){
        int s = 0;
        int e = arr.length-1;
        int mid = (s+e)/2;
        int ans = -1;

        while(s<=e){
            if(arr[mid] == key){
                ans = mid;
                s = mid+1;
            }
            else if(arr[mid]>key){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
            mid = (s+e)/2;

        }
        return ans+1;
    }


    public static void main(String args[]){
 
        int [] arr = {1,2,3,3,4,4,6};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter key: ");
        int key = sc.nextInt();
        sc.close();

        // System.out.println(binarySearch(arr,key));

        System.out.println(lowerBound(arr,key));
        System.out.println(upperBound(arr, key));
        
        
    }

    
}
