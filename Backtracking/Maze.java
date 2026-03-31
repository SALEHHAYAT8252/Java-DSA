public class Maze {
    public static int maze(int row,int col,int m,int n){
        if(row==m-1&&col==n-1){
            return 1;
        }else if(row==m||col==n){
            return 0;
        }

        int w1 = maze(row, col+1, m, n);
        int w2 = maze(row+1, col, m, n);
        return w1+w2;
    }

    public static void main(String[] args) {
       System.out.println(maze(0, 0, 3, 3));
    }
}
