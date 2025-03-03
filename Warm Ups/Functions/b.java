package Functions;
import java.util.*;
public class b {
    public static boolean isEven(int a)
    {
        return a % 2 == 0 ? true : false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Given number is Even? Ans: " + isEven(a));
        sc.close();
    }
}