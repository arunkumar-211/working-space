/*Pascal Triangle
        generate the Pascal Triangle, OR
        generate a specified row of the Pascal Triangle, OR
        calculate the element at a specified row and column.

Algorithm :-
    1. consider the exclusive space as (n-1)
    2. decrement the exclusive space for each iteration
    3. load the 1 in the triangle array for 0th or ith condition
    4. load the previous row's previous column and previous row's present column in the triangle array 
    5. print each result with a space and repeat till the end
    6. finally the pascal triangle is printed.

*/

public class Q29PascalTriangle {


    public static void getPascalTriangle(int n) {
           
        int rows = 5; // Number of rows
        int[][] triangle = new int[rows][rows];
        int space = (n - 1);

        
        for (int i = 0; i < rows; i++) {
             for(int k = 0; k < space; k++) {
                    System.out.print(" ");
                }
            
            for (int j = 0; j <= i; j++) {
                
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
                System.out.print(triangle[i][j]+" ");
                
            }
            System.out.println();
            space--;
        }


               
    


    }


    public static void main(String[] args) {
        int n = 5;
        getPascalTriangle(n);



    }


}