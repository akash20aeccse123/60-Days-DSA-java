/*
Sum of Even Numbers till N

Given a number N, print sum of all even numbers from 1 to N.
Input Format :
Integer N
Output Format :
Required Sum 
Sample Input 1 :
 6
Sample Output 1 :
12
*/
import java.util.Scanner;
public class SumN {
    public static int Sum_of_N(int n)
    {
        int i=1;
        int sum=0;
         while(i<=n)
         {
            if(i%2==0)
            {
                sum=sum+i;
            }
         }
         return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=Sum_of_N(n);
        System.out.println(ans);
        sc.close();
    }
    
}
