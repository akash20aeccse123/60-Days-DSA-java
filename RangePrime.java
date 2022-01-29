/*
Prime number within a given range
*/
import java.util.Scanner;
public class RangePrime 
{
    public static void Range_Prime_Number(int s, int e)
    {
       
         for(int i = s; i <= e; i++)
         {
            int count = 0;
             for(int j = 1; j <= i; j++)
             {
                 if( i%j == 0 )
                 {
                     count++;
                 }
             }
             if(count==2)
             {
                 System.out.println(i);
             }
         }        
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting value: ");
        int start=sc.nextInt();
        System.out.println("Enter ending value: ");
        int end=sc.nextInt();
        sc.close();
        Range_Prime_Number(start,end);
       
    }    
}
