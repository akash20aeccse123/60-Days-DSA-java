//Linear Search
import java.util.Scanner;
class LinearSearch{
    public static int Linear_Search(int n, int[] arr, int x)
    {
        if(n==0)
        {
            return -1;
        }
        for(int i=0; i<n; i++)
        {
            if(arr[i]==x)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter test case no: ");
        int t=sc.nextInt();
        while(t>0)
        {
            System.out.println("Enter array size: ");
            int n=sc.nextInt();
            int[] arr=new int[n];
            System.out.println("Enter array elements: ");
            for(int i=0; i<n; i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter target: ");
            int x=sc.nextInt();
            int ans = Linear_Search(n,arr,x);
            System.out.println(ans);
            t=t-1;
        }
        sc.close();
    }
}