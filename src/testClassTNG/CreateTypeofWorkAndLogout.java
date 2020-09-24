package testClassTNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomClassPack1.ATcreateCustomerAndLogout;
import pomClassPack1.ActitimeLoginLogout;
import pomClassPack1.CreatTypeofWorkClass;

public class CreateTypeofWorkAndLogout 
{
	@Test

	public void CreateType() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://demo.actitime.com/login.do");

		ActitimeLoginLogout Log=new ActitimeLoginLogout(driver);
		Log.loginMethod();
		ATcreateCustomerAndLogout CNC=new ATcreateCustomerAndLogout(driver); //CNC--->create new customer
		CNC.TaskPageNavigationMethod();	

		CreatTypeofWorkClass TW=new CreatTypeofWorkClass(driver);
		TW.HomePageSettingsIconButtonMethod();
		TW.TypeOfWorkLinkMethod();
		TW.CreateTypeOfWorkButtonMethod();
		TW.CTWPcreateTypeofWorkButtonMethod();
		TW.CTWPNameTextBoxMethod();
		TW.CTWPNonBillableButton();
		TW.CTWPcreateTypeofWorkButtonMethod();
		TW.TypeOfWorkPageLogoutButtonMethod();


	}

}
