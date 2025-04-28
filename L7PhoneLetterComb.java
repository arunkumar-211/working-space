/*
Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]


Algorithm :-
    1. check for the null value and return null if true
    2. apply recursion if length is not null 
    3. check for length 0 and return it if true
    4. else extract the letters from the first index and combine using the recursion
    5. delete the each combination of string builder
    6. add the each combination mean while to the array list
    7. return the void
    8. atlast get the root arraylist to the main.

*/

import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.ArrayList;

public class L7PhoneLetterComb {

    private static String[] mobKeypad = {
        "","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };



    public static void phoneCombRecursion(List<String> result, String digits, StringBuilder stringBuilder, Integer index){

            if(index == digits.length()) {
                result.add(stringBuilder.toString());
                return;
            }

           
            String letters = mobKeypad[(int)digits.charAt(index) - '0'];
            
            for(char letter: letters.toCharArray()) {

                stringBuilder.append(letter);
                phoneCombRecursion(result, digits, stringBuilder, index+1);
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);


            }


    }




    public static List<String> getPhoneComb(String digits) {

        List<String> result = new ArrayList();
        StringBuilder stringBuilder = new StringBuilder();
        Integer index = 0;

        if(digits == null || digits.length() == 0) {
            return result;
        }

        phoneCombRecursion(result, digits, stringBuilder, index);
        return result;






        
    }



    public static void main(String[] args) {

        String digits = "23";

        List<String> res = new L7PhoneLetterComb().getPhoneComb(digits); 
        System.out.println("The combination of given digit is: "+ res);

    }
}



