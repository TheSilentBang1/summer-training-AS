public class all_substrings {

    public static void printSubstrings(String s){
        for(int i = 0;i<s.length();i++){
            for(int j = i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
    public static void main(String [] args){
        String s = "abcde";
        printSubstrings(s);
    }
}