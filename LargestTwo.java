
/*
Greatest of two numbers
*/
import java.util.Scanner;
public class LargestTwo 
{
    public static int LargestNumber(int a, int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter first number: ");
         int a=sc.nextInt();
         System.out.println("Enter second number: ");
         int b=sc.nextInt();
         sc.close();
         int ans=LargestNumber(a,b);
         System.out.println("largest number is = "+ans);
     }    
}
