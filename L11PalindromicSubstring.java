import java.util.*;


/*
s = "abc"
Output
3

Algorithm :-
    1. outer loop the string to the end
    2. inner loop the string form the start
    3. declare the boolean matrix to check the boundary condition
    4. compare the letters
    5. check the palindrome difference
    6. set the boolean value in the matrix
    7. store the result in the arraylist
    8. return the arraylist size.

*/


class L11PalindromicSubstring {

public static void main(String[] args) {

    String s = "abc";

    
List<String> result = new ArrayList<>();
    boolean[][] dp = new boolean[s.length()][s.length()];

    for (int end = 0; end < s.length(); end++) {
        for (int start = 0; start <= end; start++) {
            if (s.charAt(start) == s.charAt(end) && (end - start <= 2 || dp[start + 1][end - 1])) {
                dp[start][end] = true;
                result.add(s.substring(start, end + 1));
            }
        }
    }

    System.out.println("The palindromix substring size is: "+result.size());


    }

}
