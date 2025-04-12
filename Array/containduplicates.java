package Array;

    public class containduplicates {
        public static void main(String[] args) {
            int arr[] = {12,3,3,4,4,2,3,2,4,4};
            System.out.println(Solution.containsDuplicate(arr));
        }
    }
    
    class Solution {
        public static boolean containsDuplicate(int[] nums) {
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for (int i=0;i<nums.length;i++){
                if (nums[i]<min || nums[i]>max){
                    min=Math.min(min,nums[i]);
                    max=Math.max(max,nums[i]);
                    continue;
                }
                for (int j=0;j<i;j++){
                    if (nums[i]==nums[j]){
                        return true;
                    }
                }
            }
            return false;
        }
    }
