public class subsequences {
    //head recursion, counting number of subsequences
    public static int countSubseq(String s){
        if(s.isEmpty()){
            return 1;
        }
        int n1 = countSubseq(s.substring(1));
        int n2 = countSubseq(s.substring(1));
        return n1+n2;

    }

    // tail recursion 
    public static void genSubseq(String s,String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        genSubseq(s.substring(1), ans+s.charAt(0));
        genSubseq(s.substring(1), ans);
    }
    public static void main(String [] args){
        String s = "tap";
        // String ans = "";
        // System.out.println(s.substring(1));
        // genSubseq(s,ans);
        System.out.println(countSubseq(s));
        // genSubseq(s,ans);
    }
}
