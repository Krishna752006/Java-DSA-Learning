package Patterns;
import java.util.*;
public class a {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int a = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int b = sc.nextInt();
        for(int r = 1;r<=a;r++)
        {
            for(int c = 1;c<=b;c++)
            {
                if(r == 1 || r == a || c == 1 || c == b)
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