
package day3;
// import java.util.Scanner;



public class reverse_int {    
    
    public static int reverse_num(int n){
        int temp = 0;
        int remainder;
        while(n!=0){
            remainder = n%10;
            temp = temp*10 + remainder;
            n = n/10;
        }
        return temp;
    }
    public static void main(String args[]){
        int n = 22929;
        System.out.println(reverse_num(n));

    }
}
