/*Given two integers representing the numerator and denominator of a fraction, 
    return the fraction in string format. 
    [If the fractional part is repeating, enclose the repeating part in parentheses].

Examples:
    Numerator = 1, Denominator = 2
    // Return "0.5"

    Numerator = 1, Denominator = -2
    // Return "-0.5"

    Numerator = 50, Denominator = 22
    // Return "2.(27)"  [Fractional part (27) is repeating, hence enclosed in paranthesis] */

/*
    Algorithm :-
        1. check for numerator == 0 and return 0
        2. check for numerator or denominator if negative value and append '-'
        3. check for divided value and append it
        4. check for fraction and append '.' if any else return the string as a whole
        5. check for divided value in the fraction and append it with respect to place starting by '1'
        6. return the recurring decimal places with parenthesis and as a string.
 */

import java.util.HashMap;
import java.util.Map;

public class Q19RecurParenthesis {

    public static void main(String[] args) {
        Integer num = 50, den = 22;
        StringBuilder stringBuilder = new StringBuilder();
        Map<Long, Integer> fractionMap = new HashMap<>();

        if (num == 0) {
            System.out.println(0);
            System.exit(0);
        }

        if ((num < 0) ^ (den < 0)) {
            stringBuilder.append("-");
        }

        long absNum = (long) Math.abs(num);
        long absDen = (long) Math.abs(den);

        stringBuilder.append(absNum / absDen);

        absNum %= absDen;

        if (absNum == 0) {
            System.out.println(stringBuilder.toString());

        } else {

            stringBuilder.append(".");
            while (absNum != 0) {

                if (fractionMap.containsKey(absNum)) {

                    stringBuilder.insert(fractionMap.get(absNum), "(");
                    stringBuilder.append(")");
                    break;

                }

                fractionMap.put(absNum, stringBuilder.length());
                absNum *= 10;
                stringBuilder.append(absNum / absDen);
                absNum %= absDen;
            }

            System.out.println(stringBuilder.toString());

        }

    }

}
