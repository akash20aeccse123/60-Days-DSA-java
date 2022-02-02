//program to find intersection between two arrays
import java.util.Scanner;
public class IntersectionTwo 
{
    public static void intersectionArray(int n, int[] arr1, int m, int[] arr2)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.println(arr1[i]+" ");
                    arr2[j]=Integer.MAX_VALUE;
                    break;

                }
            }
        }

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr1: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[20];
        System.out.println("Enter array elements: ");
        for(int i=0; i<size1; i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter size of arr2: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[20];
        System.out.println("Enter array elements: ");
        for(int j=0; j<size2; j++)
        {
            arr2[j]=sc.nextInt();
        }

        intersectionArray(size1,arr1,size2,arr2);
        sc.close();
    }
    
}
