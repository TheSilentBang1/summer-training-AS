public class coinToss {

    public static void toss(int n,String ans){
        if(n==0){
            System.out.println(ans);
        }
        else{
            toss(n-1,ans+"H");
            toss(n-1,ans+"T");
        }   
    }
    public static void main(String [] args){
        int n = 3;
        String ans ="";
        toss(n,ans);

    }
    
}
