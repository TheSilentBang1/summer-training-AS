import java.util.Scanner;


public class patterns_assn {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    // 4
    // left facing triangle
    //    *
    //   **
    //  ***
    // ****

    // for(int i = 0;i<n;i++){
    //   for(int k = 0;k<n-i-1;k++){
    //     System.out.print(" ");
    //   }
    //   for(int j = 0;j<=i;j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }
    // sc.close();

    //5
    // inverted left facing triangle
    // *****
    //  ****
    //   ***
    //    **
    //     *

    // for(int i = n;i>=1;i--){
    //   for(int k = 0;k<=n-i-1;k++){
    //     System.out.print(" ");
    //   }
    //   for(int j = 0;j<i;j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }
    // sc.close();


    // 6
    // *****
    //   ****
    //     ***
    //       **
    //         *

    // for(int i = n;i>=1;i--){
    //   for(int k = 0;k<=n-i-1;k++){
    //     System.out.print("  ");
    //   }
    //   for(int j = 0;j<i;j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }
    // sc.close();

    //7
    // * * * * * 
    // *       * 
    // *       * 
    // *       * 
    // * * * * * 

    // for(int i = 0;i<n;i++){
    //   for(int j = 0;j<n;j++){
    //     if(i == 0||i==n-1 || j==0||j==n-1){
    //       System.out.print("* ");
    //     }
    //     else{
    //       System.out.print("  ");
    //     }
    //   }
    //   System.out.println();
    // }
    // sc.close();


  //  *    * 
  //   *  *
  //    *
  //   *  *
  //  *    *
    // for(int i = 0;i<n;i++){
    //   for(int j = 0;j<n;j++){
    //     if(i==j||i+j==n-1){
    //       System.out.print("*");

    //     }
    //     System.out.print(" ");
    //   }
    //   System.out.println();
    // }
    // sc.close();




    
          
  }

}