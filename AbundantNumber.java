import java.util.Scanner;
public class AbundantNumber 
{
    public static void Abundant_Number(int n)
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
        if(sum>current)
        {
           System.out.println("Abundant Number");
        }
        else{
            System.out.println("Not an Abundant Number");
        }
    }
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        Abundant_Number(n);
        sc.close();
    }
    
}
