package PageObjectModel;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment6PageObject 
{
	public static WebDriver oBrowser=null;
	public static ActiTimePOM oPage=null;
	
	public static void main(String[] args) {
		
        launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		creteProject();
		modifyProject();
		deleteCustomer();
		logout();
		closeApplication();
		

	}
	private static void launchBrowser()
	{
		try
		{
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		oPage=new ActiTimePOM(oBrowser);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{

			oBrowser.navigate().to("http://localhost:82/login.do");
			Thread.sleep(4000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
private	static void login()
	{
		try 
		{
			oPage.getusername().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getlogin().click();
			Thread.sleep(2000);
			
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	

private	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindows().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
private	static void createCustomer()
	{
		try
		{
			oPage.custo().click();
			Thread.sleep(2000);
			oPage.custo1().click();
			Thread.sleep(2000);
			oPage.custo2().click();
			Thread.sleep(2000);
			oPage.custo3().click();
			Thread.sleep(2000);
			oPage.custo3().sendKeys("Satish");
			oPage.custo4().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
private	static void creteProject()
	{
		try
		{
			oPage.projectcreate1().click();
			Thread.sleep(2000);
			oPage.projectcreate2().click();
			Thread.sleep(2000);
			oPage.projectcreate3().sendKeys("Mech");
			oPage.projectcreate4().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

  
private	static void modifyProject()
	{
		try
		{
			oPage.projectmodif1().click();
			Thread.sleep(2000);
			oPage.projectmodif2().sendKeys("It is a Palace");
			oPage.projectmodif1().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}

	}
	
private	static void deleteCustomer()
	{
		try 
		{
			oPage.dcusto1().click();
			Thread.sleep(2000);
			oPage.dcusto2().click();
			Thread.sleep(2000);
			oPage.dcusto3().click();
			Thread.sleep(2000);
			oPage.dcusto4().click();
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
			oPage.getlogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
	    }
	}

private	static void closeApplication()
	{
		try
		{
			oBrowser.quit();
			
		}catch(Exception e)
		{
			e.printStackTrace();
	    }
	}
}



