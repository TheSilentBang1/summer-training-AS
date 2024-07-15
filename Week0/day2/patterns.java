import java.util.Scanner;
public class patterns {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // * * * * 

        // for(int i = 0;i<n;i++){
        //     System.out.print("* ");
        // }
        // sc.close();

        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *

        // for(int i = 0;i<n;i++){
        //     for(int j = 0;j<=n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // sc.close();

        // * 
        // * * 
        // * * *   right facing

        // for(int i = 0;i<n;i++){
        //     for(int j = 0;j<=i;j++){
        //         System.out.println("* ");
        //     }
        //     System.out.println();
        // }
        // sc.close();



        //     *
        //   * *
        // * * *   left facing

        // for(int i = 0;i<n;i++){
        //     for(int k = 0;k<n-i;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 0;j<=i;j++){
        //         System.out.print("* ");
        //         System.out.println();

        //     }
        // }
        // sc.close();


        // * * * 
        // * *
        // *       inverted right facing 

        // for(int i = n;i>=1;i++){    
        //     for(int j = 1;j<=n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // sc.close();




        // * * *
        //   * *
        //     *     inverted left facing 


        // for(int i = n;i>=0;i--){
        //     for(int k = 1;k<=(n-i);k++){
        //         System.out.print("  ");
        //     }
        //     for(int j = 1;j<=i;i++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }


        
        // for(int i = 1;i<=n;i++){
            
        //     for(int j = 1;j<=n;j++){
        //         if(i==1||i==n||j==1||j==n){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        
                
        //     }
        //     System.out.println();
        // }
        // sc.close();



        // for(int i = 0;i<n;i++){
        //     for(int j = 0;j<=n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // sc.close();

            // for(int i=1; i<=n; i++){

            //     for(int j=1; j<=n-i; j++){
            //         System.out.print("  ");
            //     }
            //     for(int j=1; j<=i; j++){
            //         System.out.print("* ");
            //     }
            // }
            // for(int i = 0;i<n-1;i++){
            //     for(int j = 0;j<=i;j++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }

    //         for(int i=1;i<=n;i++){
    //             for(int j=n-i; j>=1;j--){
    //               System.out.print("  ");
    //             }
    //             for(int j=1;j<=i;j++){
    //               System.out.print(" *");
    //             }
    //             for(int j=1;j<=i-1;j++){
    //               System.out.print(" *");
    //             }
    //             System.out.println();
                       
    // }
    // sc.close();

    

    
    



    }
    
}