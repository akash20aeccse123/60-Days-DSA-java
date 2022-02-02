//Find the maximum and minimum element in an array
import java.util.Scanner;
public class MinMaxElement 
{
    public static int MinElement(int n, int[] arr)
    {
         int minElement=arr[0];
         for(int i=1; i<n; i++)
         {
             if(arr[i]<minElement)
             {
                 minElement=arr[i];
             }
         }
         return minElement;
    }
    public static int MaxElement(int n, int[] arr)
    {
        int maxElement=arr[0];
        for(int i=1; i<n; i++)
        {
            if(arr[i]>maxElement)
            {
                maxElement=arr[i];
            }            
        }
        return maxElement;
    }
     public static void main(String[] args) 
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter array size: ");
         int size=sc.nextInt();
         System.out.println("Enter array elements: ");
         int[] arr=new int[20];
         for(int i=0; i<size; i++)
         {
             arr[i]=sc.nextInt();
         }
         int min=MinElement(size, arr);
         int max=MaxElement(size, arr);
         System.out.println("Min = "+min);
         System.out.println("Max = "+max);
         sc.close();
     }    
}
