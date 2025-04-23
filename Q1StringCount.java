//Q1. Write a program to count the letters in the given string :-
//aababbccde
//ans :- a3b3c2d1e1

//Algorithm :-
//1. create a map
//2. count the repeatition of characters
//3. return the map


import java.util.HashMap;
import java.util.Map;

public class Q1StringCount {

    public static void main(String[] args) {

        String str = "aababbccde";

        HashMap<Character, Integer> map = new HashMap<>();

        for (Character c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> m: map.entrySet()) {

            System.out.print((Character)m.getKey()+""+m.getValue());

        }

    }



}