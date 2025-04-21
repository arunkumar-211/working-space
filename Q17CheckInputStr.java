/*Given a dictionary (list of words) and a word,
    return an array of strings that can be formed from the given word.
    [Every letter in the input word can occur only once in the word to be returned].

Examples:
    String[] dict = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
    String input = "abcd";
    // Return {"abcd", "bcad"}

    String[] dict =  {"ab", "abcd", "bcdaf", "bcad", "acaab", "acab"};
    String input = "caab";
    // Return {"acab"} */

/* Algorithm :-
1. loop through the string array
2. sort the input 
3. sort the each string
4. compare with the input
5. save the obtained original array in the string array as result
6. return the result 
*/

import java.util.Arrays;
import java.util.stream.Collectors;

public class Q17CheckInputStr {


    public static void main(String[] args) {
        // String[] dict = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
        // String input = "abcd";
        // Return {"abcd", "bcad"}

        String[] dict =  {"ab", "abcd", "bcdaf", "bcad", "acaab", "acab"};
        String input = "caab";
       // Return {"acab"}

        String[] res = new String[dict.length];
        int i = 0;


        for(String d: dict) {
            String inp = new String(input.chars().sorted().toArray(), 0, input.length());  
            String comp = new String(d.chars().sorted().toArray(), 0, d.length()); 

            if(inp.equals(comp)) {
                res[i] = d;
                i++;
            }


        
        } 
        
        System.out.println(Arrays.asList(res).stream().filter(obj -> obj != null).collect(Collectors.toList()));
        
    }
            
    
} 
    
