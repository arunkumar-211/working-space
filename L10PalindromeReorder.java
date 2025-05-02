/*
Algorithm :-
  1. declare a HashSet
  2. loop and check the string index wise
  3. store the letter if not contained in the list
  4. else increase the result count to 2
  5. delete the element in the set after updating the count
  6. check for the size of the set and add 1 to the count if size is more than zero.
  7. print the result count.

 */

import java.util.*;

class Solution {
  public static void main(String[] args) {
    String str = "abccccdd";
    Set<Character> palindromeSet = new HashSet<>();
    int resultCount = 0;

    for(int i = 0; i < str.length(); i++) {
        if(palindromeSet.contains(str.charAt(i))) {
          resultCount += 2;
          palindromeSet.remove(str.charAt(i));
          
        }else {
          palindromeSet.add(str.charAt(i));       
          
        }
    }

    if(palindromeSet.size() > 0) {
      resultCount++;
    }

    System.out.println("The result count is: "+resultCount);

  }
}
