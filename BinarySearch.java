//Binary search program
import java.util.Scanner;
public class BinarySearch {
    public static int Binary_Search(int n, int[] arr, int x)
    {
        int start=0;
        int end=n-1;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(x>arr[mid])
            {
                start=mid+1;
            }
            else if(x<arr[mid])
            {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter test case: ");
        int t=sc.nextInt();
        while(t>0)
        {
            System.out.println("Enter array size: ");
            int n=sc.nextInt();
            System.out.println("Enter array elements: ");
            int[] arr=new int[n];
            for(int i=0; i<n; i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter target element: ");
            int x=sc.nextInt();
            int ans=Binary_Search(n,arr,x);
            System.out.println(ans);
            t=t-1;
        }
        sc.close();
    }
    
}
