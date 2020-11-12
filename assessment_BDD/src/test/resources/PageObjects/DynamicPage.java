package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DynamicLoadingPage extends BaseClass {

	public DynamicLoadingPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/a[2]")
	WebElement loadingExample2Link;
	
	
	@FindBy(xpath ="//*[@id=\"content\"]/div/h3")
	WebElement pageHeader;
	
	
	public LoadingEx2Page clickLoadingExample2Link()
	{
		loadingExample2Link.click();
		return new LoadingEx2Page();
	}
	
	public boolean pageHeader() {
		pageHeader.isDisplayed();
		return true;
	}



	
	
}



