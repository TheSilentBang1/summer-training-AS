public class power {
    // using head recursion
    public static int calculatePow(int base, int power){
        if(power ==0){
            return 1;
        }
        return base* calculatePow(base, power-1);
    }

    // using tail recursion
    public static int calculatePowTail(int base,int power,int answer){
        if(power==0){
            return answer;
        }
        return calculatePowTail(base, power - 1, answer*base);
    }
    public static void main(String [] args){
        int base = 2;
        int power = 4;
        System.out.println(calculatePow(base,power));
        System.out.println(calculatePowTail(base, power, 1));


    }
    
}
