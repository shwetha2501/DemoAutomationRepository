package com.sgtesting.Framework;

public class Sample1 
{
	public static void main(String args[])
	{
		char ch;
		
		System.out.println("Small Alphabets: ");
		
		for(ch = 'a' ; ch <= 'z' ; ch++)
		{
			System.out.println(ch);
		}           

		System.out.println("Capital Alphabets: ");
		for(ch = 'A' ; ch <= 'Z' ; ch++)
		{
			System.out.println(ch);
		}
	}
}
