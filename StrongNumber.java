/*
check strong number or not
*/
import java.util.Scanner;
public class StrongNumber 
{
    public static void StrongNumberCheck(int n)
    {
        int sum=0;
        int rem=0;
        int current=n;
        while(n!=0)
        {
            rem=n%10;
            int factorial= fact(rem);
            sum=sum+factorial;
            n=n/10;
        
        }
        if(sum==current)
        {
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
    }
    public static int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number: ");
         int n=sc.nextInt();
         StrongNumberCheck(n);
         sc.close();
     }    
}
