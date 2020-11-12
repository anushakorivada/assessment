

Package PageObject

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


public class LinksHomePage,FormAuthentication extends BaseClass {
	
	
	public LinksHomePage() {
		PageFactory.initElements(driver, this);
	}

	public FormAuthentication() {
		PageFactory.initElements(driver, this);
		
	}
	
    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[21]/a")
	WebElement formAuthenticationLink;
    
    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"login\"]/button/i")
    WebElement loginButton;

    @FindBy(xpath ="//*[@id=\"content\"]/div/h2")
    WebElement pageHeader;

    @FindBy(id = "flash")
    WebElement loginMessage;


    
    
public  FormAuthentication click_FormAuthenticationLink() {
	System.out.println("driver=" + driver);
	
	JavascriptExecutor je = (JavascriptExecutor) driver;
	je.executeScript("arguments[0].scrollIntoView(true);", formAuthenticationLink);
	
	formAuthenticationLink.click();
	return new FormAuthentication();
	}



public void enterUsername(String Uname)
{
	username.sendKeys(Uname);
}
public void enterPassword(String Psword)
{
    password.sendKeys(Psword);
}
public void clickLoginSubmit()
{
	loginButton.click();
	WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("flash")));
}

public String loginStatusMsg() {
	
	return loginMessage.getText();
	
	
}
public boolean pageHeader() {
	pageHeader.isDisplayed();
	return true;
}

public SecurePage login(String Uname, String Psword) {
	this.enterUsername(Uname);
	this.enterPassword(Psword);
	loginButton.click();
	WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("flash")));
	return new SecurePage();
	
}


}
