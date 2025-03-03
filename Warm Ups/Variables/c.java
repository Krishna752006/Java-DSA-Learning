package Variables;
import java.util.*;
public class c
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        System.out.print("Cost of Pencil = ");
        a = sc.nextFloat();
        System.out.print("Cost of Pen = ");
        b = sc.nextFloat();
        System.out.print("Cost of Eraser = ");
        c = sc.nextFloat();
        float s = 1.18f * (a+b+c);
        System.out.println("Total = " + s);
        sc.close();
    }
}