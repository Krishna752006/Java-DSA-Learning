package Patterns;
import java.util.*;
public class i {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        for(int r = 1;r<=a;r++)
        {
            int k = r;
            for(int c = 1;(c-r)< a;c++)
            {
                if((r+c) > a && c <= a)
                {
                    System.out.print(k);
                    if(k != 1)
                    {
                       k--;  
                    }     
                }
                else if((r+c) > a && c > a)
                {
                    k++;
                    System.out.print(k);
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