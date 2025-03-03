package Functions;
import java.util.*;
public class e {
    public static int sum(int a)
    {
        int s = 0;
        if (a<10 && a > -1)
        {
            return a;
        }
        while(a>0)
        {
            int d = a%10;
            a/=10;
            s += d;
        }
        return s;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Sum of its Digits = " + sum(a));
        sc.close();
    }
}