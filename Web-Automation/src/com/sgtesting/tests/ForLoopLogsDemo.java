package com.sgtesting.tests;

import org.apache.log4j.Logger;

public class ForLoopLogsDemo 
{
	public static Logger Log=Logger.getLogger("Testing Logs");
	public static void main(String[] args) 
	{
	  displayLogs();		

	}

	private static void displayLogs()
	{
		Log.info("For Loop Execution started here....");
		Log.info("For Loop Execution started here....");
		Log.info("For Loop Execution started here....");
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				Log.info("Even Number :"+i);
			}
		}
		Log.info("For Loop Execution ended here....");
	}
}
