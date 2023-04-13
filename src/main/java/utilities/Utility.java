package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver intitalizeDriver() throws IOException {
		
		
		prop=new Properties();
		String proppath = System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties";
		FileInputStream fis = new FileInputStream(proppath);
		prop.load(fis);
		
		
		String browsername ="chrome";
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
				
		if(browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browsername.equals("edge")){
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}else if(browsername.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
//			System.setProperty("webdriver.gecko.driver", "D:\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Page loaded message:	
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	        if (js.executeScript("return document.readyState").toString().equals("complete")) {
	            System.out.println("Page has loaded");
	        }
		return driver;
		}
	
		
	//code to capture the screenshot
	public String takeScreenshot(String testName, WebDriver driver) throws IOException {
		File srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotFilePath=System.getProperty("user.dir")+"\\Screenshots"+testName+".png";
		FileUtils.copyFile(srcScreenshot, new File(screenshotFilePath));
		return screenshotFilePath;
		}
	
	//Switching to window
	public static void SwitchWindow() {
		String parentwindow=driver.getWindowHandle();
		Set<String> windowhandles=driver.getWindowHandles();
		windowhandles.size();
	
		
		for(String childWindow:windowhandles) {
			if(!childWindow.contentEquals(parentwindow)) {
				driver.switchTo().window(childWindow);
			}
		}
		
	}
	

}
