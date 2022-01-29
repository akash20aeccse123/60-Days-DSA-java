/*
Leap year or not
*/
import java.util.Scanner;
public class CheckLeap 
{
    public static void isLeapyear(int y)
    {
        if(y%4==0 && y%100!=0 || y%400==0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
      public static void main(String[] args) 
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter year to check: ");
          int year=sc.nextInt();
          isLeapyear(year);
          sc.close();
      }    
}
