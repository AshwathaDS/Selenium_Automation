package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.LoginPage;

public class TestNo2 extends BaseTest{
	@Test(priority=2)
	public void testvalidLogin1(){
		
		LoginPage l=new LoginPage(driver);
		
		l.UserName("admin");
		l.Password("xyz");
		l.LogIn();
		l.verifyErrorMessageIsDisplayed(driver);
	}
}
