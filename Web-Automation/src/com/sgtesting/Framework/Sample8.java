package com.sgtesting.Framework;

public class Sample8 
{
	private static void find(int n)

	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)

			{
				sum+=1;
			}
		}
		if(sum==n)
		{
			System.out.println(n+ "is a perfect Number");
		}
		else
		{
			System.out.println(n+ "is not a perfect Number");
		}

	}
	public static void main(String[] args) 
	{
		find(28);

	}
}
