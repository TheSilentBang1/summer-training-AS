public class nqueens {
    static boolean check(int [] [] board,int i,int j,int n){
        //check horizontal and vertical
        for(int x = 0;x<n;x++){
            if(board[i][x] == 1 || board[x][j] ==1){
                return false;
            }
        }

        //check upper left diagonal
        int x = i,y=j;
        while(x>=0&&y>=0){
            if(board[x][y] == 1){
                return false;
            }
            x--;y--;
        }

        //check upper right diagonal 
        while(i>=0&&j<n){
            if(board[i][j] == 1){
                return false;
            }
            i--;j++;
        }
        //safe place to put queen
        return true;
    }


    static boolean nQueens(int [] [] board,int i,int n){
        //base case, we've reached our solution
        if(i==n){
            //print the board
            for(int x = 0;x<n;x++){
                for(int j = 0;j<n;j++){
                    System.out.print(board[x][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return false;
        }

        //check for each column for row i
        for(int j = 0;j<n;j++){
            if(check(board, i, j, n)){
                board[i][j] = 1;
                if(nQueens(board, i+1, n)){
                    return true;
                }
                else{
                    board[i][j] = 0;
                }
            }       
        }
        return false;
    }

    public static void main(String [] args){
        int n = 4;
        // int i = 0; // starting row
        int [] [] board = new int[n][n];
        nQueens(board,0,n);

    }
    
}
