//Find the first unique in String str = "13451234";
 
 //Algorithm :-
 //1. create a hashmap
 //2. store the repeated letter numbers in it
 //3. retrieve each element from the map and check for repeatition
 //4. return the single repeated character
 

 import java.util.LinkedHashMap;
 import java.util.Map;
 
 public class Q8FirstUniqueCharacter {
       


    public static char getUniqueCharacterUsingMap(String input) {
         LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
         char res='\0';
 
         for(Character c:input.toCharArray()) {
             map.put(c, (map.getOrDefault(c, 0)) + 1);
         }
 
 
         for(Map.Entry<Character, Integer> e: map.entrySet()) {
             if(e.getValue() == 1) {
                res = e.getKey();
                break;
             }
         }

        return res;

    }

    public static char getUniqueCharacterUsingAscii(String input) {
       
        int asciiVal[] = new int[128];
        char res = 0;
 
        for(char c:input.toCharArray()) {
            asciiVal[c]++;
        }
 
 
        for(char c:input.toCharArray()) {
            if(asciiVal[c] == 1){
                res = c;
                break;
            }
         }

        return res;

    }




     public static void main(String[] args) {
 
         String str = "13451234";

        char res1 = getUniqueCharacterUsingMap(str);
        char res2 = getUniqueCharacterUsingAscii(str);

        System.out.println("first unique character using map is: "+res1);
        System.out.println("first unique character using ascii is: "+res2);
 
        
 
 
 
     }
 }