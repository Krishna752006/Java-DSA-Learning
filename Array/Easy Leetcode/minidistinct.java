public class minidistinct {
    public static void main(String[] args) {
        int arr[] = {12,3,3,4,4,2,3,2,4,4};
        System.out.println(Solution.minimumOperations(arr));
    }
}

class Solution {
    public static int minimumOperations(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[101];
        for(int i = n - 1 ; i >= 0 ; i--){
            if(seen[nums[i]])
                return i / 3 + 1;
            else seen[nums[i]] = true;
        }
        return 0;
    }
}