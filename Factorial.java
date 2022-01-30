/*
program to find factorial of a number
*/
import java.util.Scanner;
public class Factorial 
{
    public static int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int smallAns=fact(n-1);
        return n*smallAns;
    }
      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter number: ");
          int n=sc.nextInt();
          int ans=fact(n);
          System.out.println("Factorial is ="+ans);
          sc.close();
      }    
}
