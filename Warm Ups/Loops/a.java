package Loops;
import java.util.*;
public class a {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt(),es = 0,os = 0;
        int arr[] = new int[a];
        for(int i = 0;i<a;i++)
        {
            System.out.print("Enter " + i + " Element: ");
            arr[i] = sc.nextInt();
            if(arr[i]%2 == 0)
            {
                es += arr[i];
            }
            else{
                os += arr[i];
            }
        }
        System.out.println("Even Sum = "+es);
        System.out.println("Odd Sum = "+os);
        sc.close();
    }
}