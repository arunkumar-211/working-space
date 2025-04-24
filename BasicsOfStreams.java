
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;


public class BasicsOfStreams {


    public static boolean isPrime(int num) {
            if(num <= 1) {
                return false;
            }

            return IntStream.rangeClosed(2, (int)Math.sqrt(num)).noneMatch(obj->num % obj == 0);
        }


    public static List<Integer> getEvenNums(List<Integer> nums) {

        return nums.stream().filter(obj -> obj % 2 == 0).collect(Collectors.toList());

    }


    public static List<Integer> getOddNums(List<Integer> nums) {
        return nums.stream().filter(obj -> obj % 2 != 0).collect(Collectors.toList());
        
    }


    public static Integer getSums(List<Integer> nums) {
        return nums.stream().mapToInt(Integer::intValue).sum();
        
    }

    public static Integer getMax(List<Integer> nums) {
        return nums.stream().max(Integer::compare).orElseThrow(()->new RuntimeException("The List is empty"));
        
    }

    public static List<String> getWordsOfA(List<String> str) {
        return str.stream().filter(obj -> obj.startsWith("A")).collect(Collectors.toList());
        
    }

    public static OptionalDouble getEvenAvgNums(List<Integer> nums) {
        return nums.stream().filter(obj -> obj % 2 == 0).mapToInt(Integer::intValue).average();
        
    }

    public static List<String> getStrUpperCase(List<String> str) {
        return str.stream().map(String::toUpperCase).collect(Collectors.toList());
        
    }


    public static List<Integer> getRemoveDupAndSort(List<Integer> nums) {
        return nums.stream().distinct().sorted().collect(Collectors.toList());       
    }


    public static void getGroupStrByLen(List<String> str) {
        str.stream().collect(Collectors.groupingBy(String::length)).forEach((len, strList)->System.out.println("length: "+ len +""+ "String: "+strList));
        
    }

    public static String getConcatenatedStr(List<String> str) {
        return str.stream().collect(Collectors.joining(", "));       
    }

    public static Optional<String> getGreaterStr(List<String> str) {
        return str.stream().filter(obj -> obj.length() > 5).findFirst();       
    }

    public static List<String> getFlatMapList(List<List<String>> listOfLists) {
        return listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());       
    }


    public static List<Integer> getDoubleValList(List<Integer> nums) {
        return nums.stream().map(obj -> obj * 2).collect(Collectors.toList());
        
    }

    public static Optional<Integer> getFindFirstNumDivByThree(List<Integer> nums) {
        return nums.stream().filter(obj-> obj % 3 == 0).findFirst();
        
    }

    public static void getPrimeNums(int start, int end) {
       IntStream.rangeClosed(start, end).filter(BasicsOfStreams::isPrime).forEach(obj->System.out.print(obj+" "));
        
    }

   

    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1, 2, 13, 4, 5, 6, 7, 8, 9, 10, 10);
        List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Peach", "Apricot", "Berry");
        List<List<String>> listOfLists = Arrays.asList(Arrays.asList("apple", "banana"), Arrays.asList("cherry", "date"), Arrays.asList("kiwi", "lemon"));


        System.out.println("The even numbers in the list are: "+getEvenNums(nums));
        System.out.println("The odd numbers in the list are: "+getOddNums(nums));
        System.out.println("The sum of the numbers in the list is: "+getSums(nums));
        System.out.println("The max of the numbers in the list is: "+getMax(nums));
        System.out.println("The strings starting with 'A' in the list are: "+getWordsOfA(words));
        System.out.println("The average of even numbers in the list is: "+getEvenAvgNums(nums));
        System.out.println("The String after converting to uppercase in the list are: "+getStrUpperCase(words));
        System.out.println("The list after removing the duplicates and sorting is: "+getRemoveDupAndSort(nums));
        getGroupStrByLen(words);
        System.out.println("The list after concatenation is: "+getConcatenatedStr(words));
        System.out.println("The first string with length greater than five is: "+getGreaterStr(words));
        System.out.println("The list of lists when flatmapped becomes: "+getFlatMapList(listOfLists));
        System.out.println("The result in the list after doubled becomes: "+getDoubleValList(nums));
        System.out.println("The first element divided by three in the list is: "+getFindFirstNumDivByThree(nums));
        getPrimeNums(1, 100);


    }


}