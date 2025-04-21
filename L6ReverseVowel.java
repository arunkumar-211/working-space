/*

input :- Icecreams
output :- acecreIms


Algorithm :-
    1. loop and find the vowel
    2. move at last and swap with the one found from the end index
    3. return the reversed form of vowel result


*/


public class ReverseVowel {

    public static StringBuilder reverseVowel(String input) {

        StringBuilder inputStringBuilder = new StringBuilder(input);
        int index = (inputStringBuilder.length() - 1);

        if(inputStringBuilder.length() % 2 == 0) {
        for(int i = 0; i < (inputStringBuilder.length()/2); i++) {
           
            if(inputStringBuilder.charAt(i) == 'a' || inputStringBuilder.charAt(i) == 'e' || inputStringBuilder.charAt(i) == 'i' || inputStringBuilder.charAt(i) == 'o' || inputStringBuilder.charAt(i) == 'u' || inputStringBuilder.charAt(i) == 'A' || inputStringBuilder.charAt(i) == 'E' || inputStringBuilder.charAt(i) == 'I' || inputStringBuilder.charAt(i) == 'O' || inputStringBuilder.charAt(i) == 'U') {

                while((index >= 0) && !(inputStringBuilder.charAt(index) == 'a' || inputStringBuilder.charAt(index) == 'e' || inputStringBuilder.charAt(index) == 'i' || inputStringBuilder.charAt(index) == 'o' || inputStringBuilder.charAt(index) == 'u' || inputStringBuilder.charAt(i) == 'A' || inputStringBuilder.charAt(i) == 'E' || inputStringBuilder.charAt(i) == 'I' || inputStringBuilder.charAt(i) == 'O' || inputStringBuilder.charAt(i) == 'U')) {
                    index--;
                }

                if(inputStringBuilder.charAt(index) == 'a' || inputStringBuilder.charAt(index) == 'e' || inputStringBuilder.charAt(index) == 'i' || inputStringBuilder.charAt(index) == 'o' || inputStringBuilder.charAt(index) == 'u' || inputStringBuilder.charAt(i) == 'A' || inputStringBuilder.charAt(i) == 'E' || inputStringBuilder.charAt(i) == 'I' || inputStringBuilder.charAt(i) == 'O' || inputStringBuilder.charAt(i) == 'U') {
                    char temp =  inputStringBuilder.charAt(i);
                    inputStringBuilder.setCharAt(i, inputStringBuilder.charAt(index));
                    inputStringBuilder.setCharAt(index, temp);

                }

                index--;

            }
        }

        }else {
           for(int i = 0; i <= (inputStringBuilder.length()/2); i++) {
           
            if(inputStringBuilder.charAt(i) == 'a' || inputStringBuilder.charAt(i) == 'e' || inputStringBuilder.charAt(i) == 'i' || inputStringBuilder.charAt(i) == 'o' || inputStringBuilder.charAt(i) == 'u' || inputStringBuilder.charAt(i) == 'A' || inputStringBuilder.charAt(i) == 'E' || inputStringBuilder.charAt(i) == 'I' || inputStringBuilder.charAt(i) == 'O' || inputStringBuilder.charAt(i) == 'U') {

                while((index >= 0) && !(inputStringBuilder.charAt(index) == 'a' || inputStringBuilder.charAt(index) == 'e' || inputStringBuilder.charAt(index) == 'i' || inputStringBuilder.charAt(index) == 'o' || inputStringBuilder.charAt(index) == 'u' || inputStringBuilder.charAt(index) == 'A' || inputStringBuilder.charAt(index) == 'E' || inputStringBuilder.charAt(index) == 'I' || inputStringBuilder.charAt(index) == 'O' || inputStringBuilder.charAt(index) == 'U')) {
                    index--;

                }



                if(inputStringBuilder.charAt(index) == 'a' || inputStringBuilder.charAt(index) == 'e' || inputStringBuilder.charAt(index) == 'i' || inputStringBuilder.charAt(index) == 'o' || inputStringBuilder.charAt(index) == 'u' || inputStringBuilder.charAt(index) == 'A' || inputStringBuilder.charAt(index) == 'E' || inputStringBuilder.charAt(index) == 'I' || inputStringBuilder.charAt(index) == 'O' || inputStringBuilder.charAt(index) == 'U') {
                    char temp =  inputStringBuilder.charAt(i);
                    inputStringBuilder.setCharAt(i, inputStringBuilder.charAt(index));
                    inputStringBuilder.setCharAt(index, temp);

                }

                index--;

            }
        }

        }

        return inputStringBuilder;

    }

       

    public static void main(String[] strings) {

        String input = "Icecreams";
        StringBuilder res = reverseVowel(input);

        System.out.println("The reverse form of vowel is: "+reverseVowel(input));


    }

}



