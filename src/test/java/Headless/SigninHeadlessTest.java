package Headless;

import org.testng.annotations.Test;

import base.HeadlessClass;
import pageObject.SigninPage;

public class SigninHeadlessTest extends HeadlessClass {
	
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
	
}


