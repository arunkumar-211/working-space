//Q.16. Find the number is power of ten or not
//Algorithm :-
//1. check for num <= 0 and return false if true
//2. check for num % 10 == 0 and loop the output for num = num / 10
//3. check for num == 1 and retur the result.



public class Q14CheckPowOfTen {

    public static boolean checkForPowOfTen(int num) {


        if(num  <= 0 ) {
            return false;
        }

        while(num % 10 == 0) {
            num = num/10;
        }

        return (num == 1);
    }

    public static void main(String[] str) {
        //int num = 1000;
        int num = 101;

        boolean res = checkForPowOfTen(num);

        System.out.println(res);


    }
    
}