class Solution {
    public static boolean rotateMatrix(int[][] matrix){
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;

        int n = matrix.length;

        for (int layer = 0; layer < n/2; layer++){
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++){
                int offset = i - first;
                int top = matrix[first][i]; // store top
                matrix[first][i] = matrix[last - offset][first]; // top take left
                matrix[last - offset][first] = matrix[last][last - offset]; //left take bottom
                matrix[last][last - offset] = matrix[i][last]; //bottom take right
                matrix[i][last] = top; // right take top
            }
        }

        return true;
    }

    public static void print(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] matrix = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
        };
        print(matrix);
        System.out.println("");
        rotateMatrix(matrix);
        print(matrix);
    }
}