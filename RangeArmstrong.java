/*
program to check armstrong number in a given Range
*/
import java.util.Scanner;
public class RangeArmstrong
{
    public static void Range_ArmstrongNumber(int s, int e)
    {
        for(int i=s; i<=e; i++)
        {
            int n = i;
            int current = i;
            int rem = 0;
            int cube = 0;
            int SumCube = 0;
            while( n != 0 )
            {
                rem = n%10;
                cube =( rem*rem*rem );
                SumCube = SumCube+cube;
                n = n/10;
            }
            if( current == SumCube )
            {
                System.out.println(i+" ");               
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting value: ");
        int start=sc.nextInt();
        System.out.println("Enter ending value: ");
        int end=sc.nextInt();
        Range_ArmstrongNumber(start,end);
        sc.close();
    }
}