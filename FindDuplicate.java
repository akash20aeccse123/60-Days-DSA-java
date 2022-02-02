//find duplicate element in an array
import java.util.Scanner;
public class FindDuplicate 
{
    public static int Duplicate(int size, int[] arr)
    {
       
        for(int i=0; i<size-1; i++)
        {
            for(int j=i+1; j<size; j++)
            {
                if(arr[i]==arr[j])
                {
                    return arr[i];
                }
            }
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size=sc.nextInt();
        int[] arr=new int[20];
        System.out.println("Enter array elements: ");
        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans=Duplicate(size,arr);
        System.out.println(ans);
        sc.close();
    }    
}
