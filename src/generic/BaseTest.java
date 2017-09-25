package generic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest  implements IAutoConst{

	public WebDriver driver;
	static {
		
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	
	@BeforeMethod
	public void openApplication() throws MalformedURLException{
		driver =new ChromeDriver();
		//To run the Script in the remote system
		
//		URL whichsystem = new URL("http://192.168.43.107:4444/wd/hub");
//		DesiredCapabilities whichbrowser = new DesiredCapabilities();
//		whichbrowser.setBrowserName("chrome");
//		driver=new RemoteWebDriver(whichsystem, whichbrowser);
		
		driver.manage().window().maximize();
		String URL1=Lib.getProperty(CONFIG_PATH, "URL");
		driver.get(URL1);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApplication(){
		driver.close();
	}
}
