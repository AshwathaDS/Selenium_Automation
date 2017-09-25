package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class HomePage {
	
	
	
	@FindBy(xpath=".//*[@id='topnav']/tbody/tr[1]/td[15]/table/tbody/tr/td[3]/div/div[1]/div[2]/div/div")
	private WebElement Help;
	
	@FindBy(linkText="About actiTIME")
	private WebElement AboutActiTIME;
	
	@FindBy(xpath="//span [@class='productVersion']")
	private WebElement ProductVersion;
	
	@FindBy(xpath=".//*[@id='aboutPopup']//table[1]/tbody/tr/td/img")
	private WebElement ClosePopUp;
	
	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement LogoutBtn;
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void ClikonHelpBtn()
	{
		Help.click();
	}
	
	public void ClikonAboutActiTIMEBtn()
	{
		AboutActiTIME.click();
	}
	
	public void CheckProductVersion(String eVersion)
	{
		String aVersion= ProductVersion.getText();
		Assert.assertEquals(eVersion, aVersion);
	}
	
	public void ClikonClosePopUpBtn()
	{
		ClosePopUp.click();
	}
	
	public void ClikonLogoutBtn()
	{
		LogoutBtn.click();
	}
}
