package Variables;
import java.util.*;
public class a
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Average = " + ((a+b+c)/3.0));
        sc.close();
    }
}