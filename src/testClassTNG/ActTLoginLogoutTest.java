package testClassTNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomClassPack1.ActitimeLoginLogout;

public class ActTLoginLogoutTest 
{
	@Test

	public void login()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://demo.actitime.com/login.do");

		ActitimeLoginLogout Log=new ActitimeLoginLogout(driver);
		Log.loginMethod();
		Log.logoutButtonField();
		
		
		

	}

}
