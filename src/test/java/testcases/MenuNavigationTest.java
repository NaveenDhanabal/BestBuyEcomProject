package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObject.MenuNavigation;

public class MenuNavigationTest extends BaseClass {
	
	
	@Test
	public void Menulist() throws InterruptedException {
		MenuNavigation menulist = new MenuNavigation(driver);
		menulist.CountryUSA();
		menulist.TitleCheck();
		menulist.MenuButton();
		menulist.Computers();
		menulist.Product();
		menulist.Cart();
		Thread.sleep(3000);
		menulist.GotoCart();
	}
	
	

}
