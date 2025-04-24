public class Q30Overloading {


    public static int add(int a, int b) {
        return (a + b);
    }

    public static double add(double a, double b) {
        return (a + b);
    }



    public static void main(String[] args) {
        int res1 = add(1, 2);
        double res2 = add(2.1, 3.1);

        System.out.println("The addition of int datatypes result is: "+res1);
        System.out.println("The addition of float datatypes result is: "+res2);

    }



} 