package day4;

public class maximum_array {
    public static int maxElement(int arr[]){
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int [] arr = {1,3,2,42,2,2,4};
        System.out.println(maxElement(arr));
    }
}
