package testClassTNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomClassPack1.ActitimeLoginLogout;
import pomClassPack1.LeaveTypeLinkOperation;
import pomClassPack1.LeaveTypePage;

public class DeleteLeaveTypeAndLogout 
{
	@Test
	public void DeleteLeave()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://demo.actitime.com/login.do");

		ActitimeLoginLogout Log=new ActitimeLoginLogout(driver);
		Log.loginMethod();
		
		LeaveTypeLinkOperation Link=new LeaveTypeLinkOperation(driver);
		Link.HomePageSettingsIconButtonMethod();
		Link.LeaveTypeLinkMethod();
		LeaveTypePage LTP=new LeaveTypePage(driver);
		LTP.LeaveDeleteButtonMethod();
		LTP.OKButtonInAlertPopUpMethod();
		LTP.LTPLogOutButtonMethod();
	}
}
