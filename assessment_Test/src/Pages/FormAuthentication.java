package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormAuthentication extends BaseClass {

	public FormAuthentication() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"login\"]/button/i")
	WebElement loginButton;
	
	
	@FindBy(id = "flash")
	WebElement loginMessage;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/a")
	WebElement logoutButton;

	
	
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
	
	public SecurePage login(String Uname, String Psword) {
		this.enterUsername(Uname);
		this.enterPassword(Psword);
		loginButton.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("flash")));
		return new SecurePage();
		
	}


	public FormAuthentication clickLogout()
	{
		logoutButton.click();
		return new FormAuthentication();
	}
	
	
}
