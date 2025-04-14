import java.io.*;
import java.util.*;

public class chocolatedistribution {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 4, 1, 9, 56, 7, 9, 12));
        System.out.println(Solution.findMinDiff(arr,5));
    }
}

class Solution {
    public static int findMinDiff(ArrayList<Integer> arr, int m) {
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<=arr.size()-m;i++)
        {
            min = Math.min(min,arr.get(i + m - 1)-arr.get(i));
        }
        return min;
    }
}