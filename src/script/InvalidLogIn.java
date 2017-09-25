package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pom.LoginPage;

public class InvalidLogIn extends BaseTest{
	@Test(priority=4)
	public void testinvalidLogin1() throws InterruptedException{
		
		int rc=Lib.getRowCount(XLPATH, "InavalidLogIn");
		
		for(int i=1;i<rc;i++)
		{
		String un=Lib.getCellValue(XLPATH, "InavalidLogIn", i, 0);
		String pw=Lib.getCellValue(XLPATH, "InavalidLogIn", i, 1);
		
		LoginPage l=new LoginPage(driver);
		
		l.UserName(un);
		
		l.Password(pw);
		l.LogIn();
		//l.verifyErrorMessageIsDisplayed(driver);
	}
	}
}