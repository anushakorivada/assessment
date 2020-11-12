package Pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class JsAlertsPage extends BaseClass {

		public JsAlertsPage() {
			PageFactory.initElements(driver, this);
		}
		
		
		
		@FindBy(xpath = "//*[@id=\"content\"]/div/h3")
		WebElement jsPageHeader;
		
		@FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[1]/button")
		WebElement jsAlertButton;
		
		@FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[2]/button")
		WebElement jsConfirmButton;
		
		@FindBy(xpath ="//*[@id=\"content\"]/div/ul/li[3]/button")
		WebElement jsPrompButton;
		
		@FindBy(id = "result")
		WebElement alertStatusMessage;
		
		
		
		public boolean JsPageHeader() {
			jsPageHeader.isDisplayed();
			return true;
		}
		
		public void clickForJsAlert() {
			jsConfirmButton.click();
			WebDriverWait wait = new WebDriverWait(driver,15);
			Alert jsConfirmAccept = wait.until(ExpectedConditions.alertIsPresent());
			
			String alertMsg = driver.switchTo().alert().getText();
			System.out.println(alertMsg);
			jsConfirmAccept.accept();
		}
		public void clickForJsConfirm() {
			jsConfirmButton.click();
			WebDriverWait wait = new WebDriverWait(driver,15);
			Alert jsConfirmAccept = wait.until(ExpectedConditions.alertIsPresent());
			
			String alertMsg = driver.switchTo().alert().getText();
			System.out.println(alertMsg);
			jsConfirmAccept.accept();
		}
		public void clickForJsConfirm_dismiss() {
			jsConfirmButton.click();
			WebDriverWait wait = new WebDriverWait(driver,15);
			Alert jsConfirmDismiss = wait.until(ExpectedConditions.alertIsPresent());
			
			String alertMsg = driver.switchTo().alert().getText();
			System.out.println(alertMsg);
			jsConfirmDismiss.dismiss();
		}
		
		public void clickForJsPrompt_accept(String promptText) {
			jsPrompButton.click();
			WebDriverWait wait = new WebDriverWait(driver,10);
			Alert jsPromptAccept = wait.until(ExpectedConditions.alertIsPresent());
			
			jsPromptAccept.sendKeys(promptText);
			String alertMsg = driver.switchTo().alert().getText();
			System.out.println(alertMsg);
			//driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
			jsPromptAccept.accept();
		}
		
		public void clickForJsPrompt_dismiss(String promptText) {
			jsPrompButton.click();
			WebDriverWait wait = new WebDriverWait(driver,10);
			Alert jsPromptDismiss = wait.until(ExpectedConditions.alertIsPresent());
			
			jsPromptDismiss.sendKeys(promptText);
			String alertMsg = driver.switchTo().alert().getText();
			System.out.println(alertMsg);
			//driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
			jsPromptDismiss.accept();
		}
	
		public String alertStatusMsg() {
			return alertStatusMessage.getText();
			
			//System.out.println(alertStatusMessage);
		}
		public void clickForJsAlertAccept() {
			jsAlertButton.click();
			WebDriverWait wait = new WebDriverWait(driver,15);
			Alert jsAlertAccept = wait.until(ExpectedConditions.alertIsPresent());
			
			String alertMsg = driver.switchTo().alert().getText();
			System.out.println(alertMsg);
			jsAlertAccept.accept();
			
		}


		

}
