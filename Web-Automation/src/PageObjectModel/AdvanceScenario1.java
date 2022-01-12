package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenario1
{
	private static WebDriver oBrowser = null;
	private static ActiTimePage opage = null;
	public static void main(String[] args) 
	{
		launch();
		navigate();
		login();
		minimizeflyoutwindow();
		createUsers1();
		createUsers2();
		createUsers3();
		logout();
		loginUser1();
		logout1();
		loginUser2();
		logout2();
		loginUser3();
		logout3();
		//login1admin();
		//modifyPassworduser1();
		//modifyPassworduser2();
		//modifyPassworduser3();
	//	logout4();
		//loginasUser1();
	//	logout5();
	//	loginasUser2();
	//	logout6();
	//	loginasUser3();
	//	logout7();
	//	loginasadmin1();
	//	deleteUser1();
		//deleteUser2();
		//deleteUser3();
		//logout8();
		//closeApplication();

		
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
	private static void createUsers1()
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
	private static void createUsers2()
	{
		try
		{
			opage.getcrtuser().click();
			Thread.sleep(2000);
			opage.getAddUser().click();
			opage.getFirstName().sendKeys("SANTOSH");
			Thread.sleep(2000);
			opage.getLastName().sendKeys("S");
			Thread.sleep(2000);
			opage.getMail().sendKeys("santosh@gmail.com");
			Thread.sleep(2000);
			opage.getUserName().sendKeys("admin2");
			Thread.sleep(2000);
			opage.getuserpwd().sendKeys("manager2");
			Thread.sleep(2000);
			opage.getpwdcpy().sendKeys("manager2");
			Thread.sleep(2000);
			opage.getCreateUser1().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUsers3()
	{
		try
		{
			opage.getcrtuser().click();
			Thread.sleep(2000);
			opage.getAddUser().click();
			opage.getFirstName().sendKeys("SHILPA");
			Thread.sleep(2000);
			opage.getLastName().sendKeys("B");
			Thread.sleep(2000);
			opage.getMail().sendKeys("shilpa@gmail.com");
			Thread.sleep(2000);
			opage.getUserName().sendKeys("admin3");
			Thread.sleep(2000);
			opage.getuserpwd().sendKeys("manager3");
			Thread.sleep(2000);
			opage.getpwdcpy().sendKeys("manager3");
			Thread.sleep(2000);
			opage.getCreateUser1().click();
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
	private static void loginUser1()
	{
		try
		{
			opage.getUserText().sendKeys("admin1");
			opage.getPwdText().sendKeys("manager1");
			opage.getLoginButton().click();
			Thread.sleep(2000);
			opage.getloginAs().click();
			Thread.sleep(2000);
		}
		catch(Exception a)
		{
			a.printStackTrace();
		}
	}
	private static void logout1()
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
	private static void loginUser2()
	{
		try
		{
			opage.getUserText().sendKeys("admin2");
			opage.getPwdText().sendKeys("manager2");
			opage.getLoginButton().click();
			Thread.sleep(2000);
			opage.getloginAs().click();
			Thread.sleep(2000);
		}
		catch(Exception a)
		{
			a.printStackTrace();
		}
	}
	private static void logout2()
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
	private static void loginUser3()
	{
		try
		{
			opage.getUserText().sendKeys("admin3");
			opage.getPwdText().sendKeys("manager3");
			opage.getLoginButton().click();
			Thread.sleep(2000);
			opage.getloginAs().click();
			Thread.sleep(2000);
		}
		catch(Exception a)
		{
			a.printStackTrace();
		}
	}
	private static void logout3()
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
}