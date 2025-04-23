/*Given a list of student names and corresponding marks,
    return the highest average marks (and print the corresponding student name - optional).
    The marks can be negative as well and a student may have multiple marks.

Example:
 String[][] = {{“Charles”, 84},
                      {“John”, 100},
                      {“Andy”, 37},
                      {“John”, 23},
                      {“Charles”, 20}};

    //Return 61.5 (which is of John's)*/

//Algorithm :-
//1. loop the array and map the duplicate names by creating an array of marks with count
//2. calculate the average and store the highest average name
//3. print the obtained result

import java.util.HashMap;
import java.util.Map;

public class Q15AvgOfStudents {

    public static void main(String[] strings) {

        Map<String, int[]> allMarksMap = new HashMap<>();
        String maxAvgName = "";
        double maxAvgMarks = Double.MIN_VALUE;

        String[][] orgStrings = { { "Charles", "84" },
                { "John", "100" },
                { "Andy", "37" },
                { "John", "23" },
                { "Charles", "20" } };

        for (String[] o : orgStrings) {
            String n = o[0];
            Integer m = Integer.parseInt(o[1]);

            if (allMarksMap.containsKey(n)) {
                allMarksMap.get(n)[0] += m;
                allMarksMap.get(n)[1] += 1;
            } else {
                allMarksMap.put(n, new int[] { m, 1 });
            }
        }

        for (Map.Entry<String, int[]> amm : allMarksMap.entrySet()) {
            String tempAvgName = amm.getKey();
            double tempAvgMarks = ((double) amm.getValue()[0] / amm.getValue()[1]);

            if (tempAvgMarks > maxAvgMarks) {
                maxAvgMarks = tempAvgMarks;
                maxAvgName = tempAvgName;
            }

        }
        System.out.println("The person with max average and marks is: " + maxAvgName + ":" + maxAvgMarks);

    }

}