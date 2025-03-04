package Patterns;
import java.util.*;
public class g {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        for(int r = 1;r<=a;r++)
        {
            for(int c = 1;(r+c)<=2*a;c++)
            {
                if((r == 1 && (r+c) >= a+1) || r == a || (r+c)==a+1 || (r+c)==2*a)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}