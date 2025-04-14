public class a {
    public static void main(String[] args) {
        int nums[] = {13,2,3,32,2,4,34,54,55,4,66,5};
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++)
        {
            if(min > nums[i] || max < nums[i])
            {
                min = Math.min(min, nums[i]);
                max = Math.max(max, nums[i]);
                continue;
            }
            for(int j = 0;j < i;j++)
            {
                if(nums[j] == nums[i])
                {
                    System.out.println("true");
                    System.exit(0);
                }
            }
        }
        System.out.println("false");
    }
}
