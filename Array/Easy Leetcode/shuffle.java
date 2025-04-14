import java.util.Arrays;

public class shuffle {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,2};
        System.out.println(Arrays.toString(Solution.shuffle(arr, 3)));
    }
}

class Solution {
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int i = 0, j = n, k = 0;
        while (i < n && j < 2 * n) {
            ans[k++] = nums[i++];
            ans[k++] = nums[j++];
        }
        return ans;
    }
}