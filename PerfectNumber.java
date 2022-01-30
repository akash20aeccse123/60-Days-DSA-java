/*
check a number is perfect or not
*/
import java.util.Scanner;
public class PerfectNumber {
    public static void checkPerfectNumber(int n)
    {
        int sum=0;
        int current=n;
        for(int i=1; i<n; i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==current)
        {
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        checkPerfectNumber(n);
        sc.close();
    }
    
}
