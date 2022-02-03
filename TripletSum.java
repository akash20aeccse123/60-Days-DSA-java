//pair sum of triplets
import java.util.Scanner;
public class TripletSum 
{
    public static int TripletSumElement(int n, int[] arr, int x)
    {
        int tripletSum=0;
        
           for(int i=0; i<n; i++)
           {
               for(int j=i+1; j<n; j++)
               {
                   for(int k=j+1; k<n; k++)
                   {
                        int sum=arr[i]+arr[j]+arr[k];
                        if(sum==x)
                        {
                            tripletSum++;
                        }
                   }
               }
           }
           return tripletSum;        
    }
    public static void main(String[] args) 
    {
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
            int ans=TripletSumElement(n,arr,x);
            System.out.println(ans);
            t=t-1;
        }
        sc.close();
    }
    
}
