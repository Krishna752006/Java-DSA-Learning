package Patterns;
import java.util.*;
public class e {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        for(int r = 1;r<=a;r++)
        {
            for(int c = 1;c<=a;c++)
            {
                if((r + c) <= 2*r)
                {
                    if (( r+c) % 2 == 0)
                    {
                        System.out.print(1);
                    }
                    else
                    {
                        System.out.print(0);
                    }
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