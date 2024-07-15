package day3;


public class armstrong_check {

    public static boolean isArmstrong(int n){
        int temp = n;
        int d = count(n);
        int sum = 0;
        while(n!=0){
            sum += Math.pow((n%10),d);
            n = n/10;
        }
        return(sum==temp);
        
    }

    public static int count(int n){
        int temp = 0;
        while(n!=0){
            n = n/10;
            temp++;
        }
        return temp;
    }
    public static void main(String args[]){
        int n = 5;
        // System.out.println(isArmstrong(n));
        System.out.println(isArmstrong(n));
    }
    
}
