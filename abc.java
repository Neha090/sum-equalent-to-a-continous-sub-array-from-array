package achievers;

import java.util.Scanner;

public class abc {
	
	void getSum(int arr[],int sum)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int sum1=0;
			for(int j=i;j<n;j++)
			{
				sum1=sum1+arr[j];
				if(sum==sum1)
				{
					System.out.println("Starting index : "+i);
					System.out.println("Ending index : "+j);
					break;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		abc obj=new abc();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in an array");
		int n=sc.nextInt();
		
		System.out.println("Enter elements");
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter sum");
		int sum=sc.nextInt();
		
		obj.getSum(ar,sum);
	}

}
