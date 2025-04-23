/*
Given an array of integers,
    sort it in a wave form.
    [ The order of elements in a wave form:
       arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= ….. ]

Example:
    int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
    Answer : arr[] = {10, 5, 6, 2, 20, 3, 100, 80} OR {20, 5, 10, 2, 80, 6, 100, 3}


Algorithm :-
    1. sort the array
    2. swap the arrray in a loop
    3. increase the index difference to 2. i.e..,i += 2
    4. return the obtained final array result


*/


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;


public class Q28WaveformProb {


    public static int[] getWaveform(int[] arr) {

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i+=2) {           
           
           int temp = arr[i];
           arr[i] = arr[i+1];
           arr[i+1] = temp;

        }

        return arr;
       

    }






    public static void main(String[] args) {

        int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};

       int[] res = getWaveform(arr);

        System.out.println("The resultant waveform array is:"+ Arrays.toString(res));

        

    }

}