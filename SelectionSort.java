//selection sort
import java.util.Scanner;
public class SelectionSort 
{
    public static void Selection_Sort(int n, int[] arr)
    {
        for(int i=0; i<n-1; i++)
        {
            int minIndex=i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
            }
            int smallNumber=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=smallNumber;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter test case: ");
        int t=sc.nextInt();
        while(t!=0)
        {
            System.out.println("Enter size of Array: ");
            int size=sc.nextInt();
            int[] arr=new int[20];
            System.out.println("Enter Array Elements: ");
            for(int i=0; i<size; i++)
            {
                arr[i]=sc.nextInt();
            }
            Selection_Sort(size,arr);
            for(int i=0; i<size; i++)
            {
                System.out.print(arr[i]+" ");
            }
            t=t-1;
        }
        sc.close();
    }    
}
