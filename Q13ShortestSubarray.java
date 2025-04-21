//Q13. Return the length of the shortest sub-array which matches the given sum, If it doesn't exist return -1.
//int[] arr = {2, 4, 6, 10, 2, 1}, K=12, return 2
// Algorithm :-
//1. initialize the start = 0, currentSum = 0 and iterate the loop for end
//2. find the current sum and compare with the required sum
//3. save the mininmum length = end - start + 1 and increment the start
//4. At last compare for minimum and return the retained result or -1



public class Q13ShortestSubarray {

    public static int getMinLen(int a[], int k) {

        int start = 0;
        int currentSum = 0;
        int min = Integer.MAX_VALUE;

        for(int end = 0; end < a.length; end++){
            currentSum += a[end];
            
            while(currentSum >= k) {

                min = Math.min(min, (end-start+1));
                currentSum -= a[start];
                start++;

            }
        }

        return (min == Integer.MAX_VALUE) ? -1 : min;

    }


    public static void main(String[] args) {
       // int arr[] = {2, 4, 6, 10, 2, 1};
       int arr[] = {5, 8, 50, 4};
        int K = 12;

        int res  = getMinLen(arr, K);
        System.out.println("the shortest subarray is: "+res);


    }
    
}
