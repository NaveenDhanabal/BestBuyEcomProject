package Headless;

import org.testng.annotations.Test;

import base.HeadlessClass;
import pageObject.MenuNavigation;

public class MenuNavigationHeadlessTest extends HeadlessClass {
	
	
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
