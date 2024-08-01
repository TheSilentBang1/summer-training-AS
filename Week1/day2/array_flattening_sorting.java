import java.util.*;

public class array_flattening_sorting {
    public static int [] flattenArr(int[][]arr){
        int row = arr.length;int col = arr[0].length;
        int [] nums = new int[row*col];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                nums[arr[0].length*i+j] = arr[i][j];
            }
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void display(int [] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void fillArray(int [][] arr1,int [] nums){
        for(int i = 0;i<nums.length;i++){
            arr1[i/arr1[0].length][i%arr1[0].length] = nums[i];
        }
    }

    public static void display(int [][] arr){

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String [] args){
        int [] [] arr = {{1,2,3,4},
                        {8,7,6,5},
                        {9,10,11,12}
    };
        display(arr);
        System.out.println();
        //flattening arr into a 1d array
        int [] flattenedArr = flattenArr(arr);
        // display(flattenedArr);
        // converting back to a sorted 2d array
        int [] [] arr1 = new int[3][4];
        fillArray(arr1,flattenedArr);
        display(arr1);

    }
}
