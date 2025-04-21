//Q. Given a document and a prefix, return all the words starting with the prefix.
//String[] arr = {"apple", "applet", "bread", "aper"};
//String prefix = "app";
//Algorithm :-
//1. get the array of strings
//2. compare each string considering the substring length from starting index
//3. put all success strings in a string array
//4. return the string array

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Q7PrefixedString {


    public static String[] getStringWithPrefix(String[] str, String preStr) {
        String[] res = new String[str.length];
        int j = 0;

        for(int i = 0; i < str.length; i++) {
            if(str[i].substring(0, (preStr.length())).equals(preStr)) {
                res[j] =  str[i];
            }
            j++;
        }

        return res;
    }

    public static void main(String[] args){
        String[] arr = {"apple", "applet", "bread", "aper"};
        String prefix = "app";

        String[] res = getStringWithPrefix(arr, prefix);
        System.out.println(Arrays.asList(res).stream().filter(obj-> obj != null).collect(Collectors.toList()));


    }


    
}
