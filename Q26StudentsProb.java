/*

A group of students are sitting in a circle. The teacher is electing a new class president. The teacher does this by singing a song while walking around the circle. After the song is finished the student at which the teacher stopped is removed from the circle. Starting at the student next to the one that was just removed, the teacher resumes singing and walking around the circle. After the teacher is done singing, the next student is removed. The teacher repeats this until one student is left.
A song of length k will result in the teacher walking past k students on each round. The students are numbered 1 to n. The teacher starts at student 1.
For example, suppose the song length is two(k=2). And there are four students to start with (1,2,3,4). The first student to go would be '2', after that '4', and after that '3’. Student '1' would be the next president in this example.

    n - the number of students sitting in a circle
    k - the length (in students) of each song.

return the number of the student that is elected.

Algorithm :-
    1. consider the while loop for student size always greater than 1
    2. find the index to remove the student from the list using the formula ((sudent.size()-k-1)%student.size())
    3. return the left out first indexed element from the list.

*/

import java.util.*;

public class Q26StudentsProb {


    public static Integer getFinalStudent(List<Integer> students, int k) {
        int index = 0;
        while(students.size() > 1) {
            index = (index+k-1)%students.size();
            students.remove(index);
        }

        return students.get(0);

    }


    public static void main(String[] args) {

        List<Integer> students = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int k = 2;

        Integer res = getFinalStudent(students, k);
        System.out.println("The final student left out is: "+res);




    }


}