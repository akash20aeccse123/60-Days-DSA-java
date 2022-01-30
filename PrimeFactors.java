/*
Finding Prime Factors of a number 
*/
import java.util.Scanner;
import java.lang.Math;
public class PrimeFactors 
{
    public static int isPrime(int n){

        for(int i = 2; i<=Math.sqrt(n); i++){
          if(n%i==0)
            return 0;
        }
  
        return 1;
     }
    public static void prime_factors(int n)
    {
        for(int i=2; i<=n; i++)
        {
           if(isPrime(i)==1)
           {
               int x=n;
               while(x%i==0)
               {
                   System.out.print(i+" ");
                   x=x/i;
               }
           }
        }
    }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number: ");
         int n = sc.nextInt();
         prime_factors(n);
         sc.close();
     }    
}
