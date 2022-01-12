package com.sgtesting.Framework;

public class Sample10
{	
	static void whileLoopTest(int num)
	{
		int i = 1;

		do 
		{
			System.out.println(i);
			i++;			 
		}while(i<=num);
	}	

	public static void main(String args[])
	{ 

		whileLoopTest(10); 
	}
}