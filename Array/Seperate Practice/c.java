public class c {
    public static void main(String[] args) {
        int nums[] = {7, 1, 5, 3, 6, 4};
        int sell = 0, buy = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] < buy)
            {
                buy = nums[i];
            }
            else{
                sell = Math.max(sell,  nums[i] - buy);
            }
        }
        System.out.println(sell);
    }
}