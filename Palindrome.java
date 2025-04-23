public class Palindrome {

    public static boolean checkPalindrome(String str) {

        for(int i = 0; i < str.length(); i++) {
            if(!(str.toCharArray()[i] == str.toCharArray()[str.length()-1-i])) {
                
                return false;
            }


        }

        return true;

    } 


    public static void main(String[] args) {
        String str = "madam";
        boolean res = checkPalindrome(str);
        System.out.println("The palindrome check result is: "+res);

    }


}