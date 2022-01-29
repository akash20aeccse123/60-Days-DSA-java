/*
program to print the sum in a given range
*/
import java.util.Scanner;
public class SumofNumbersInRange
{
    public static int RangeSum(int s, int e)
    {
        int sum=0;
        for(int i=s; i<=e; i++)
        {
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting value: ");
        int start=sc.nextInt();
        System.out.println("Enter ending value: ");
        int end=sc.nextInt();
        sc.close();
        int ans=RangeSum(start,end);
        System.out.println("Sum is = "+ ans);
    }
}