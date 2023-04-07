package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	public WebDriver driver;
	public SigninPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//for USA
	@FindBy(xpath="//a[@class=\"us-link\"]")
	WebElement countryusa;
	
	@FindBy(xpath="//button[@data-lid=\"hdr_signin\"]")
	WebElement accountbtn;
	
	@FindBy(xpath="//a[@data-lid=\"ubr_mby_signin_b\"]")
	WebElement signinbtn;
	
	@FindBy(xpath="//input[@id='fld-e']")
	WebElement emailid;
	
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement passWord;
	
	@FindBy(xpath="//button[normalize-space()='Sign In']")
	WebElement submitbutton;
	
	@FindBy(xpath="(//div[@aria-label='Error'])[1]")
	WebElement errormsg;
	
	public void CountryUSA() {
		countryusa.click();
	}
	public void AccountBtn() {
		accountbtn.click();
	}
	public void SignInButton() {
		signinbtn.click();
	}
	public void EmailId(String Email) {
		emailid.sendKeys(Email);
	}
	public void PassWord(String Password) {
		passWord.sendKeys(Password);
	}
	public void SubmitButn() throws InterruptedException {
		submitbutton.click();
		Thread.sleep(3000);
		System.out.println(errormsg.getText());
		}
	
//Validation 	
	public void TitleCheck() throws InterruptedException {
		String actualTitle = driver.getTitle();
		System.out.println("Page Title : "+driver.getTitle());
		Thread.sleep(2000);
		String expectedTitle = "Sign In to Best Buy";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
	}
	
//for Canada
		@FindBy(xpath="//div[@class=\"signInOutNavContainer_2mwkw\"]")
		WebElement accountbutton;
		
		@FindBy(xpath="//input[@id='username']")
		WebElement username;
		
		@FindBy(xpath="//input[@id='password']")
		WebElement password;
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement submit;
		
		
		public void AccountButton() {
			accountbutton.click();
		}
		public void UserName(String Email) {
			username.sendKeys(Email);
		}
		public void Password(String NewPassword) {
			password.sendKeys(NewPassword);
		}
		public void SubmitButton() {
			submit.click();
		}
		
}
