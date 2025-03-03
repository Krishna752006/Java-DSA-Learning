package Functions;
import java.util.*;
public class c {
    public static boolean ispalin(int a)
    {
        int b =a,c = 0;
        if (a<10)
        {
            return false;
        }
        while(a>0)
        {
            int d = a%10;
            a/=10;
            c = c*10 + d;
        }
        return (b == c ? true : false);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("The given number is palindrome? Ans: " + ispalin(a));
        sc.close();
    }
}