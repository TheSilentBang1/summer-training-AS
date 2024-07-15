package day3;
import java.util.Scanner;


public class prime_check {    
    
    public static boolean isPrime(int n){
        for(int i = 2;i<n;i++){
            if(n == 2){
                return true;
            }
            else if(n%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String args[]){
        System.out.println("Enter number to check for prime: " );
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        System.out.println(isPrime(n));
        sc.close();

    }
}
