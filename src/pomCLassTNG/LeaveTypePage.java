package pomCLassTNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
public class LeaveTypePage 
{
	public WebDriver driver;
	@FindBy(xpath="//div[@id='ext-comp-1002']")
	private WebElement CreateLeaveTypeButton;
	
	@FindBy(xpath="//input[@id='leaveTypeLightBox_nameField']")
	private WebElement LeaveTypeNameTextbox;
	
	@FindBy(xpath="//div[@class='buttonIcon']")
	private WebElement CNLTPCreateLeaveTypeButton;   //CNLTP--->create new leave type page
	
	@FindBy(id="logoutLink")
	private WebElement LTPLogOutButton;    //LT-->Leave Type Page
	
	@FindBy(xpath="(//td[@class='leaveTypeDeleteCell last'])[7]")
	private WebElement LeaveDeleteButton;
	
	@FindBy(xpath="(//div[@class='leaveTypeNameText'])[5]")
	private WebElement LeaveTypeSelect;
	@FindBy(xpath="(//div[@class='leaveTypeNameText'])[6]")
	private WebElement EditTextField;
	
		
	@FindBy(xpath="(//div[@class='applyButton'])[2]")
	private WebElement okCheckMarkButton;
	
	
	public LeaveTypePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void CreateLeaveTypeButtonMethod()
	{
		CreateLeaveTypeButton.click();
	}
	public void LeaveTypeNameTextboxMethod()
	{
		LeaveTypeNameTextbox.sendKeys("LL");
	}
	
	public void CNLTPCreateLeaveTypeButtonMethod()
	{
		CNLTPCreateLeaveTypeButton.click();
	}
	
	public void LeaveDeleteButtonMethod()
	{
		LeaveDeleteButton.click();
	}
	
	public void LTPLogOutButtonMethod()
	{
		LTPLogOutButton.click();
	}
	
	public void OKButtonInAlertPopUpMethod()
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	
	public void LeaveTypeSelectMethod()
	{
		LeaveTypeSelect.click();
	}
	public void EditTextFieldMethod()
	{
		
		//EditTextField.clear();
		EditTextField.sendKeys("health");
	}
	
	public void okCheckMarkButtonMethod() 
	{
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("okCheckMarkButton.click();",okCheckMarkButton);

		
//		okCheckMarkButton.click();
	}
	

}
