/*
Greatest of the Three numbers:
*/
import java.util.Scanner;
public class LargestThree 
{
    public static int LargestNumber(int a, int b, int c)
    {
        if(a>=b && a>=c)
        {
            return a;
        }
        else if(b>=a && b>=c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
     public static void main(String[] args) 
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter First Number: ");
         int a=sc.nextInt();
         System.out.println("Enter Second Number: ");
         int b=sc.nextInt();
         System.out.println("Enter Third Number: ");
         int c=sc.nextInt();
         int ans=LargestNumber(a,b,c);
         System.out.println("largest number is = "+ans);
         sc.close();
     }    
}
