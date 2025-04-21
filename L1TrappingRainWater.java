/*
Trapping Rain Water
Input: height = [4,2,0,3,2,5]
Output: 9

Algorithm
1. traverse from the left and get the max
2. traverse from the right and get the max
3. compare the two left and right arrays and get the min
4. add the got minimum number as the sum
return the sum

*/

class L1TrappingRainWater {
    public static int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int trapCount = 0;

        left[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            left[i] = Math.max(left[i - 1], height[i]);

        }

        right[height.length - 1] = height[height.length - 1];
        for (int i = (height.length - 2); i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        for (int i = 0; i < height.length; i++) {
            trapCount += (Math.min(left[i], right[i]) - height[i]);
        }

        return trapCount;

    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 0, 3, 2, 5 };

        int trapCount = trap(arr);
        System.out.println("The trap count result: " + trapCount);

    }
}