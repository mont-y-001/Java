package recursion;

public class N_Queen {

    static void PrintSol(int[][] board, int n) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 1)
                    System.out.print("Q ");
                else
                    System.out.print("_ ");
            }
            System.out.println();   // move to next row
        }
        System.out.println();       // space between solutions
    }

    static boolean isSafe(int[][] board, int row, int col, int n){

        // check left row
        for(int i = 0; i < col; i++){
            if(board[row][i] == 1)
                return false;
        }

        // check upper diagonal
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 1)
                return false;
        }

        // check lower diagonal
        for(int i = row, j = col; i < n && j >= 0; i++, j--){
            if(board[i][j] == 1)
                return false;
        }

        return true;
    }

    static void Solve(int[][] board, int col, int n){

        if(col == n){
            PrintSol(board, n);
            return;
        }

        for(int row = 0; row < n; row++){

            if(isSafe(board, row, col, n)){

                board[row][col] = 1;     // place queen

                Solve(board, col + 1, n);

                board[row][col] = 0;     // backtrack
            }
        }
    }

    public static void main(String[] args) {

        int n = 4;
        int[][] board = new int[n][n];

        Solve(board, 0, n);
    }
}