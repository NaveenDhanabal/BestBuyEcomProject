package Headless;

import org.testng.annotations.Test;

import base.HeadlessClass;
import pageObject.AddItems;
import pageObject.SigninPage;

public class AddItemsHeadlessTest extends HeadlessClass {


// Add item by selection menu --> Brand Name :
	@Test
	public void BrandName() throws InterruptedException {
	AddItems brandname = new AddItems(driver);
		brandname.CountryUSA();
		brandname.TitleCheck();
		Thread.sleep(3000);
		brandname.MenuButton();
		brandname.BrandButton();
		Thread.sleep(5000);
		brandname.Iphone();
		Thread.sleep(3000);
		brandname.AddtoCart();
		brandname.GetStarted();
		brandname.CheckOut();
//	SigninPage signup = new SigninPage(driver);
//		signup.EmailId(prop.getProperty("Email"));
//		signup.PassWord(prop.getProperty("Password"));
//		signup.SubmitButn();
//		Thread.sleep(5000);
//		brandname.ContactInfo(prop.getProperty("PhoneNumber"));
	}
}
