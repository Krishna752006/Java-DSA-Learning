package Conditionals;
import java.util.*;
public class a {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();
        if(a>=0)
        {
            System.out.println("It is a Positive Number");
        }
        else{
            System.out.println("It is a Negative Number");
        }
        sc.close();
    }
}