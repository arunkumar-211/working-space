// Given the string (containing directions e.g., U, R, D, L) and initial coordinates (0,0),
// return the final coordinates after traversing the string.

// Examples:
// Given (0,0) and String - "UUU"
//     Answer : (0,3)

// Given (0,0) and String - "URRDDL"
//     Answer : (1,-1)

//  Algorithm :-
//  1. compare the given string with 'URDL'
//  2. increase the x and y axes 
//  3. return the co-ordiantes


public class Q4StringDirections {

    public static int[] getAxes(String str){

        String ref = "URDL";
        int[] res  = new int[2];

        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < ref.length(); j++) {
                if( str.toCharArray()[i] == ref.toCharArray()[j]){   
                    if(j == 0){
                        res[1] += 1;
                    }else if (j == 1) {
                        res[0] += 1;
                    }else if (j == 2) {
                        res[1] -= 1;
                    }else {
                        res[0] -= 1;
                    }
                }
            }

        }
        return res;

    }



    
    public static void main(String[] strings) {
        //String str = "URRDDL";
        String str = "UUU";
        int[] axes = getAxes(str);
        System.out.println("The axes are:" + "("+ axes[0]+","+axes[1]+")");
    }
}