package Array;

public class reverseArray {
    public static void main(String[] args) {
        int arr[] = {434,5,3,32,45,453,44,53,543,3,54,35};
        Solution.rev(arr);
    }
}
class Solution {
    public static void rev(int arr[]) {
        for(int i = 0, j = arr.length-1;i<j;i++,j--)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}