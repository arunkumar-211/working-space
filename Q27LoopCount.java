/*
Given an array of integers (positive and negative),
    return length of the loop, if it exists. Else return -1.
    [ Rules for the movement - Index to move to,
        for +ve numbers - (i + arr[i])%n
        for -ve numbers - (i - arr[i])%n ]

Example:
    int[] arr = {2, -1, 1, 2, 2}    
    // Returns 3  [There is a loop in this array because 0 moves to 2, 2 moves to 3, and 3 moves to 0.]


Algorithm :-
    1. loop the array and check with the formula based on the positive and negative integers
    2. update the index each time
    3. count each time unless 0 is reached and loop is formed
    4. return the count and else -1

*/


class Q27LoopCount {

    public static int getLoopCount(int[] arr) {
        int loopCount = 1;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] >= 0 && (i + arr[i]) % arr.length != 0) {
                loopCount++;
                i = (i + arr[i]) % arr.length;
                i--;
            }else if(arr[i] < 0 && (i - arr[i]) % arr.length != 0) {
                loopCount++;
                i = (i - arr[i]) % arr.length;
                i--;
            }else {
                break;
            }


        }

        return loopCount;


    }



    public static void main(String[] args) {
        int[] arr = {2, -1, 1, 2, 2};

        int res = getLoopCount(arr);
        if(res == 1) {
            System.out.println("The loop count for the array elements is: none");
        }else {

            System.out.println("The loop count for the array elements is: "+res);

        }

    }
}