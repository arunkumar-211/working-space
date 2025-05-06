import java.util.*;


/*
s = "abc"
Output
3

Algorithm :-
    1. loop all the elements to the end
    2. consider each element and loop to the end
    3. form the substring
    4. check the string for the palindrome
    5. add the palindrome substring to the list
    6. print the result list

*/


class L11PalindromicSubstring {
public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static List<String> findAllPalindromes(String s) {
        int n = s.length();
        List<String> palindromes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String substring = s.substring(i, j + 1);
                if (isPalindrome(substring)) {
                     palindromes.add(substring);
                }
            } 
        }
        return palindromes;

    }

    public static void main(String[] args) {
        String s = "abcdcbaefgcbab";
        List<String> allPalindromes = findAllPalindromes(s);
        System.out.println("All palindrome substrings in '" + s + "' are: " + allPalindromes);
        System.out.println("All palindrome substrings in '" + s + "' are: " + allPalindromes.size());
        }
}

