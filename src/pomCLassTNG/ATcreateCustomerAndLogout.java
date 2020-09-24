package pomCLassTNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ATcreateCustomerAndLogout
{
	public WebDriver driver;

	@FindBy(xpath = "//div[@id='container_tasks']")
	private WebElement TaskPageNavigationField;
	@FindBy(xpath = "//div[@class='title ellipsis']")
	private WebElement AddNewButtonField;

	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement NewCustomerLink;

	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement enterCustomerField;

	@FindBy(xpath = "(//textarea[@class='textarea'])[9]")
	private WebElement enterCustomerDiscriptionTextField;

	@FindBy(xpath = "(//div[@class='greyButton cancelBtn']")
	private WebElement cancelButtonField;

	@FindBy(id = "customerLightBoxCloseButton")
	private WebElement closeButton; 
@FindBy(xpath="(//div[@class='editButton'])[17]")
private WebElement editLink;
@FindBy(xpath="(//div[@class='icon'])[28]")
private WebElement customerName;
@FindBy(xpath="(//input[@type='text'])[5]")
private WebElement CustomersearchTextField;

@FindBy(xpath="(//div[@class='actionButton'])[7]")
private WebElement ActionButton;
@FindBy(xpath="(//div[@class='title'])[45]")
private WebElement deleteButton;
@FindBy(xpath="(//div[@class='buttonIcon'])[3]")
private WebElement DeletePerminentlyButton;

@FindBy(xpath="(//div[@class='nameLabel'])[1]")
private WebElement customerNameTextField;

	@FindBy(xpath = "(//div[@class='components_button_label'])[17]")
	private WebElement createcustomerbuttonField;

	@FindBy(id="logoutLink")
	private WebElement LogoutButton;



	public ATcreateCustomerAndLogout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public void TaskPageNavigationMethod() throws InterruptedException
	{
		Thread.sleep(1000);
		TaskPageNavigationField.click();
	}

	public void AddNewButtonMethod()
	{
		AddNewButtonField.click();

	}

	public void NewCustomerLinkMethod()
	{
		NewCustomerLink.click();
	}

	public void createcustomerbuttonmethod() throws InterruptedException 
	{
		Thread.sleep(1000);
		//enterCustomerField.click();
		enterCustomerField.sendKeys("Q1");
		//enterCustomerDiscriptionTextField.click();
		enterCustomerDiscriptionTextField.sendKeys("testing");
		createcustomerbuttonField.click();

	}
	public void customerNameTextFieldMethod()
	{
		customerNameTextField.sendKeys("Q1");
	}
	
	
	public void editLinkMethod() throws InterruptedException
	{
		Thread.sleep(1000);
		editLink.click();
	}
	
	public void ActionButtonMethod()
	{
		ActionButton.click();
	}
	
	public void deleteButtonMethod()
	{
		deleteButton.click();
	}
	

	public void DeletePerminentlyButton()
	{

		Alert alt=driver.switchTo().alert();
		alt.accept();
	}

public void customerNameMethod()
{
	customerName.click();
}

	public void LogoutMethod()
	{
		LogoutButton.click();
	}

public void CustomersearchTextFieldMethod()
{
	CustomersearchTextField.sendKeys("suma");
	
}

}


