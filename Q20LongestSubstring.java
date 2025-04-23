/* Given a string,
    return the starting index & length of the longest substring containing the same character.

Example:
    String[] str = "aabbbbCCddd";    // Return 2 (index) and substring "bbbb" */

/*
    Algorithm :-
        1. initialize the current and maximum length and indices
        2. loop and compare by updating the maximum length and its index
        3. print the obtained result with maximum index and the maximum substring by including its maximum length.

 */

public class Q20LongestSubstring {

    public static void main(String[] args) {

        String str = "aabbbbCCddd";

        int curLen = 1;
        int curIndex = 0;
        int maxLen = 0;
        int maxIndex = 0;

        for (int i = 1; i < str.length(); i++) {
            if (str.toCharArray()[i - 1] == str.toCharArray()[i]) {
                curLen++;

            } else {

                if (curLen > maxLen) {

                    maxLen = curLen;
                    maxIndex = curIndex;
                }

                curIndex = i;
                curLen = 1;

            }

        }

        if (curLen > maxLen) {
            maxLen = curLen;
            maxIndex = curIndex;

        }

        System.out.println("The maximum string index is: " + (maxIndex));
        //System.out.println("The maximum string length is" + maxLen);

        System.out.println("The maximum sub string is: " + str.substring(maxIndex,(maxIndex+maxLen)));
    }
}




    
