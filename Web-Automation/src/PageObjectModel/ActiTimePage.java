package PageObjectModel;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser) 
	{
		PageFactory.initElements(oBrowser,this);
	}

	//User name
	private WebElement username;
	public WebElement getUserText()
	{
		return username;
	}

	//Password
	@FindBy(xpath="//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
	private WebElement pswd;
	public WebElement getPwdText()
	{
		return pswd;
	}
	//login button
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement login;
	public WebElement getLoginButton()
	{
		return login;
	}

	//MinimizeFlyoutWindow

	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getmimizeFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	//Users
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement createuser;
	public WebElement getcrtuser()
	{
		return createuser;
	}
	//add user
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement Adduser;
	public WebElement getAddUser()
	{
		return Adduser;
	}
	//First name
	private WebElement firstName;
	public WebElement getFirstName()
	{
		return firstName;
	}
	//last name
	private WebElement lastName;
	public  WebElement getLastName()
	{
		return lastName;
	}
	//email
	private WebElement email;
	public WebElement getMail()
	{
		return email;
	}
	//User name
	private WebElement userDataLightBox_usernameField;
	public  WebElement getUserName()
	{
		return userDataLightBox_usernameField;
	}
	//User password
	private WebElement userDataLightBox_passwordField;
	public WebElement getuserpwd()

	{
		return userDataLightBox_passwordField;
	}
	//copy password
	private WebElement passwordCopy;
	public WebElement getpwdcpy()
	{
		return passwordCopy;
	}
	//Create User  click
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement CreateUser;
	public WebElement getCreateUser1()
	{
		return CreateUser;
	}
	//select the user
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement clicktodlt;
	public WebElement getClick()
	{
		return clicktodlt;
	}
	//DeleteUser
	private WebElement userDataLightBox_deleteBtn;
	public WebElement  getDeleteuser()
	{
		return userDataLightBox_deleteBtn;
	}
	//logout
	private WebElement logoutLink;
	public WebElement getlogout()
	{
		return logoutLink;
	}
	//save changes
	private WebElement userDataLightBox_commitBtn;
	public WebElement getSavechanges()
	{
		return userDataLightBox_commitBtn;
	}
	//TASK
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement Task;
	public WebElement getTask()
	{
		return Task;
	}
	//Add New
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement AddNew;
	public WebElement getaddnew()
	{
		return AddNew;
	}
	//NeW Customer
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement Newcustomer;
	public WebElement getnewcustomer()
	{
		return Newcustomer;
	}
	//CUSTOMER NAME
	private WebElement customerLightBox_nameField;
	public WebElement getCustomerName()
	{
		return customerLightBox_nameField;
	}
	//ADD DESCRIPTION
	private WebElement customerLightBox_descriptionField;
	public WebElement getDescription()
	{
		return customerLightBox_descriptionField;
	}
	//create customer click button
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createCustomer;
	public WebElement getCrtCustomer()
	{
		return createCustomer;
	}
	//delete customer
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement editbuttonclick;
	public WebElement getEditButton()
	{
		return editbuttonclick;
	}
	//Action
	@FindBy(xpath="//div[text()='ACTIONS']")
	private WebElement Action;
	public WebElement getAction()
	{
		return Action;
	}
	//Delete
	@FindBy(xpath="//div[text()='Delete']")
	private WebElement Delete;
	public WebElement getdelete()
	{
		return Delete;
	}
	//Delete Permanently
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getDeletepermanently()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	//ACTIVE
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement ACTIVE;
	public WebElement getActive()
	{
		return ACTIVE;
	}
	//Archived
	@FindBy(xpath="/html/body/div[22]/div[2]/div")
	private WebElement Archived;
	public WebElement getArcheved()
	{
		return Archived;
	}
	//New Project
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement NewProject;
	public WebElement getNewproject()
	{
		return NewProject; 
	}
	//PROJECT  NAME

	private WebElement projectPopup_projectNameField;;
	public WebElement getProjectName()
	{
		return projectPopup_projectNameField; 
	}
	//project Description

	private WebElement projectDescriptionField;
	public WebElement getProjectDescription()
	{
		return projectDescriptionField; 
	}
	//Create project click button
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement Createprojectbtn;
	public WebElement getcreateProjectbutton()
	{
		return Createprojectbtn; 
	}
	//delete project select edit button

	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement EditButton;
	public WebElement geteditbutton()
	{
		return EditButton; 
	}
	//login as user start
	@FindBy(xpath="//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")
	private WebElement loginas;
	public WebElement getloginAs()
	{
		return loginas; 
	}


}





