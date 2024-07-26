
public class nextGreatestLeft {
    public static void nextGreatestToLeft(int [] arr,int [] arr1){
        //next greatest element to left when current element not included
        int maxL = 0;
        for(int i = 0;i<arr.length-1;i++){
            arr1[i] = maxL; //store
            maxL = Math.max(maxL, arr[i]); //update
        }
    }

    public static void nextGreatestToLeftInc(int [] arr,int [] arr1){
        //next greatest element to left when current element is included
        int maxL = 0;
        for(int i = 0;i<arr.length-1;i++){
            maxL = Math.max(maxL, arr[i]); //update
            arr1[i] = maxL; //store
        }
    }
    public static void main(String args[]){
        int [] arr = {2,3,1,8,7,3,4}; // OP : {0,2,3,3,8,8,8}
        int [] arr1 = new int[arr.length];
        nextGreatestToLeftInc(arr, arr1);
        
        for(int i:arr1){
            System.out.println(i+" ");
        }
    }
    
}
