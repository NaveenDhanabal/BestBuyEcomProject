package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuNavigation {
	public WebDriver driver;
	public MenuNavigation (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}

// Menu List
		@FindBy(xpath="//a[@class=\"us-link\"]")
		WebElement countryusa;
		
		@FindBy(xpath="//button[@aria-label=\"Menu\"]")
		WebElement menubutton;
		
		@FindBy(xpath="(//button[normalize-space()='Cameras, Camcorders & Drones'])[1]")
		WebElement computers;
		
		@FindBy(xpath="(//button[normalize-space()='Cameras & Lenses'])[1]")
		WebElement laptopsanddesktops;
		
		@FindBy(xpath="(//a[normalize-space()='DSLR Cameras'])[1]")
		WebElement laptops;
		
		@FindBy(xpath="(//a[@class='image-link'])[1]")
		WebElement product; //Canon - EOS Rebel T7 DSLR Video Two Lens Kit with EF-S 18-55mm and EF 75-300mm Lenses
		
		@FindBy(xpath="(//h1[contains(text(),'Canon - EOS Rebel T7 DSLR Video Two Lens Kit with ')])[1]")
		WebElement productname;
		
		@FindBy(xpath="(//div[@class='priceView-hero-price priceView-customer-price'])[1]")
		WebElement productprice; //$549.99
		
		@FindBy(xpath="(//div[@class='fulfillment-add-to-cart-button'])[1]")
		WebElement addtocart;
		
		@FindBy(xpath="//div[@role='document']//div[@class='row']")
		WebElement message;
		
		@FindBy(xpath="//a[@class=\"c-button c-button-secondary c-button-sm c-button-block \"]")
		WebElement gotocart;
		
		@FindBy(xpath="//button[@class=\"btn btn-lg btn-block btn-primary\"]")
		WebElement checkout;
		
		public void CountryUSA() {
			countryusa.click();
		}
		public void TitleCheck() {
			String actualTitle = driver.getTitle();
			System.out.println("Page Title : "+driver.getTitle());
			String expectedTitle = "Best Buy | Official Online Store | Shop Now & Save";
			if(actualTitle.equalsIgnoreCase(expectedTitle))
				System.out.println("Title Matched");
			else
				System.out.println("Title didn't match");
		}
		public void MenuButton() {
			menubutton.click();
		}
		public void Computers() throws InterruptedException {
			computers.click();
			laptopsanddesktops.click();
			laptops.click();
			Thread.sleep(3000);
		}
		public void Product() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			for(int i=0;i<=1;i++) {
				js.executeScript("window.scrollBy(0,250)");
				Thread.sleep(2000);
				}
			product.click();
			Thread.sleep(3000);
			System.out.println("Product Name : "+productname.getText());
			System.out.println("Product Price : "+productprice.getText());
			Thread.sleep(2000);
			for(int i=0;i<=1;i++) {
				js.executeScript("window.scrollBy(0,500)");
				Thread.sleep(2000);
				}
		}
		public void Cart() {
			addtocart.click();
			if(addtocart!=null) {
				System.out.println("Product Added to Cart...!!!");
			}else {
				System.out.println("Product Not Available..");
			}
		}
		public void GotoCart() throws InterruptedException {
//			if(message.isDisplayed()) {
//				gotocart.click();
//				Thread.sleep(2000);
//				checkout.click();
//			}else {
//				checkout.click();
//			}
			gotocart.click();
			Thread.sleep(3000);
			checkout.click();
			if(checkout!=null) {
				System.out.println("Thank You for Shopping at BestBuy");
			}else {
				System.out.println("Sorry!.Please Try other products.");
			}
		}
		
}
