package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SecurePage extends BaseClass {

		public SecurePage() {
			PageFactory.initElements(driver, this);
		}
		
		
		
		@FindBy(id = "flash")
		WebElement loginMsg;
		
		@FindBy(xpath = "//*[@id=\"content\"]/div/a")
		WebElement logoutButton;
		
		public FormAuthentication clickLogout()
		{
			logoutButton.click();
			return new FormAuthentication();
		}

		
		
}