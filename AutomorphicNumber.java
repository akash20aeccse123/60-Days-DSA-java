////Java program to check whether a number is Automorphic number or not
import java.util.Scanner;
public class AutomorphicNumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        String s1=Integer.toHexString(n);
        int len1=s1.length();
        int sq=(n*n);
        String s2=Integer.toString(sq);
        int len2=s2.length();

        String s3 = s2.substring(len2-len1);
       
        if(s1.equals(s3))
        {
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not an Automorphic Number");
        }

        sc.close();
    }
}