import java.util.Stack;
import java.util.Scanner;

public class stacks{

    public static void main(String [] args){
        Stack <Integer> str = new Stack<>();
        // str.push(0);
        // str.push(1);
        // str.push(2);


        // System.out.println(str);
        // System.out.println(str.peek());
        // System.out.println(str.pop());
        // str.pop();
        // System.out.println(str);
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter n: ");
        // int n = sc.nextInt();

        // Stack <Integer> stk = new Stack<>();
        // for(int i = 0;i<n;i++){
        //     stk.push(sc.nextInt());
        // }
        // System.out.println(stk);


        //taking user input into integer stack when we dont know n:

        while(sc.hasNextInt()){
            str.push(sc.nextInt());            
        }


        // if (!str.empty()) {
        //     System.out.println("str is not empty");
            
        // }


        System.out.println(str.search(2) + str.size()-1);

        // while(!str.empty()){
        //     str.pop();
        // }
        // System.out.println(str);

    }
}