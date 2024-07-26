import java.util.*;

public class twoDimensionalArr {

    public static int [] search(int [] [] arr,int key){
        int [] answer = {-1,-1};
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j] == key){
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return answer; //returns address of answer
    }

    public static void insert(int[][]arr){
        int num = 1;
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){ 
                arr [i] [j] = num++;
            }
        }
        sc.close();
    }

    public static int [] [] transpose(int [] [] arr){
        int [] [] nums = new int[arr[0].length][arr.length];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                nums[j][i] = arr[i][j];
            }
        }
        return nums;

    }

    public static void display(int [][] arr){

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }

    public static void sortByCol(int [] [] arr,int col){
        Arrays.sort(arr,(a,b)->Integer.compare(a[col], b[col]));
    }

    public static void sortByRow(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            Arrays.sort(arr[i]);
        }
    }


    public static void main(String [] args){
        //2d array declaration
        int [] [] arr = new int [5] [6];
        int key = 3;
        // System.out.println(arr[0][2]);
        insert(arr);
        // Arrays.sort(arr);
        display(arr);
        System.out.println();
        int [] answer = search(arr, key);
        for(int i : answer){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();

        int solution[][] = transpose(arr);
        display(solution);

        // int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } }; 

        


        

        //display array with non constant row size 
        // in display : j<arr[i] instead of j<arr[0] --> specific for every row
    }
}
