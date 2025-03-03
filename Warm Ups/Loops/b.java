package Loops;
import java.util.*;
public class b {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt(),f = 1;
        for(int i = 1;i<=a;i++)
        {
            f*=i;
        }
        System.out.println("Factorial = "+f);
        sc.close();
    }
}