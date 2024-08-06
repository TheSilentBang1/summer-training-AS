public class fact {

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int factorialTail(int n,int answer){
        if(n==0){
            return answer;
        }
        return n*factorial(n-1)*answer;
    }

    public static void main(String [] args){
        int n = 5;
        int answer = 1;
        System.out.println(factorial(n));
        System.out.println(factorialTail(n,answer));
    }
}
