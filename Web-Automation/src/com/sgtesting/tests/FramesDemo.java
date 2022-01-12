package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo 
{

	public static WebDriver oBrowser=null;
	
	public static void main(String[] args)
	{
		launchbrowser();
		navigate();
		handleframes();
	}
	private static void launchbrowser() 
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			System.out.println("Browser Launched...");
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			Thread.sleep(4000);
			System.out.println("Navigation Done...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void handleframes()
	{
		try
		{
			oBrowser.switchTo().frame(0);
			oBrowser.findElement(By.linkText("org.openqa.selenium")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(2000);
			oBrowser.switchTo().frame("packageFrame");
			oBrowser.findElement(By.xpath("//span[text()='WebDriver']")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.name("classFrame"));
			oBrowser.switchTo().frame(oEle);

			String content=oBrowser.findElement(By.xpath("/html/body/main/div[2]/div[1]/ul/li")).getText();
			System.out.println(content);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
