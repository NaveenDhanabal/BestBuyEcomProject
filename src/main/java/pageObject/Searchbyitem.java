package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchbyitem {
	public WebDriver driver;
	public Searchbyitem (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	@FindBy(xpath="//a[@class=\"us-link\"]")
	WebElement countryusa;
	
	@FindBy(xpath="//input[@id='gh-search-input']")
	WebElement searchbar;
	
	@FindBy(xpath="//button[@title='submit search']")
	WebElement searchbutton;
	
	@FindBy(xpath="(//span[@aria-hidden='true'])[4]")
	WebElement i5dropdown;
	
	@FindBy (xpath="//div[@class='nested-option-list']//div[2]")
	WebElement i5core12thgen;
	
	@FindBy(xpath="(//h4[contains(@class,'sku-title')])[1]")
	WebElement laptopname;
	
	@FindBy(xpath="(//div[contains(@class,'priceView-hero-price priceView-customer-price')])[1]")
	WebElement laptopprice;
	
	@FindBy(xpath="(//button[contains(@type,'button')][normalize-space()='Add to Cart'])[1]")
	WebElement addcart;
	
	@FindBy(xpath="(//a[normalize-space()='Go to Cart'])[1]")
	WebElement gotocartbutton;
	
	@FindBy(xpath="(//button[normalize-space()='Checkout'])[1]")
	WebElement checkout;
	
	@FindBy(xpath="(//div[contains(@class,'button-wrap')])[1]")
	WebElement asguest;
	
	@FindBy(xpath="//input[@id='user.emailAddress']")
	WebElement contactemail;
	
	@FindBy(xpath="//input[@id='user.phone']")
	WebElement contactphonenumber;
	
	@FindBy(xpath="(//button[@class='btn btn-lg btn-block btn-secondary'])[1]")
	WebElement countinupayment;
	
	@FindBy(xpath="//div[@role=\"alert\"]")
	WebElement alert;
	
	@FindBy(xpath="//div[@class='no-results-copy']")
	WebElement noResult;

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
	public void SearchBar1(String Product) throws InterruptedException {
		searchbar.sendKeys(Product);
		searchbutton.click();
		i5dropdown.click();
		i5core12thgen.click();
		Thread.sleep(3000);
		System.out.println("Laptop Name : "+laptopname.getText());
		System.out.println("Laptop Price : "+laptopprice.getText());
		Thread.sleep(3000);
	}
	public void SearchBar2(String Product) throws InterruptedException {
		searchbar.sendKeys(Product);
		searchbutton.click();
		Thread.sleep(3000);
		System.out.println(noResult.getText());
	}
	public void SearchBar3(String Product) throws InterruptedException {
		searchbar.sendKeys(Product);
		searchbutton.click();
	}
	
	public void toCart() throws InterruptedException {
		if(addcart != null) {
			System.out.println("Product Not Available");
		}else {
			System.out.println("Product Added to the Card..!!!");
			addcart.click();
				}	
		return;
		}
	
	public void Cart() throws InterruptedException {
		if(addcart.isEnabled()) {
			System.out.println("Product Added to the Card..!!!");
			addcart.click();
		}else {
			System.out.println("Product Not Available");	
		}
		Thread.sleep(5000);
		gotocartbutton.click();
		Thread.sleep(5000);
		checkout.click();
		Thread.sleep(3000);
	}
	public void AsGuest() throws InterruptedException {
		asguest.click();
		Thread.sleep(5000);
	}
	public void ContactInfo(String EmailId, String PhoneNumber) throws InterruptedException {
		contactemail.sendKeys(EmailId);
		contactphonenumber.sendKeys(PhoneNumber);
		countinupayment.click();
		Thread.sleep(3000);
	}
	public boolean Alert() {
		return alert.isEnabled();
	}
	
	

}
