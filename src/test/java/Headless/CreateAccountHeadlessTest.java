package Headless;

import org.testng.annotations.Test;

import base.HeadlessClass;
import pageObject.CreateAccountPage;

public class CreateAccountHeadlessTest extends HeadlessClass {

	@Test
	public void CreateAccount_USA() throws InterruptedException {
		CreateAccountPage usa = new CreateAccountPage(driver);
		usa.CountryUSA();
		usa.AccountButton();
		usa.CreateAccountButton();
		usa.FirstName(prop.getProperty("Firstname"));
		usa.LastName(prop.getProperty("Lastname"));
		usa.Email(prop.getProperty("EmailId"));
		usa.Password(prop.getProperty("Password"));
		usa.ConfirmPassword(prop.getProperty("ConfirmPassword"));
		usa.PhoneNumber(prop.getProperty("PhoneNumber"));
		usa.Submit();
		Thread.sleep(3000);
		usa.AlertMsg();
	}
	
//	@Test
	public void CreateAccount_Canada() {
		CreateAccountPage canada = new CreateAccountPage(driver);
//		driver.get("https://www.bestbuy.ca/en-ca?intlreferer=&intlredir=https://www.bestbuy.com/");
		canada.CountryCanada();
		canada.AcountBtn();
		canada.CreateAccountButn();
		canada.NameFirst(prop.getProperty("FirstName"));
		canada.NameLast(prop.getProperty("LastName"));
		canada.EmailId(prop.getProperty("Email"));
		canada.NewPassword(prop.getProperty("NewPassword"));
//		canada.SubmitButton();
	}

}
