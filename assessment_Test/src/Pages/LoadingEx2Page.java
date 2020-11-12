package Pages;

import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoadingEx2Page extends BaseClass {

	public LoadingEx2Page() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/h3")
	WebElement loadingPageHeader;
	
	@FindBy(id = "start")
	WebElement startButton;
	
	@FindBy(id = "finish")
	WebElement resultText;
	
	@FindBy(id = "loading")
	List<WebElement> loadingBar;
	
	public void clickStartButton() {
		
		startButton.click();
		WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
       /* try{
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.visibilityOf(resultText));
        }catch (NoSuchElementException e){
            throw new RuntimeException("Web element not visible within given time" + resultText +" Time "+ 5);
        }*/
	}

	public boolean isStartButtonDisplayed(){
		startButton.click();
        return startButton.isDisplayed();
        
    }
	public boolean LoadingPageHeader()
	{
		loadingPageHeader.isDisplayed();
		return true;
	}
	
	public String loadedText(){
		
        return resultText.getText();
    }

	
	
}




