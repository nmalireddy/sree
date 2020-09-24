package testClassTNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomClassPack1.ActitimeLoginLogout;
import pomClassPack1.CreatTypeofWorkClass;

public class EditWorkTypeAndLogout 
{
@Test
	public void EditWork()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://demo.actitime.com/login.do");

		ActitimeLoginLogout Log=new ActitimeLoginLogout(driver);
		Log.loginMethod();
		
		CreatTypeofWorkClass DelW=new CreatTypeofWorkClass(driver);
		DelW.HomePageSettingsIconButtonMethod();
		DelW.TypeOfWorkLinkMethod();
		DelW.WorkNameEditMethod();
		DelW.CTWPNameTextBoxMethod();
		DelW.ETWSaveChangesButtonMethod();
		DelW.TypeOfWorkPageLogoutButtonMethod();
	}

}
