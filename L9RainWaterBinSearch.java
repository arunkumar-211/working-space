/*


mountain = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
output = 6

Algorithm :-
    1. get the left index and the right index
    2. within the for loop of left index less than right index, check if the left element lesser than the right element
    3. if the left element greater than or equal to leftMax than update the leftMax
    4. else subtract the current element from the leftMax and load to trap
    5. if right element greater than the left element and also right element greater than or equal to rightMax than update the rightMax
    6. else subtract the current element from the rightMax and load to trap
    7. return the trap.

*/

class L9RainWaterBinSearch {


    public static int getTrappedCount(int arr[]) {

        int left = 0, right = arr.length-1, trappedCount = 0, leftMax = 0, rightMax = 0;

        while(left < right) {

            if(arr[left] < arr[right]) {
                if(arr[left] >= leftMax) {
                    leftMax = arr[left];
                }else {
                    trappedCount += leftMax - arr[left];
                }

                left++;

            }else {

                 if(arr[right] >= rightMax) {
                    rightMax = arr[right];
                }else {
                    trappedCount += rightMax - arr[right];
                }

                right--;

            }




        }

        return trappedCount;

    }



    public static void main(String[] args) {

        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int trappedCount = getTrappedCount(arr);
        System.out.println("The rain water trapped count with binary search is: "+trappedCount);


    }

}