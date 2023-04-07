package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddItems {
	public WebDriver driver;
	public AddItems (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	
//Add Item By Brand Name	
	@FindBy(xpath="//a[@class=\"us-link\"]")
	WebElement countryusa;
	
	@FindBy(xpath="//button[@aria-label=\"Menu\"]")
	WebElement menubutton;
	
	@FindBy(xpath="//button[normalize-space()='Brands']")
	WebElement brandbutton;
	
	@FindBy(xpath="//a[normalize-space()='Apple']")
	WebElement apple;
	
	@FindBy(xpath="//a[@class='flex-link'][normalize-space()='iPhone']")
	WebElement iphone;
	
	@FindBy(xpath="//a[@data-lid='ubr_shp_nik']")
	WebElement nikon;
	
	@FindBy(xpath="//a[normalize-space()='Nikon DSLR cameras']")
	WebElement nikondslrcameras;
	
	@FindBy(xpath="//a[@class='flex-link'][normalize-space()='iPhone 14 Pro Max']")
	WebElement iphone14promax;
	
	@FindBy(xpath="//div[@class='sku-title']")
	WebElement productname;
	
	@FindBy(xpath="//span[normalize-space()='One-time payment']")
	WebElement productprice;
	
	@FindBy(xpath="(//div[@class='priceView-hero-price priceView-customer-price'])[1]")
	WebElement price;
	
	@FindBy(xpath="//button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button']")
	WebElement addtocart;

	@FindBy(xpath="(//button[@class='c-button c-button-secondary c-button-lg nice-choice-page__continue-button'])[1]")
	WebElement getstartedbutton;
	
	@FindBy(xpath="//label[@for='transactions-page__yes']")
	WebElement servicewithVerizonYes; //yes
	
	@FindBy(xpath="//label[@for='transactions-page__no']")
	WebElement servicewithVerizonNo; //no
	
	@FindBy(xpath="//button[@class='c-button c-button-secondary c-button-lg c-button-block transactions-page__continue-button']")
	WebElement continuebtn;
		
	@FindBy(xpath="//label[@for='transactions-page__no']")
	WebElement replacingExistingDevice; //no
	
	@FindBy(xpath="//button[@class='c-button c-button-outline c-button-lg c-button-block gray-outline-button']")
	WebElement addAnotherDivice; //no
	
	@FindBy(xpath="//button[@id='cnxfta-enterprise-trade-in-continue']")
	WebElement withoutTrade;
	
	@FindBy(xpath="(//button[@type='button'])[13]")
	WebElement getNumber;
	
	@FindBy(xpath="//button[@eventname=\"Select_New_Number_Continue\"]")
	WebElement contiune1;
	
	@FindBy(xpath="//button[@id=\"cnxfta-plan-selection-select-plan-button-5\"]")
	WebElement selectplan; 
	
	@FindBy(xpath="(//div[@class='plan-selection__name-price-copy v-m-bottom-xs'])[1]")
	WebElement planPrice;
	
	@FindBy(xpath="//button[@id=\"cnxfta-plan-selection-continue-button\"]")
	WebElement countinue2;

	@FindBy(xpath="//button[@id=\"cnxfta-review-plan-continue-button\"]")
	WebElement countinue3;
	
	@FindBy(xpath="//button[@id='cnxfta-go-to-cart-banner-go-to-cart']")
	WebElement goToCart;
	
	@FindBy(xpath="//button[@class='c-close-icon c-modal-close-icon']")
	WebElement closebtn;
	
	@FindBy(xpath="//button[normalize-space()='Checkout']")
	WebElement checkoutbutton;
	
	@FindBy(xpath="//div[@class='price-summary']")
	WebElement pricesummary;
	
	@FindBy(xpath="//input[@id='user.phone']")
	WebElement phonenumber;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-secondary']")
	WebElement countinuMobileSetup;
	
	public void CountryUSA() {
		countryusa.click();
	}
	//Title Validation	
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
	public void BrandButton() {
		brandbutton.click();
		apple.click();
	}
	public void Iphone() throws InterruptedException {
		iphone.click();
		Thread.sleep(3000);
		iphone14promax.click();
	}
	public void AddtoCart() throws InterruptedException {
		productprice.click();
		for(int i=0;i<=1;i++) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		}
		if (addtocart != null) {
			System.out.println("Product Available");
			System.out.println("Product Name : "+productname.getText());
			System.out.println("Product Price : "+price.getText());
			Thread.sleep(5000);
			addtocart.click();
		}else {
			System.out.println("Product Not Available");
		}
	}
	public void GetStarted() throws InterruptedException {
		getstartedbutton.click();
		Thread.sleep(2000);
		servicewithVerizonNo.click();
		Thread.sleep(2000);
		continuebtn.click();
		Thread.sleep(2000);
		addAnotherDivice.click();
		Thread.sleep(2000);
		withoutTrade.click();
		Thread.sleep(2000);
		getNumber.click();
		Thread.sleep(2000);
		contiune1.click();
		Thread.sleep(5000);
		System.out.println("Selected Plan & Price : "+planPrice.getText());
		Thread.sleep(2000);
		selectplan.click();
		Thread.sleep(2000);
		countinue2.click();
		Thread.sleep(5000);
		for(int i=0;i<=1;i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);
			}
		countinue3.click();
		Thread.sleep(2000);
		goToCart.click();
		Thread.sleep(5000);
		closebtn.click();
	}
	public void CheckOut() throws InterruptedException {
		System.out.println("Price Summary : "+pricesummary.getText());
		Thread.sleep(3000);
		checkoutbutton.click();
		if(checkoutbutton!=null) {
			System.out.println("Thank You for Shopping at BestBuy..!!!");
		}else {
			System.out.println("Sorry!.Please again...");
		}
	}
	public void ContactInfo(String PhoneNumber) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", phonenumber);
		phonenumber.sendKeys(PhoneNumber);
		Thread.sleep(2000);
		countinuMobileSetup.click();
		Thread.sleep(3000);
		if(countinuMobileSetup!=null) {
			System.out.println("Thank You for Shopping at BestBuy..!!!");
		}else {
			System.out.println("Sorry!.Please again...");
		}
	}
}
