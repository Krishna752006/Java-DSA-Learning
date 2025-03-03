package Functions;
import java.util.*;
public class a {
    public static double avg(int a, int b, int c)
    {
        return ((a+b+c)/3.0);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        System.out.print("Enter number 3: ");
        int c = sc.nextInt();
        System.out.println("Average = " + avg(a,b,c));
        sc.close();
    }
}