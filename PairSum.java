//pair sum
import java.util.Scanner;
public class PairSum
{
    public static int PairSum_Elements(int n, int[] arr,int x)
    { 
        int count=0;
          for(int i=0; i<n; i++)
          {
              for(int j=i+1; j<n; j++)
              {
                  int sum=arr[i]+arr[j];
                  if(sum==x)
                  {
                      System.out.println("("+arr[i]+","+arr[j]+")");
                      count++;
                  }
              }
          }
          return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0; i<n; i++)
            {
                arr[i]=sc.nextInt();
            }
            int x=sc.nextInt();
            int ans=PairSum_Elements(n,arr,x);
            System.out.println(ans);

            t=t-1;
        }
        sc.close();
    }
}