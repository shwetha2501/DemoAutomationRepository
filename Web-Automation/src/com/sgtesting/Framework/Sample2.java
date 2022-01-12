package com.sgtesting.Framework;

public class Sample2
{

	static void primeNumber(int num)
	{
		int count = 0;
		if(num == 0 || num == 1)
		{
			System.out.println(num + " is not prime.");
		}
		else
		{
			for(int i = 1; i <= num/2; i++)
			{
				if(num % i == 0)
				{
					count++;
				}
			}
			if(count > 1)
			{
				System.out.println(num + " is not prime.");
			}
			else
			{
				System.out.println(num + " is prime.");
			}
		}
	}    

	public static void main(String args[])
	{

		primeNumber(37);
	}
}