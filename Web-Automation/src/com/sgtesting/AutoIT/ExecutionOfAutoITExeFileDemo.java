package com.sgtesting.AutoIT;

public class ExecutionOfAutoITExeFileDemo {

	public static void main(String[] args) {
		executeAutoIT();
	}

	private static void executeAutoIT() {
		try 
		{
			Runtime.getRuntime().exec("\\D:\\AUTOit\\Sample.exe");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
