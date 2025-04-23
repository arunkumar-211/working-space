/*Give two fractions, the numerator and denominator represented as a pair of ints,
    return them in their simplest form after adding them.

Examples:
    {Numerator_frac1 = 1, Denominator_frac1 = 3}                // 1/3
    {Numerator_frac2 = 3, Denominator_frac2 = 9}                // 3/9
    // Return Numerator_ans = 2, Denominator_ans = 3       // 2/3

    {Numerator_frac1 = 1, Denominator_frac1 = 2}               // 1/2
    {Numerator_frac2 = 3, Denominator_frac2 = 2}               // 3/2
    // Return Numerator_ans = 2, Denominator_ans = 1      // 2/1 */

/*
    Algorithm :-
        1. calculate the denominator product and consider as a numerator
        2. calculate the numerator1 * denominator2 + numerator2 * denominator1  and consider as a denominator
        3. calculate the gcd for both numerator divided by denominator
        4. using that gcd calculate the numerator/gcd divided by denominator/gcd and return as a result.

 */

class Q21SimpleFraction {

    public static void main(String[] args) {

        int numerator_frac1 = 1, denominator_frac1 = 3;
        int numerator_frac2 = 3, denominator_frac2 = 9;
        // return Numerator_ans = 2, Denominator_ans = 3

        // int numerator_frac1 = 1, denominator_frac1 = 2;
        // int numerator_frac2 = 3, denominator_frac2 = 2;
        // Return Numerator_ans = 2, Denominator_ans = 1

        int numerator_sum = ((numerator_frac1 * denominator_frac2) + (numerator_frac2 * denominator_frac1));
        int denominator_prod = (denominator_frac1 * denominator_frac2);

        System.out.println("bye");

        int gcd = gcd(numerator_sum, denominator_prod);

        System.out.println("The result is: " + (numerator_sum / gcd) + "/" + (denominator_prod / gcd));

    }

    public static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }

        return gcd(b, (a % b));
    }

}