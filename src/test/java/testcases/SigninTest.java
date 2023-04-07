package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObject.SigninPage;


public class SigninTest extends BaseClass{
	
	@Test
	public void SignIn_ValidCredential () throws InterruptedException {
		SigninPage signup = new SigninPage(driver);
		signup.CountryUSA();
		signup.AccountBtn();
		signup.SignInButton();
		Thread.sleep(3000);
		signup.TitleCheck();
		Thread.sleep(3000);
		signup.EmailId(prop.getProperty("Email"));
		signup.PassWord(prop.getProperty("Password"));
		signup.SubmitButn();	
	}
	
	@Test
	public void SignIn_inValidCredential () throws InterruptedException {
		SigninPage signup = new SigninPage(driver);
		signup.CountryUSA();
		signup.AccountBtn();
		signup.SignInButton();
		Thread.sleep(3000);
		signup.TitleCheck();
		Thread.sleep(3000);
		signup.EmailId(prop.getProperty("Email"));
		signup.PassWord(prop.getProperty("InvalidPass"));
		signup.SubmitButn();	
	}		
	
	@Test
	public void SignUpPageCanada () throws InterruptedException {
		SigninPage signup = new SigninPage(driver);
		driver.get("https://www.bestbuy.ca/en-ca");
		signup.AccountButton();
		signup.UserName(prop.getProperty("Email"));
		signup.Password(prop.getProperty("NewPassword"));
		signup.SubmitButton();
	}
}

