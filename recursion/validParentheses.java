public class validParentheses {
    public static void getParentheses(int n,int l,int r,String answer){
        if(l==n && l==r){
            System.out.println(answer);
            return;
        }
        if(l>n || r>l){
            return;
        }
        getParentheses(n, l+1, r, answer+"{");
        getParentheses(n, l, r+1, answer+"}");

    }
    public static void main(String[] args){
        int n = 3;
        String answer = "";
        int l = 0,r=0;
        getParentheses(n,l,r,answer);
    }
}
