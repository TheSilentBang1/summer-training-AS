

public class countEven {


    // count even numbers till n using tail recursion 
    public static int countEvenTail(int n,int count){
        if(n==1){
            return count;
        }
        if(n%2==0){
            count++;
        }
        return countEvenTail(n-1, count);
    }

    // count even numbers till n using head recursion
    public static int countEvenHead(int n){
        if(n==1){
            return 0;
        }
        if(n%2==0){
            return 1 + countEvenHead(n-1);
        }
        else{
            return countEvenHead(n-1);
        }

        
    }
    public static void main(String [] args){
        System.out.println(countEvenHead(10));
        System.out.println(countEvenTail(10, 0));
    }
    
}
