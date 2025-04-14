public class e {
    public static void main(String[] args) {
        int arr[] = {3,0,1,1,9,7}, a = 7, b = 2, c = 3;
        int count = 0;
        int i = 0, j = 1, k = 2;

        while (i < arr.length - 2) {
            int l = Math.abs(arr[i] - arr[j]);
            int m = Math.abs(arr[j] - arr[k]);
            int n = Math.abs(arr[i] - arr[k]);

            if (l <= a && m <= b && n <= c) {
                count++;
            }

            k++;

            if (k == arr.length) {
                if (j < arr.length - 2) {
                    j++;
                    k = j + 1;
                } else {
                    i++;
                    j = i + 1;
                    k = j + 1;
                }
            }
        }
        System.out.println("Count: " + count);
    }    
}