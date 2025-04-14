import java.util.Arrays; // Don't forget to import Arrays

public class concatenation {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1};
        System.out.println(Arrays.toString(Solution.getConcatenation(arr)));
    }
}

class Solution {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2 * n];
        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);
        return ans;
    }
}