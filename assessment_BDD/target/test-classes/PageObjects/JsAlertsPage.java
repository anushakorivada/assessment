package PageObjects;
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
		
		
		
		@FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[2]/button")
		WebElement jsConfirmButton;
		
		
		@FindBy(id = "result")
		WebElement alertStatusMessage;
		
		
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
		
		
		public String alertStatusMsg() {
			return alertStatusMessage.getText();
			
			//System.out.println(alertStatusMessage);
		}
		


		

}
