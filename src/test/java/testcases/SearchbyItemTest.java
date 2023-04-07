package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObject.Searchbyitem;
import pageObject.SigninPage;

public class SearchbyItemTest extends BaseClass{

//Add item by Searching with product name:	
		@Test
		public void AddItem_BySearch() throws InterruptedException {
			Searchbyitem searchitem = new Searchbyitem(driver);
				searchitem.CountryUSA();
				searchitem.TitleCheck();
				Thread.sleep(3000);
				searchitem.SearchBar1(prop.getProperty("Product"));
				searchitem.Cart();
			SigninPage signup = new SigninPage(driver);
				signup.EmailId(prop.getProperty("EmailId"));
				signup.PassWord(prop.getProperty("Password"));
				signup.SubmitButn();
				Thread.sleep(5000);
//Guest login:
				if(searchitem.Alert()) {
					searchitem.AsGuest();
					searchitem.ContactInfo(prop.getProperty("EmailId"), prop.getProperty("PhoneNumber"));
				}else {
					System.out.println("Unable to singn");
				}
			}
		
		@Test
		public void Product_Unavailable() throws InterruptedException {
			Searchbyitem search = new Searchbyitem(driver);
			search.CountryUSA();
			search.TitleCheck();
			search.SearchBar3(prop.getProperty("ProductName"));
			search.toCart();
		}
		
		@Test
		public void Search_invalid_Item() throws InterruptedException {
			Searchbyitem searchproduct = new Searchbyitem(driver);
				searchproduct.CountryUSA();
				searchproduct.TitleCheck();
				Thread.sleep(2000);
				searchproduct.SearchBar2(prop.getProperty("InvalidProduct"));
		}

		
}
