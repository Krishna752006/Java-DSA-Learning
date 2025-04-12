package Array;

import java.util.Arrays;

public class buildpermutation {
    public static void main(String[] args) {
        int arr[] = {4,5,1,4,0,2};
        System.out.println(Arrays.toString(Solution.buildArray(arr)));
    }
}

class Solution {
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        inner(nums,0);
        return nums;
    }
    public static void inner(int nums[],int i)
    {
        int n = nums.length;
        if(i>=n) return;
        int a = nums[nums[i]];
        inner(nums,i+1);
        nums[i] = a; 
    }
}