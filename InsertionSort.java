//insertion sort
import java.util.Scanner;
public class InsertionSort 
{
    public static void insertion_Sort(int n, int[] arr)
    {
        int i=1;
        int temp;
        while(i<n)
        {
            temp=arr[i];
            int j=i-1;
            while(j>=0)
            {
                if(arr[j]>temp)
                {
                    arr[j+1]=arr[j];
                }
                else
                {
                    break;
                }
                j=j-1;
            }
            arr[j+1]=temp;
            i++;
        }
    }
    public static void print_Element(int n, int[] arr)
    {
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        insertion_Sort(n,arr);
        print_Element(n,arr);
        sc.close();
    }
    
}
