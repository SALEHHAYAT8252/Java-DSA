
public class Nqueens{

    public static boolean isSafeToPlaceQueen(char[][] board,int row , int col){
        //Check Vertical up to place queen

        for(int i = row;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //check left diagonal to palce queen

        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //Check left diagonal to place queen 
        for(int i = row,j=col;i>=0&&j<board[0].length;i--,j++){
                if(board[i][j]=='Q'){
                    return false;
                }
        }

        return true;
    }

    public static void printChessBoard(char[][] board){
        System.out.println("--------Chess Board---------");
        for(int i = 0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------Chess Board---------");

    }

    public static void placeQueen(char[][] board,int row){
        if(row==board.length){
            printChessBoard(board);
            return;
        }

        for(int i=0;i<board[0].length;i++){
            if(isSafeToPlaceQueen(board,row,i)){
                board[row][i]='Q';
                placeQueen( board,row+1);
                board[row][i] = 'X';
            }
        }
    }
    public static void main(String[] args){
        int n=2;
        char[][] board = new char[n][n];

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                    board[i][j] = 'X';
            }
        }

        placeQueen(board, 0);
    }
}