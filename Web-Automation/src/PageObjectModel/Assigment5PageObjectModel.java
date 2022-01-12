package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment5PageObjectModel 
{
	private static WebDriver oBrowser = null;
	private static ActiTimePage opage = null;
	public static void main(String[] args)
	{
		launch();
		navigate();
		login();
		minimizeflyoutwindow();
		createCustomer();
		createProject();
		deleteProject();
		deleteCustomer();
		logout();
		closeApplication();
	}
	private static void launch()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			opage=new ActiTimePage(oBrowser);
		}
		catch(Exception e)
		{

		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login()
	{
		try
		{
			opage.getUserText().sendKeys("admin");
			opage.getPwdText().sendKeys("manager");
			opage.getLoginButton().click();
			Thread.sleep(2000);
		}
		catch(Exception a)
		{
			a.printStackTrace();
		}
	}

	private static void minimizeflyoutwindow()
	{
		try
		{
			opage.getmimizeFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createCustomer()
	{
		try
		{
			opage.getTask().click();
			Thread.sleep(2000);
			opage.getaddnew().click();
			Thread.sleep(2000);
			opage.getnewcustomer().click();
			Thread.sleep(2000);
			opage.getCustomerName().sendKeys("SANTOSH");
			Thread.sleep(2000);
			opage.getDescription().sendKeys("New to the Domain");
			Thread.sleep(2000);
			opage.getCrtCustomer().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createProject()
	{
		try
		{  
			
			opage.getTask().click();
			Thread.sleep(2000);
			opage.getaddnew().click();
		    Thread.sleep(4000);
			opage.getNewproject().click();
			Thread.sleep(2000);
			opage.getProjectName().sendKeys("JAVA PROJECT");
			Thread.sleep(2000);
			opage.getProjectDescription().sendKeys("STARTED WITH NEW JAVA PROJECT");
			Thread.sleep(2000);
			opage.getcreateProjectbutton().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteProject()
	{
		try
		{  
			opage.geteditbutton().click();
			opage.getAction().click();
			Thread.sleep(2000);
			opage.getdelete().click();
		    Thread.sleep(4000);
			opage.getDeletepermanently().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteCustomer()
	{
		try
		{
			opage.getEditButton().click();
			Thread.sleep(2000);
			opage.getAction().click();
			Thread.sleep(2000);
			opage.getdelete().click();
			Thread.sleep(2000);
			opage. getDeletepermanently().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			opage.getlogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}






