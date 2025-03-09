package Patterns;
import java.util.*;
public class j {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        for(int r = 1;r<=a;r++)
        {
            for(int c = 1;(c-r)<a;c++)
            {
                if((c+r) > a)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int r = 1;r<=a;r++)
        {
            for(int c = 1;(c+r)<=2*a;c++)
            {
                if(c>=r)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}