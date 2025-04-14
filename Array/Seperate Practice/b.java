public class b {
    public static void main(String[] args) {
        int nums[] = {2,3,7,8,9,10,0,1};
        int target = 19, l = 0, r = nums.length - 1;
        while(l<=r)
        {
            int mid = l + (r - l)/2;
            if (nums[mid] == target)
            {
                System.out.println("Found at index: " + mid);
                System.exit(0);
            }
            else if(nums[l] < nums[mid])
            {
                if(target >= nums[l] && target <= nums[mid])
                {
                    r = mid - 1;
                }
                else
                {
                    l = mid + 1;
                }
            }
            else if(nums[mid] < nums[r])
            {
                if(target >= nums[mid] && target <= nums[r])
                {
                    l = mid + 1;
                }
                else
                {
                    r = mid - 1;
                }
            }
        }
        System.out.println("Element Not Found");
    }
}
