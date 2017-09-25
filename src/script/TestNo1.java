package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.LoginPage;

public class TestNo1 extends BaseTest{

	@Test(priority=1)
	public void testvalidLogin() throws InterruptedException{
		
		LoginPage l=new LoginPage(driver);
		
		l.UserName("admin");
		l.Password("manager");
		Thread.sleep(10000);
		l.LogIn();
	}
	
}