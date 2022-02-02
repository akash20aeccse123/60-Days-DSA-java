//Find Uniq Element
import java.util.Scanner;
public class FindUniq {
    public static int findUniq_Element(int n, int[] arr)
    {
        for(int i=0; i<n; i++)
        {
            int j;
            for( j=0; j<n; j++)
            {
                if(i!=j)
                {
                    if(arr[i]==arr[j])
                    {
                        break;
                    }
                }
            }
            if(j==n)
            {
                return arr[i];
            }
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[20];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans=findUniq_Element(n,arr);
        System.out.println(ans);
        sc.close();
    }
    
}
