/*
Reverse of a number
*/
import java.util.Scanner;
public class ReverseNumber 
{
    public static int Reverse_Number(int num)
    {
        int rem = 0;
        int rev = 0;
        while(num != 0)
        {
            rem = num%10;
            rev = (10*rev)+rem;
            num = num/10;
        }
        return rev;
    } 
     public static void main(String[] args) 
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Number: ");
          int num=sc.nextInt();
          int ans=Reverse_Number(num);
          System.out.println("Reverse number is = "+ans);
          sc.close();    
     }    
}
