/*
Search in Rotated Sorted Array

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

Algorithm :-
1. It is same as Binary search
2. initialize the left most index and the right most index
3. find the mid index
4. return the target index immediately if the target matches the mid indexed element
5. else compare the margin between left to very next to mid and from the mid to very next to right by returning the suitable target's index
6. if failed then return -1

*/

class L5SearchArray {
    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;
        int mid = 0;

        while(left <= right) {
            mid = left + (right - left)/2;
        

            if(nums[mid] == target) {
                return mid;
            }

            if(nums[left] <= nums[mid]) {
                
                if((target >= nums[left]) && (target < nums[mid])){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }

            
            }else {

                if((target > nums[mid]) && (target <= nums[right])){
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }

            }


        }

        return -1;  


        
    }


    public static void main(String[] args){

        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int searchIndex = search(nums, target);
        System.out.println("The search index is: " + searchIndex);


    }
}
