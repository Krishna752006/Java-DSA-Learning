package Functions;
import java.util.*;
public class d {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        System.out.println("Minimum = " + Math.min(a,b));
        System.out.println("Maximum = " + Math.max(a,b));
        System.out.println("Square Root of Number 1 = " + Math.sqrt(a));
        System.out.println("Power = " + Math.pow(a,b));
        System.out.println("Absolute Value = " + Math.abs(a-b));
        sc.close();
    }
}