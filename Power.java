/*
program to find power of a number
*/
import java.util.Scanner;
public class Power 
{
    public static int power_num(int n)
    {
        int ans=n*n;
        return ans;
    }
     public static void main(String[] args) 
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number: ");
         int n=sc.nextInt();
         int ans=power_num(n);
         System.out.println(ans);
         sc.close();
     }    
}
