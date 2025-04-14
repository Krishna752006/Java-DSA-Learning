public class buyandsell {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(Solution.maxProfit(arr));
    }
}

class Solution {
    public static int maxProfit(int[] a) {
        int buy = a[0],sell = 0;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>buy)
            {
                sell = Math.max(sell,a[i]-buy);
            }
            else
            {
                buy = a[i];
            }
        }
        return sell;
    }
}