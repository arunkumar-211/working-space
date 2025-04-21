/*

Remove Duplicates from Sorted Array
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]

Algorithm :-
    1. consider a for loop
    2. take a unique index and initialize to zero
    3. increase the unique index and assign the current element
    4. return the updated unique index + 1 count.


*/

class L4RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        
        int uniqueIndex = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[uniqueIndex] != nums[i]) {

                uniqueIndex++;
                nums[uniqueIndex] = nums[i]; 
            }
        }

        return (uniqueIndex+1);

        
    }


    public static void main(String[] args){

        int nums[] = {1,1,2};

        int uniqueIndex = removeDuplicates(nums);
        System.out.println("The length of the unique index is: " + uniqueIndex);


    }
}