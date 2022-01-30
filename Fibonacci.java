/*
nth fibonacci series
*/
import java.util.Scanner;
public class Fibonacci 
{
    public static void fibo(int lim)
    {
       
      
        
        if(lim > 0)
		{
			int y = 0, z = 1, s;
			//display starting two numbers of series
			System.out.print("Fibonacci Series : "+y+"  "+z+"  ");
			//perform iterations till the limit entered by the user
			while(z <= lim)
			{
				s=y+z;
				y=z;
				z=s;
				//condition for forcing z that it should not be printed when its value is greater than limit
				if(z <= lim)
					System.out.print(z+"  ");
			}
		}
       }
    
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number: ");
         int n=sc.nextInt();
          fibo(n);
         sc.close();
     }    
}
