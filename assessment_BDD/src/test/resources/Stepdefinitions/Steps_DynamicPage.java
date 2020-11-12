package Stepdefinitions


import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import PageObjects.LinksHomePage;
import PageObjects.LoadingEx2Page;

public class DynamicPAgeSteps {
	public WebDriver driver;
	public LinksHomePage linkPage;
	public DynamicPage loadingPage;
	public LoadingEx2Page loadingEx2Page;
	
    @Given("User launch chrome browser")
    public void user_launch_chrome_browser(){
    	System.setProperty("webdriver.chrome.driver",System.getProperty("user")+"//Drivers/chromedriver.exe);")
    	driver = new ChomeDriver();
    	linkPage = new LinksHomePage(driver);
    	loadingPage = new DynamicLoadingPage(diver);
    }

   
    @Given("User click on example2 link")
    public void user_click_on_example2_link() {
    	driver.clickLoadingExample2Link();
        
    }

    @When("User Click on form Dynamic Loading link")
    public void user_click_on_form_dynamic_loading_link(){
    	linkPage.click_DynamicLoadingLink();
    }

    @Then("User navigates to dynamic loading page")
    public void user_navigates_to_dynamic_loading_page() {
    	loadingPage = linksPage.click_DynamicLoadingLink();
		 loadingPage.clickLoadingExample2Link();
		 String expectedURL = "https://the-internet.herokuapp.com/dynamic_loading/2";
		 String actualURL = driver.getCurrentUrl();
		 Assert.assertEquals(actualURL,expectedURL);
    }
    @When("Click on start button")
    public void click_on_start_button() {
    	startButton.click();
		WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
    }

   

    @Then("check for (string) message displays after loading bar dissapears")
    public void check_for_something_message_displays_after_loading_bar_dissapears(String strArg1){
    	
		String expectedMsg =loadingEx2Page.loadedText();
		String actualMsg = "Hello World!";
		Assert.assertEquals(expectedMsg,actualMsg);
    }


    @And("check page title should be as(string)")
    public void check_page_title_should_be_assomething(String strArg1)  {
        
    }

    @And("close bowser$")
    public void close_bowser() {
        driver.quit();
    }
}