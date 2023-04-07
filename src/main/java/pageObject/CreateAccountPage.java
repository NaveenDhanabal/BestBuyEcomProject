package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {

	public WebDriver driver;
	
	public CreateAccountPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

//For USA
		@FindBy(xpath="//a[@class=\"us-link\"]")
		WebElement countryusa;
		
		@FindBy(xpath="//button[@data-lid=\"hdr_signin\"]")
		WebElement accountbutton;
		
		@FindBy(xpath="//a[@class=\"c-button c-button-outline c-button-sm create-account-btn\"]")
		WebElement createaccountbtn;
		
		@FindBy(xpath="//input[@id='firstName']")
		WebElement firstname;
		
		@FindBy(xpath="//input[@id='lastName']")
		WebElement lastname;
		
		@FindBy(xpath="//input[@id='email']")
		WebElement email;
		
		@FindBy(xpath="//input[@id='fld-p1']")
		WebElement password;
		
		@FindBy(xpath="//input[@id='reenterPassword']")
		WebElement confirmpassword;
		
		@FindBy(xpath="//input[@id='phone']")
		WebElement phonenumber;
		
		@FindBy(xpath="//button[@type=\"submit\"]")
		WebElement submitbutton;
		
		@FindBy(xpath="//div[@aria-label=\"Error\"]")
		WebElement alert;
		
//For USA
	public void CountryUSA() {
		countryusa.click();
	}
	public void AccountButton() {
		accountbutton.click();
	}
	public void CreateAccountButton() {
		createaccountbtn.click();
	}
	public void FirstName(String Firstname) {
		firstname.sendKeys(Firstname);
	}
	public void LastName(String Lastname) {
		lastname.sendKeys(Lastname);
	}
	public void Email(String EmailId) {
		email.sendKeys(EmailId);
	}
	public void Password(String Password) {
		password.sendKeys(Password);
	}
	public void ConfirmPassword(String ConfirmPassword) {
		confirmpassword.sendKeys(ConfirmPassword);
	}
	public void PhoneNumber(String PhoneNumber) {
		phonenumber.sendKeys(PhoneNumber);
	}
	public void Submit() {
		submitbutton.click();
	}
	public void AlertMsg() {
		System.out.println(alert.getText());
	}
	
//For Canada
		@FindBy(xpath="//h4[contains(text(),\"Canada\")]")
		WebElement countrycanada;
		
		@FindBy(xpath="(//div[@class='signInOutNavContainer_2mwkw'])[1]")
		WebElement accountbtn;
		
		@FindBy(xpath="//span[normalize-space()='Create an account']")
		WebElement createaccountbutton;
		
		@FindBy(xpath="//input[@id='firstName']")
		WebElement namefirst;
		
		@FindBy(xpath="//input[@id='lastName']")
		WebElement namelast;
		
		@FindBy(xpath="//input[@id='email']")
		WebElement emailid;
		
		@FindBy(xpath="//input[@id='password']")
		WebElement newpassword;
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement submit;

	public void CountryCanada() {
		Actions action = new Actions(driver);
		action.doubleClick(countrycanada).build().perform();
	}
	public void AcountBtn() {
		Actions action = new Actions(driver);
		action.doubleClick(accountbtn).build().perform();
//		accountbtn.click();
	}
	public void CreateAccountButn() {
		createaccountbutton.click();
	}
	public void NameFirst(String FirstName) {
		namefirst.sendKeys(FirstName);
	}
	public void NameLast(String LastName) {
		namelast.sendKeys(LastName);
	}
	public void EmailId(String Email) {
		emailid.sendKeys(Email);
	}
	public void NewPassword(String NewPassword) {
		newpassword.sendKeys(NewPassword);
	}
	public void SubmitButton() {
		submit.click();
	}

}
