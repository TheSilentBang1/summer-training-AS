public class remove_duplicates{

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int count = 1;
        for(int j = 1;j<nums.length;j++){
            if(nums[i]!=nums[j] ){
                nums[i] = nums[j];
                i++;
                count++;
             }
        }
        return count;
    }


    public static void main(String args[]){
        int [] arr = {1,2,2,2,3,4,5,6};
        // function to return 
        System.out.println(removeDuplicates(arr)); 
    }


}