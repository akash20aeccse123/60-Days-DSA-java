//bubble sort
import java.util.Scanner;
public class BubbleSort {
    public static void Bubble_Sort(int n, int[] arr)
    {
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void print_Element(int n, int[] arr)
    {
        System.out.println("Array After sorting : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter test case: ");
        int t=sc.nextInt();
        while(t>0){
            System.out.print("Enter array size: ");
            int n=sc.nextInt();
            int[] arr=new int[n];
            System.out.print("Enter array elements: ");
            for(int i=0; i<n; i++)
            {
                arr[i]=sc.nextInt();
            }
            Bubble_Sort(n,arr);
            print_Element(n,arr);
            t=t-1;
        }
        sc.close();
    }
    
}
