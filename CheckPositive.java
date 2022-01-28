/*
Checking if a number is positive or negative using Java
*/
import java.util.Scanner;
public class CheckPositive 
{
    public static void isPositiveNumber(int n)
    {
        if(n>0)
        {
            System.out.println("Positive Number");
        }
        else if(n==0)
        {
            System.out.println("It is Zero");
        }
        else{
            System.out.println("Negative Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        isPositiveNumber(n);
        sc.close();
    }
    
}
