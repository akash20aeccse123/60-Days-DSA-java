//Write a program to reverse an array or string
import java.util.Scanner;
public class ReverseArray
{
	public static void reverseArrayElements(int size,int[] arr)
	{
		int start=0;
		int end=size-1;
        int temp=0;		
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	public static void printElements(int size,int[] arr)
	{
		System.out.print("Array After Reverse: ");
		for(int i=0; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array Size: ");
		int size=sc.nextInt();
		int[] arr=new int[20];
		System.out.print("Enter Array Elements: ");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		reverseArrayElements(size,arr);
		printElements(size,arr);
		sc.close();
	}
}