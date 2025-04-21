/*Given a string,
    return the pallindrome of maximum length and its length. 
    (So, you return both the relevant pallindrome substring and its length).

Example:
    String str = "forgeeksskeegfor";    // Return {"geeksskeeg",  10}

Algorithm :-
    1. loop the main string
    2. compare the letters from front and the end of the string
    3. continue with the comparison if it fails
    4. otherwise store the result temporarily in the string with its length
    5. compare for the maximum length and save including its string in the permanent variable
    6. store those collected palindrome string and its length in the result list at last
    7. return the list as a result

*/
<<<<<<< HEAD
import java.util.*;

=======

import java.util.*;
>>>>>>> origin/technical-logics

class Q24MaxPalindrome {

    public static List<Object> maxPalindrome(String str) {
        String tempStr1 = "";
        String tempStr2 = "";
        String resStr = "";
        Integer reslen = Integer.MIN_VALUE;

        for(int i = 0; i < str.length(); i++){
            if(str.toCharArray()[i] == str.toCharArray()[str.length()-1-i]) {
                tempStr1 += str.toCharArray()[i];
                tempStr2 += str.toCharArray()[str.length()-1-i];
                //resStr = "";
                
                for(int j = (i+1); j < str.length(); j++) {
                    if(str.toCharArray()[j] == str.toCharArray()[str.length()-1-j]) {
                        tempStr1 += str.toCharArray()[j];
                        tempStr2 += str.toCharArray()[str.length()-1-j];

                    }else {
                        if(tempStr1.length() > reslen) {
                            reslen = tempStr1.length();
                            resStr = tempStr1;
                            tempStr1 = "";
                            tempStr2 = "";
                            break;
                        }
                        tempStr1 = "";
                        tempStr2 = "";
                        break;
                    }

                }
            }
        }

        List<Object> resList = new ArrayList<>();
        resList.add(resStr);
        resList.add(reslen);
        
        return resList;


    }



    public static void main(String[] args){

        String str = "forgeeksskeegfor"; 
        List<Object> res = maxPalindrome(str);

        System.out.println("the max palindrome with length: "+res);

    }



}