
public class nextGreatestRight {  

    public static void nextGreatestToRight(int [] arr,int [] arr1){
        //next greatest element to right when current element not included
        int maxR = 0;
        for(int i =arr.length-1;i>=0;i--){
            arr1[i] = maxR; //store
            maxR = Math.max(maxR, arr[i]); //update
        }
    }

    public static void nextGreatestToRightInc(int [] arr,int [] arr1){
        //next greatest element to right when current element is included
        int maxR = 0;
        for(int i =arr.length-1;i>=0;i--){
            maxR = Math.max(maxR, arr[i]); //update 
            arr1[i] = maxR; //store
        }
    }
    public static void main(String args[]){
        int [] arr = {2,3,1,8,7,3,4};
        int [] arr1 = new int[arr.length];
        // nextGreatestToRight(arr, arr1);
        nextGreatestToRightInc(arr, arr1);
        
        for(int i:arr1){
            System.out.println(i+" ");
        }
    }
}
