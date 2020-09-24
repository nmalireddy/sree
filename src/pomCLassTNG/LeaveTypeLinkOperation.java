package pomCLassTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeaveTypeLinkOperation
{
	public WebDriver driver;
	@FindBy(xpath = "(//div[@class='popup_menu_icon'])[2]")
	private WebElement HomePageSettingsIconButton;
	
	@FindBy(xpath = "(//a[@class='item_link'])[6]")
	private WebElement LeaveTypelink;
	
	public LeaveTypeLinkOperation(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void HomePageSettingsIconButtonMethod()
	{
		HomePageSettingsIconButton.click();
	}
	
	public void LeaveTypeLinkMethod()
	{
		LeaveTypelink.click();
	}
}
