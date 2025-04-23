//Q2. Given a dictionary (list of words) and a substring, you have to return the length of the longest word in the dictinary containing the substring.
//Example:
//String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"}
//String toSearch = "ODG";

//Returns 9 (LODGESSSS)

//Algorithm :-
//1. loop through the string arrays
//2. check the substring's presence with the original array
//3. return the the resultant string matching the substring with maximum length in the original array.


public class Q2MaxOfString {

    public static int getMaxStrLen(String[] strings, String string) {
        int max = Integer.MIN_VALUE;
      
        for(int i = 0; i < strings.length; i++) {
            for(int j = 0; j <= (strings[i].length() - string.length()); j++) {
                if(strings[i].substring(j,(j+string.length())).equals(string)) {
                    if(strings[i].length() > max) {
                        max = strings[i].length();
                        break;
                    } 
                }
            }
        }

        return max;
    }


    public static void main(String[] strings) {
        
        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch = "ODG";

        int maxLen = getMaxStrLen(dict, toSearch);

        System.out.println(maxLen);



    }
    
}
