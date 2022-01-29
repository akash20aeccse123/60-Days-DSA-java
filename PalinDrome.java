/*
Palindrome number
*/
import java.util.Scanner;
public class PalinDrome 
{
    public static void isPalinDrome(int num)
    {
        int currentNumber=num;
        int rem=0;
        int rev=0;
          while(num!= 0)
          {
              rem = num%10;
              rev = (10*rev)+rem;
              num = num/10;
          }
          if(rev==currentNumber)
          {
              System.out.println("Palindrome Number");
          }
          else
          {
              System.out.println("Not a Palindrome Number");   
          }
    }    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();
        isPalinDrome(num);
        sc.close();
    }
    
}
