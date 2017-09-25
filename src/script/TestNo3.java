package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.HomePage;
import pom.LoginPage;


public class TestNo3 extends BaseTest{
	
	@Test(priority=3)
	public void testvalidLogin2(){
		
LoginPage l=new LoginPage(driver);
		
		l.UserName("admin");
		l.Password("manager");
		l.LogIn();
		HomePage hp=new HomePage(driver);
		hp.ClikonHelpBtn();
		hp.ClikonAboutActiTIMEBtn();
		String eVersion="actiTIME 2014 Pro";
		hp.CheckProductVersion(eVersion);
		hp.ClikonClosePopUpBtn();
		hp.ClikonLogoutBtn();
		
	}

}
