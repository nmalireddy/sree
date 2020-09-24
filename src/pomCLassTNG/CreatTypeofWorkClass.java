package pomCLassTNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatTypeofWorkClass
{

	public WebDriver driver;

	@FindBy(xpath = "(//div[@class='popup_menu_icon'])[2]")
	private WebElement HomePageSettingsIconButton;
	@FindBy(xpath = "(//a[@class='item_link'])[5]")
	private WebElement TypeOfWorkLink;
	@FindBy(xpath = "//div[@id='ext-gen6']")
	private WebElement CreateTypeOfWorkButton;

	@FindBy(xpath = "//input[@name='name']")
	private WebElement CTWPNameTextBox;    //CTWP--Create Type Of WOrkPage

	@FindBy(xpath = "//input[@id='billingType_setNonBillable']")
	private WebElement CTWPNonBillableButton;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement CTWPcreateTypeofWorkButton;

	@FindBy(id="logoutLink")
	private WebElement TypeOfWorkPageLogoutButton;

	@FindBy(xpath="//a[@href='javascript:deleteType(21);']")
			private WebElement DeleteButtonForTypeOfWork;
	
	@FindBy(xpath="//a[@href='/administration/btedit.do?id=23&resetForm=true']")
	private WebElement LeaveNameEdit;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement ETWSaveChangesButton;  //ETW-->Edit Type of Work


	public CreatTypeofWorkClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void HomePageSettingsIconButtonMethod()
	{
		HomePageSettingsIconButton.click();
	}
	public void TypeOfWorkLinkMethod()
	{
		TypeOfWorkLink.click();
	}
	public void CreateTypeOfWorkButtonMethod()
	{
		CreateTypeOfWorkButton.click();
	}
	public void  CTWPNameTextBoxMethod()
	{
		CTWPNameTextBox.clear();
		CTWPNameTextBox.sendKeys("Naren2");
	}

	public void  CTWPNonBillableButton()
	{

		CTWPNonBillableButton.click();
		

	}

	public void  CTWPcreateTypeofWorkButtonMethod()
	{

		CTWPcreateTypeofWorkButton.click();


	}
	public void TypeOfWorkPageLogoutButtonMethod()
	{
		TypeOfWorkPageLogoutButton.click();
	}
				public void DeleteButtonForTypeOfWorkMethod()
				{
					DeleteButtonForTypeOfWork.click();
				}
				
				public void LeaveNameEditMethod()
				{
					LeaveNameEdit.click();
				}
				public void ETWSaveChangesButtonMethod()
				{
					ETWSaveChangesButton.click();
				}

	public void OKButtonInAlertPopUpMethod()
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}


}
