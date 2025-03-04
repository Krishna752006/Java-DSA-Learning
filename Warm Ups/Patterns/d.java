package Patterns;
import java.util.*;
public class d {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt(), k =1;
        for(int r = 1;r<=a;r++)
        {
            for(int c = 1;c<=a;c++)
            {
                if((r + c) <= 2*r)
                {
                    System.out.print(k+ " ");
                    k++;
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