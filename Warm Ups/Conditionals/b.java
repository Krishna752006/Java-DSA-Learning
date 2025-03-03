package Conditionals;
import java.util.*;
public class b {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temperature: ");
        double a = sc.nextDouble();
        if(a>=100)
        {
            System.out.println("You Have a Fever.");
        }
        else{
            System.out.println("You do not have a Fever.");
        }
        sc.close();
    }
}