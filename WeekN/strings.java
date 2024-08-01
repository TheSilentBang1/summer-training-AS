public class strings {

    //move alphabet by 1, ie a-->b
    public static String moveAlphabet(String s){
        String ans = "";
        for(int i = 0;i<s.length();i++){
            // ans = ans + (s.charAt(i)+1); // character auto typecasts to integer + 1
            ans = ans + (char)(s.charAt(i)+1);

        }
        return ans;
    }

    public static String reverseString(String s){
        String ans = "";
        for(int i = s.length()-1;i>=0;i--){
            ans = ans + (char)(s.charAt(i));
        }
        return ans;
    }

    public static String reverseWords(String s){
        s = s.trim(); //removes spaces from starting and end of string
        String ans = "";
        String [] s_arr = s.split(" ");
        for(int i = s_arr.length-1;i>=0;i--){
            ans+=s_arr[i]+" ";
        }
        return ans.trim();

         
    }

    public static boolean palindromeCheck(String s){
        // String ans = "";
        
        // for(int i = s.length()-1;i>=0;i--){
        //     ans = ans + (char)(s.charAt(i));
        // }

        // for(int i = 0;i<s.length();i++){
        //     if(s.charAt(i)==ans.charAt(i)){
        //         continue;
        //     }
        //     else{
        //         return false;
        //     }

        // }        
        // return true;
        return s.equalsIgnoreCase(reverseString(s)); 
        //equals function equates values instead of addresses as in case of s == reverseString(s);

    }

    public static int largestSubstring(String s){
        int ans = 0;
        char prevChar = s.charAt(0);
        int length = 1;

        
        for(int i = 1;i<s.length();i++){
            if(prevChar==s.charAt(i)){
                length++;
            }
            else{
                prevChar = s.charAt(i);
                ans = Math.max(ans, length);
                length = 1;
            }

    
        }
        return ans;
        
    }
    public static void main(String [] args){
        String s = "aabaaa";
        String s1 = "Today is thursday";
        // System.out.println(s);
        // System.out.println(s.substring(2,1));

        // String answer = moveAlphabet(s);
        // System.out.println(answer);

        // String ans = reverseString(s);
        // System.out.println(ans);

        // System.out.println(palindromeCheck(ans));

        // String answer1 = reverseWords(s1);
        // System.out.println(answer1);

        // int n = largestSubstring(s);
        // System.out.println(n);
    }
    
}
