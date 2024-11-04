public class fibonacci {
    //top down approach dp
    public static int fib(int n,int [] dp){
        if(n==0||n==1){
            return n;
        }
        //check if it exists already in memory
        if(dp[n]!=0){
            return dp[n];
        }
        int f1 = fib(n-1,dp);
        int f2 = fib(n-2,dp);

        return dp[n] = f1+f2;

    }
    public static void main(String[]args){
        int n = 6;
        System.out.println(fib(n,new int[n+1]));
    }
}
