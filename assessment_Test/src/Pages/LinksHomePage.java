package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class LinksHomePage extends BaseClass {
	
	
	public LinksHomePage() {
		PageFactory.initElements(driver, this);
	}

	
	
    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[21]/a")
	WebElement formAuthenticationLink;
	
	@FindBy(xpath = "//*[@id=\"content\"]/ul/li[14]/a")
	WebElement dynamicLoadingLink;
	
	@FindBy(xpath = "//*[@id=\"content\"]/ul/li[29]/a")
	WebElement javaScriptAlertLink;
	



public  FormAuthentication click_FormAuthenticationLink() {
	System.out.println("driver=" + driver);
	/*driver.findElement(formAuthenticationLink).isDisplayed();
	WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.presenceOfElementLocated(By(formAuthenticationLink)));
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);*/
    //formAuthenticationLink.isDisplayed();
	
	JavascriptExecutor je = (JavascriptExecutor) driver;
	je.executeScript("arguments[0].scrollIntoView(true);", formAuthenticationLink);
	
	formAuthenticationLink.click();
	return new FormAuthentication();
	}

public void setWebDriver(WebDriver driver) {
	// TODO Auto-generated method stub
	LinksHomePage.driver = driver;
}


public DynamicLoadingPage click_DynamicLoadingLink() {
	JavascriptExecutor je = (JavascriptExecutor) driver;
	je.executeScript("arguments[0].scrollIntoView(true);", dynamicLoadingLink);
	
	dynamicLoadingLink.click();
	return new DynamicLoadingPage();
	
	}

public JsAlertsPage click_javaScriptAlertLink() {
	JavascriptExecutor je = (JavascriptExecutor) driver;
	je.executeScript("arguments[0].scrollIntoView(true);", javaScriptAlertLink);
	//boolean result = javaScriptAlertLink.isDisplayed();
	//System.out.println(result);
	javaScriptAlertLink.click();
	
	return new JsAlertsPage();
	}


}
