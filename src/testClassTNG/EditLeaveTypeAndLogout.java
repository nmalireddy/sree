package testClassTNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomCLassTNG.LeaveTypePage;
import pomClassPack1.ActitimeLoginLogout;
import pomClassPack1.LeaveTypeLinkOperation;

public class EditLeaveTypeAndLogout 
{
@Test
	public void EditLeave() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://demo.actitime.com/login.do");

		ActitimeLoginLogout Log=new ActitimeLoginLogout(driver);
		Log.loginMethod();

		LeaveTypeLinkOperation Edit=new LeaveTypeLinkOperation(driver);
		Edit.HomePageSettingsIconButtonMethod();
		Edit.LeaveTypeLinkMethod();
		
		LeaveTypePage LEdit=new  LeaveTypePage(driver);
		LEdit.LeaveTypeSelectMethod();
		LEdit.EditTextFieldMethod();
		LEdit.okCheckMarkButtonMethod();
		LEdit.LTPLogOutButtonMethod();
		LEdit.OKButtonInAlertPopUpMethod();


	}

}
