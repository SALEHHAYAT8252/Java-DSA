import java.util.*;

class SolutionSpiral {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> spiral = new ArrayList<>();

        int sc = 0;
        int ec = matrix[0].length - 1;
        int sr = 0;
        int er = matrix.length - 1;

        while (sr <= er && sc <= ec) {

            // top
            for (int i = sc; i <= ec; i++) {
                spiral.add(matrix[sr][i]);
            }

            // right
            for (int i = sr + 1; i <= er; i++) {
                spiral.add(matrix[i][ec]);
            }

            // bottom
            for (int i = ec - 1; i >= sc; i--) {
                if (sr == er) break;
                spiral.add(matrix[er][i]);
            }

            // left
            for (int i = er - 1; i >= sr + 1; i--) {
                if (sc == ec) break;
                spiral.add(matrix[i][sc]);
            }

            sr++;
            ec--;
            er--;
            sc++;
        }

        return spiral;
    }
}