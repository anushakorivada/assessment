
package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//import Pages.LinksHomePage;


public class BaseClass {
	protected static WebDriver driver;
	public LinksHomePage linksPage;
	
	@BeforeMethod
	public void setup() {	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohan\\eclipse-workspace\\webdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		linksPage = new LinksHomePage();
		linksPage.setWebDriver(driver);
		
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

