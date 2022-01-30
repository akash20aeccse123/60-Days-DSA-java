/*
Factor of a number
*/
import java.util.Scanner;
public class Factor 
{
    public static void factor_num(int num)
    {
        for(int i=1; i<=num; i++)
        {
               if(num%i==0)
               {
                   System.out.print(i+" ");
               }
        }
    }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number: ");
         int n=sc.nextInt();
         factor_num(n);
         sc.close();
     }    
}
