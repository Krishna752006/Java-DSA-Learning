public class d {
    public static int pregrt(int a[], int k) {
        int max = 0;
        for (int i = 0; i < k; i++) {
            max = Math.max(max, a[i]);
        }
        return max;
    }

    public static int nextgrt(int a[], int k) {
        int max = 0;
        for (int i = k + 1; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int sum = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            int p = pregrt(nums, i);
            int n = nextgrt(nums, i);
            int trapped = Math.min(p, n) - nums[i];
            if (trapped > 0) {
                sum += trapped;
            }
        }
        System.out.println("Total: " + sum);
    }
}