//check friendly pair
import java.util.Scanner;
public class FriendlyPair 
{
    public static int divisorSum(int n)
    {
        int sum=0;
        //int current=n;
        for(int i=1; i<n; i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
      public static void main(String[] args) 
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter first number: ");
          int n=sc.nextInt();
          System.out.println("Enter second number: ");
          int m=sc.nextInt();
          int nsum=divisorSum(n);
         // System.out.println("div 1= "+nsum);
          int msum=divisorSum(m);
         // System.out.println("div 2= "+msum);

          if(nsum==m && msum==n)
          {
              System.out.println("Pair");
          }
          else{
              System.out.println("Not pair");
          }
          sc.close();
      }    
}
