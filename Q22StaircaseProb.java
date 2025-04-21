/*A staircase with n steps is given. Starting from the base,
    return the number of ways of reaching the n’th stair.
    [The person can climb either 1 or 2 stairs in one move]. */

/*
    Algorithm :-    
        1. follow the fibonacci method


*/


public class Q22StaircaseProb {


    public static void main(String[] args) {

        //int i = 1;
        int n = 5;
        int ways[] = new int[n+1];
        ways[0] = 1;
        ways[1] = 1;

        for(int i = 2; i <= n; i++) {
            ways[i] = (ways[i-1] + ways[i-2]);
        }


        System.out.println("The number of ways: "+ways[n]);


    }


}