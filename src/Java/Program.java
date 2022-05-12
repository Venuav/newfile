package Java;

import com.sun.tools.javac.code.Attribute.Array;

public class Program {
public static void main(String[]args)
{
	int[]arr= {19,93,9,2,89,22};
	int n=arr.length;
	for(int i=0;i<=n-1;i++)
	{
		for(int j=0;j<=n-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			}
		System.out.println(Array.toString(arr));
		}
	
}}