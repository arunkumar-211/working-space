class Calculate {

    public int getCalculation(int a, int b) {
        return (a + b);
    }

}

class Add extends Calculate {

    @Override
    public int getCalculation(int a, int b) {
        return (a - b);
    }

}

public class Q30Overriding {


    public static void main(String[] args) {

        Calculate calculate1 = new Calculate();
        Add calculate2 = new Add();

        int res1 = calculate1.getCalculation(1, 2);
        int res2 = calculate2.getCalculation(1, 2);

        System.out.println("The calculation when added is: "+res1);
        System.out.println("The calculation when subtracted is: "+res2);

    }



} 