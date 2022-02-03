//sorting 0,1 with single scan
import java.util.Scanner;
public class Sort01 {
    public static void SortingZerosOne(int n, int[] arr)
    {
        int nextZero=0;
           for(int i=0; i<n; i++)
           {
               if(arr[i]==0){
                   int temp=arr[nextZero];
                   arr[nextZero]=arr[i];
                   arr[i]=temp;
                   nextZero++;
               }
           }
    }
    public static void printElement(int n, int[] arr)
    {
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
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
            SortingZerosOne(n,arr);
            printElement(n,arr);
            t=t-1;
        }
        sc.close();
    }    
}
