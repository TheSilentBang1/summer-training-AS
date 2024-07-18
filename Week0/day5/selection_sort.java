package day5;


public class selection_sort {
    public static void selectionSort(int [] arr){
        for(int i = 0;i<arr.length;i++){
            int minIndex = minPartOfArr(arr, i);
            // swap arr[i], arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
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
        int [] arr = {5,3,1,45,2,53};
        selectionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
    
}
