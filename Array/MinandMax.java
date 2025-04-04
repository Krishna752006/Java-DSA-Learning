package Array;

public class MinandMax {
    public static void main(String args[])
    {
        int arr[] = {32,23,3,2,1,3,12,1,3,13,123,3};
        Pair p = Solution.getMinMax(arr);
        System.out.println(p.getKey() + " " + p.getValue());
    }
}
class Solution {
    public static Pair<Integer, Integer> getMinMax(int[] arr) {
        int i,min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        for(i = 0;i<arr.length;i++)
        {
            min = min > arr[i] ? arr[i] : min;
            max = max < arr[i] ? arr[i] : max;
        }
        return new Pair<>(min,max);
    }
}
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}