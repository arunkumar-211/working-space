/*Given a sorted array of non-negative integers of size n,
    return the smallest missing integer.

Examples:
    int[] arr1 = {1, 2, 3, 4};    // Return 0

    int[] arr2 = {0, 1, 3, 4};    // Return 2

*/

/*
    Algorithm :-
        1. Sort the given array
        2. Find the difference 
        3. return the very previous element when the difference mismatches.

 */

public class Q18SmallestMissInt {

    public static void main(String[] args) {
        //int[] arr1 = { 1, 2, 3, 4 };
        int[] arr1 = {0, 1, 3, 4};
        int res = 0;

        for (int i = 1; i < arr1.length; i++) {
            int d = Math.abs(arr1[i] - arr1[i - 1]);
            if (d != 1) {
                res = (arr1[i] - 1);
                break;
            }
        }

        System.out.println("smallest missing int: " + res);
    }

}
