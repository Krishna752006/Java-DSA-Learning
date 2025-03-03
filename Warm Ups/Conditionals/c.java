package Conditionals;
import java.util.*;
public class c {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();
        String b;
        switch(a)
        {
            case 1 : b = "Sunday"; break;
            case 2 : b = "Monday"; break;
            case 3 : b = "Tuesday"; break;
            case 4 : b = "Wednesday"; break;
            case 5 : b = "Thrusday"; break;
            case 6 : b = "Friday"; break;
            case 7 : b = "Saturday"; break;
            default : b = "Invalid Number";
        }
        System.out.println(b);
        sc.close();
    }
}