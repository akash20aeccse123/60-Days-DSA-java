//Program to check a number is harshad number or not345

import java.util.Scanner;
public class HarshadNumber 
{
    public static void isHarshadNumber(int n)
    {
        int rem=0;
        int sum=0;
        int current=n;
        while(n!=0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        if(current%sum==0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not a Harshad Number");
        }
    }
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter number: ");
         int n=sc.nextInt();
         isHarshadNumber(n);
         sc.close();
     }    
}
