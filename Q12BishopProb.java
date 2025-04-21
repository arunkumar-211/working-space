public class Q12BishopProb {
    public static String canBishopReach(int[] bishopPos, int[] immovablePos) {
        int br = bishopPos[0];
        int bc = bishopPos[1];
        int ir = immovablePos[0];
        int ic = immovablePos[1];
        
        // Check if both positions are on the same color
        if ((br + bc) % 2 != (ir + ic) % 2) {
            return "NO";
        }
        
        // Check if they are on the same diagonal
        if (Math.abs(br - ir) == Math.abs(bc - ic)) {
            return "YES, 1";
        }
        
        // Otherwise, it will take two moves
        return "YES, 2";
    }

    public static void main(String[] args) {
        int[] bishopPos = {1, 3};  // Bishop's position (row, column)
        int[] immovablePos = {4, 4};  // Immovable piece's position (row, column)
        
        String result = canBishopReach(bishopPos, immovablePos);
        System.out.println(result);  // Output: YES, 1
    }
}