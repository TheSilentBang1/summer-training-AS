public class sum {
    // sum of first n natural numbers using head recusion 
    // using tail recursion : done before, where we took an extra variable to return, x, as follows: 
    // public static int sumNum(int n,int x){
    //     if(n==1){
    //         return x + n;
    //     }
    //     return sumNum(n-1,x+n);

    public static int sumHead(int n){
        if(n==1){
            return 1;
        }
        return n + sumHead(n-1);
    }

    public static void main(String [] args){
        int n = 5;
        System.out.println(sumHead(n));

    }


    // }
}
