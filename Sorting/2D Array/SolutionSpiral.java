    class Solution {
        public static int[] spiralOrder(int[][] matrix) {
            
            int sc=0;
            int ec=matrix[0].length-1;
            int sr = 0;
            int er = matrix.length-1;
            int[] spiral = new int[matrix[0].length*matrix.length];
            int j=0;
            while(sr<=er&&sc<=ec){
                //top
                for(int i=sc ; i<=ec;i++){
                    spiral[j++] = matrix[sr][i];
                }

                //right
                for(int i=sr+1 ; i<=er;i++){
                    
                    spiral[j++] = matrix[i][ec];
                }

                //bottom
                for(int i=ec-1;i>=sc;i--){
                    if(sr==er) break;
                spiral[j++] =matrix[er][i];   
                }

                //left
                for(int i=er-1;i>=sr+1;i--){
                    if(sc==ec) break;
                    spiral[j++] =matrix[i][sc];   
                }
                sr++;
                ec--;
                er--;
                sc++;
            }
            return spiral;
        }

        public static void main(String[] args) {
            int[][] matrix = { { 1, 2, 3 },
                    { 4, 5, 6 },
                    { 7, 8, 9 }
            };
            int[] mat =spiralOrder(matrix)  ;  
            for(int i=0;i<mat.length;i++){
                System.out.print(mat[i]+" ");
            }
        }
    }