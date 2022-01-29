/*
Sum of digits of a number:
*/
import java.util.Scanner;
public class DigitSum 
{
    public static int Sum_of_Digits(int num)
    {
          int rem = 0;
          int sum = 0;

          while(num != 0)
          {
              rem = num%10;
              sum = sum+rem;
              num = num/10;
          }
          return sum;
    }
      public static void main(String[] args) 
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Number: ");
          int n = sc.nextInt();
          int ans = Sum_of_Digits(n);
          System.out.println("Digit sum = "+ans);
          sc.close();
      }    
}
