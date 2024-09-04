
public class rec {
    public static void printNum(int n){
        //base case
        if(n == 10){
            System.out.println(n);
            return;
        }
        //assumption
        System.out.println(n);
        //proof
        printNum(n+1);
    }
    public static int sumNum(int n,int x){
        if(n==1){
            return x + n;
        }
        return sumNum(n-1,x+n);

    }
    
    public static void main(String [] args){
        int n = 10;
        int n1 = 1;
        printNum(n1);
        //iterative code for sum of first n natural num
        // int sum = 0;
        // for(int i = 1;i<=n;i++){
        //     sum+=i;
        // }
        // System.out.println(sum);
        int sum = sumNum(n,0);
        System.out.println(sum);

        

    }
}
