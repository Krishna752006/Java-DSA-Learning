package Array;

import java.util.Arrays;

public class transformparity {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,2};
        System.out.println(Arrays.toString(Solution.transformArray(arr)));
    }
}
class Solution {
    public static int[] transformArray(int[] nums) {
        int n = nums.length,count = 0;
        for(int i =0;i<n;i++)
        {
            if(nums[i]%2==0)
            count++;
        }
        Arrays.fill(nums,0,count,0);
        Arrays.fill(nums,count,n,1);
        return nums;
    }
}