/*
 Program to Check Whether a Number is Even or Odd
*/
import java.util.Scanner;
public class EvenOdd {
    public static void checkNumber(int n)
    {
        if(n<0)
        {
            System.out.println("Negative Values does not exists!!");
        }
        if(n%2==0)
        {
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        checkNumber(n);
        sc.close();
    }
    
}
