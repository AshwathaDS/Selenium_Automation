package pom;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage {
	@FindBy(id="username")
	private  WebElement setUserName;
	
	@FindBy(name="pwd")
	private  WebElement setPassword;
	
	@FindBy(xpath="//div[.='Login ']")
	private  WebElement btnLogin;
	
	@FindBy(xpath="//span[@class='errormsg']")
	private WebElement errormsg;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	public  void UserName(String un)
	{
		setUserName.sendKeys(un);
	}
	
	
	public  void Password(String pw)
	{
		setPassword.sendKeys(pw);
	}
	
	
	public  void LogIn()
	{
		btnLogin.click();
	}
	
	public void verifyErrorMessageIsDisplayed(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		try{
		wait.until(ExpectedConditions.visibilityOf(errormsg));
		Reporter.log("PASS : Error Message is Displayed",true);
		}
		catch (Exception e) {
		Reporter.log("FAIL : Error Message is Not Displayed",true);
		Assert.fail();
		}
			
	}
}
