/*
Prime number or not
*/
import java.util.Scanner;
public class CheckPrime 
{
    public static void isPrime(int num)
    {
        int count=0;
        for(int i=1; i<=num; i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("Prime Number");
        }
        else
        {
           System.out.println("Not a Prime");
        }
    }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a Number: ");
         int n=sc.nextInt();
         isPrime(n);
         sc.close();
     }    
}
