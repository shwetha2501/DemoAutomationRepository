package PageObjectModel;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2POM
{
	private static WebDriver oBrowser = null;
	private static ActiTimePage opage = null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		minimizeflyoutwindow();
		createUser();
		modifyuser();
		deleteUser();
		logout();
		closeApplication();
		modifyuser();
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
         e.printStackTrace();
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
	private static void createUser()
	{
		try
		{
			opage.getcrtuser().click();
			Thread.sleep(2000);
			opage.getAddUser().click();
			opage.getFirstName().sendKeys("SHWETHA");
			Thread.sleep(2000);
			opage.getLastName().sendKeys("BS");
			Thread.sleep(2000);
			opage.getMail().sendKeys("sweta@gmail.com");
			Thread.sleep(2000);
			opage.getUserName().sendKeys("admin1");
			Thread.sleep(2000);
			opage.getuserpwd().sendKeys("manager1");
			Thread.sleep(2000);
			opage.getpwdcpy().sendKeys("manager1");
			Thread.sleep(2000);
			opage.getCreateUser1().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser()
	  {
		  try
		  {
			  opage.getcrtuser().click();
			  Thread.sleep(2000);
			  opage.getClick().click();
			  Thread.sleep(2000);
	          opage.getFirstName().clear();
			  opage.getFirstName().sendKeys("SHWETHA1");
			  Thread.sleep(2000);
			  opage.getLastName().clear();
			  opage.getLastName().sendKeys("BSS");
			  Thread.sleep(2000);
			  opage.getMail().clear();
			  opage.getMail().sendKeys("sweta1@gmail.com");
			  Thread.sleep(2000);
			  opage.getuserpwd().clear();
			  opage.getuserpwd().sendKeys("manager11");
			  Thread.sleep(2000);
			  opage.getpwdcpy().clear();
			  opage.getpwdcpy().sendKeys("manager11");
			  Thread.sleep(2000);
			  opage.getSavechanges().click();
			  Thread.sleep(2000);
			  
		  }catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	  }

	private static void deleteUser()
	{
		try
		{
			opage.getClick().click();
			Thread.sleep(2000);
			opage.getDeleteuser().click();
			Thread.sleep(2000);
	       Alert oAlert=oBrowser.switchTo().alert();
			String strContent=oAlert.getText();
			System.out.println(strContent);
			oAlert.accept();
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


