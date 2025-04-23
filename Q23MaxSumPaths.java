/*Given a matrix of size m * n,
    return the maximum path sum in the matrix.
    [You start from the top-left corner of the matrix and move up, down and diagonally].

Example:
    Matrix      10 10  2  0 20  4
                       1  0  0 30  2  5
                       0 10  4  0  2  0
                       1  0  2 20  0  4
    
    // Return 74 [The maximum sum path is 20-30-4-20] */

/*
    Algorithm :-
        1. copy the first row of the given matrix to a temporary matrix
        2. consider the given matrix from the second row and get the maximum for top, left & right diagonals
        3. compare and fetch the maximum result and store it in the temporary matrix
        4. iterate to the end of the row in the given matrix and fetch the maximum result stored out of it
        5. return the answer

 */



public class Q23MaxSumPaths {

    public static int maxPathSum(int[][] matrix) {


        int temp[][] = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix[0].length; i++) {
            temp[0][i] = matrix[0][i];
        }


        for(int i = 1; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                int top = temp[i-1][j];
                int leftDia = (j-1) >= 0 ? temp[i-1][j-1] : Integer.MIN_VALUE;
                int rightDia = (j+1) < matrix[0].length ? temp[i-1][j+1] : Integer.MIN_VALUE;

                temp[i][j] = matrix[i][j] + Math.max(top, Math.max(leftDia, rightDia));
            
            }
        }


        int maxSums = Integer.MIN_VALUE;
        for(int i = 0; i < matrix[0].length; i++) {
            maxSums = Math.max(maxSums, temp[matrix.length-1][i]);   
            
        }

        return maxSums;

    }







    public static void main(String[] args) {

       
    int[][] matrix = {
  {10, 10, 2, 0, 20, 4},
   {1, 0, 0, 30, 2, 5},
   {0, 10, 4, 0, 2, 0},
  {1, 0, 2, 20, 0, 4}
   };

        System.out.println("The number of ways: "+maxPathSum(matrix));


    }




}
