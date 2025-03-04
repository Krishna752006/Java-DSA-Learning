package Patterns;
import java.util.*;
public class c {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        for(int r = 1;r<=a;r++)
        {
            for(int c = 1;c<=a;c++)
            {
                if((r + c) <= (a+1))
                {
                    System.out.print(c);
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