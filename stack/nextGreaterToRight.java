import java.util.Stack;

public class nextGreaterToRight {

    static int [] ngr(int [] arr){
        int [] ans = new int[arr.length]; 
        Stack<Integer> stk= new Stack<>();
        for(int i=arr.length-1 ;i>=0;i--){
            //step 1
            while(!stk.empty() && arr[i]>stk.peek()) 
            stk.pop(); 

            // step 2 
            if(stk.empty()) 
                ans[i] = -1;
            else
                ans[i] = stk.peek();

            // step 3 
            stk.push(arr[i]);
        }
        return ans;

            
    }


    public static void main(String [] args){
        int [] arr = {7,3,4,5,9,2};
        int [] nums = ngr(arr);
        for(int i : nums){
            System.out.println(i+ " ");
        }


    }
}
