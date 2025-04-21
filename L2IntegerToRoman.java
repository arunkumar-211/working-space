/*
Integer to Roman :-
  int num = 59;

Algorithm :-
    1. set the roman form of string arrays for hundreds, thousands, tens, units.
    2. find the value by dividing the number and return the result in Roman.

 */


public class L2IntegerToRoman {

    
        public static String intToRoman(int num) {
    
            String[] thousands = {"", "M", "MM", "MMM"};
            String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
            String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    
    
            return (thousands[(num)/1000] + hundreds[(num%1000)/100] + tens[(num%100)/10] + units[num%10]);
            
        }


        public static void main(String[] args){
            int num = 59;
    
            String roman = intToRoman(num);
            System.out.println("The Roman form is: " + roman);
    
    
        }
}
    

