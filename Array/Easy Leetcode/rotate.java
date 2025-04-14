import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        Solution.rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}

class Solution {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] ans = new int[n];
        System.arraycopy(nums, n - k, ans, 0, k);
        System.arraycopy(nums, 0, ans, k, n - k);
        System.arraycopy(ans, 0, nums, 0, n);
    }
}
