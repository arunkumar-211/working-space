/*The following is a puzzle. You could code this but ideally you're supposed to (or asked to) give the answer by solving it on paper.

You are given 100 bulbs. There are going to be 100 iterations, in each iteration you toggle the switch for bulbs numbered by the multiples of the iterating variable. Return the number of bulbs remaining after all the 100 passes.      

    As in, in the 1st iteration - all the bulbs with the multiples of 1 would be toggled.            
               in the 2nd iteration - all the bulbs with only multiples of 2 would be toggled.


Algorithm:-
    1. consider the boolean array of bulb elements
    2. iterate each bulb with its multiples and toggle
    3. return the counts of the bulb which remains on.

*/ 


class Q25BulbProb {

    public static int bulbCount(int n) {
        
        boolean bulbs[] = new boolean[n+1];
        int count = 0;

        for(int i = 1; i < bulbs.length; i++) {

            for(int j = i; j < bulbs.length; j++) {

                if(j % i == 0) {

                    bulbs[i] = !bulbs[i];
                }

            }
        }


        
        for(int j = 1; j < bulbs.length; j++) {

            if(bulbs[j]) {
                count++;
            }

        }


        return count;

    }



    public static void main(String[] args) {
        int count = bulbCount(100);
        System.out.println("The on bulb count is: "+count);
    }

}