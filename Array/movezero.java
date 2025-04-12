package Array;

import java.util.Arrays;

public class movezero {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        Solution.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}

class Solution {
    public static void moveZeroes(int[] nums) {
       int snowBallSize = 0; 
       for (int i=0;i<nums.length;i++){
           if (nums[i]==0){
               snowBallSize++; 
           }
           else if (snowBallSize > 0) {
               int t = nums[i];
               nums[i]=0;
               nums[i-snowBallSize]=t;
           }
       }
   }
}