package Conditionals;
import java.util.*;
public class d {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int a = sc.nextInt();
        if(a%4 == 0 && a%100 != 0)
        {
            System.out.println("Leap Year.");
        }
        else if(a%400 == 0 && a%100 == 0)
        {
            System.out.println("Leap year.");
        }
        else
        {
            System.out.println("Not a Leap Year.");
        }
        sc.close();
    }
}