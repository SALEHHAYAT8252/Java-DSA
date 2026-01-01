public class SortedMatrixSearch {

    //Start from (0,m-1)
    public static boolean staircaseSearchTop(int[][] arr, int key) {
        int row = 0;
        int col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("Found at position (" + row + "," + col + ")");
                return true;
            } else if (key>arr[row][col] ) {
                row++;
            } else {
                col--;
            }
        }
        System.out.println("Not found");
        return false;
    }

    //Start from (n-1,0)
    public static boolean staircaseSearchBottom(int[][] arr, int key) {
        int row = arr.length-1;
        int col = 0;

        while (row >=0 && col<arr[0].length) {
            if (arr[row][col] == key) {
                System.out.println("Found at position (" + row + "," + col + ")");
                return true;
            } else if (key>arr[row][col] ) {
                col++;
            } else {
                row--;
            }
        }
        System.out.println("Not found");
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        staircaseSearchTop(arr, 33);
        staircaseSearchBottom(arr, 40);
    }
}
