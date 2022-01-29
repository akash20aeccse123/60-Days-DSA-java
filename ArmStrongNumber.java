/*
Armstrong number
*/
import java.util.Scanner;
public class ArmStrongNumber 
{
    public static void ArmStrong_Number(int num)
    {
        int rem=0;
        int cube=0;
        int sum=0;
        int currentNumber=num;

         while(num!=0)
         {
             rem = num%10;
             cube = rem*rem*rem;
             sum = sum+cube;
             num = num/10;
         }
         if(currentNumber==sum)
         {
             System.out.println("Armstrong Number");
         }
         else
         {
             System.out.println("Not an ArmStrong Number");
         }

    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        ArmStrong_Number(n);
        sc.close();
    }    
}
