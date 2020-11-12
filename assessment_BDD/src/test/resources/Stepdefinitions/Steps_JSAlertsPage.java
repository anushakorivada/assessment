package stepdefinitions


import cucumber.api.java.en.*;
import org.testng.Assert;
import PageObjects.LinksHomePage;
import PageObjects.JsAlertsPage;

public class JsalertsPageSteps {
	public WebDriver driver;
	public LinksHomePage linkPage;
	public JsAlertsPage jsPage;
    @Given("User launch chrome browser")
    public void user_launch_chrome_browser(){
    	System.setProperty("webdriver.chrome.driver",System.getProperty("user")+"//Drivers/chromedriver.exe);")
    	driver = new ChomeDriver();
    	linkPage = new LinksHomePage(driver);
    	jsPage = new JsAlertsPage(diver);
    }

    @When("user clicks on javascipt alerts link")
    public void user_clicks_on_javascipt_alerts_link() {
    	linkPage.click_javaScriptAlertLink();
    }

    @Then("user navigate to javascripts alert page")
    public void user_navigate_to_javascripts_alert_page() {
        driver.JsAlertsPage();
    }

    @Then("user clicks on Jsconfirm button")
    public void user_clicks_on_jsconfirm_button() {
        driver.clickForJsConfirm();
    }

    @And("User opens URL (string)")
    public void user_opens_url_something(String strArg1)  {
    	 driver.JavaScriptAlertLink();
         if(driver.JavaScriptAlertLink().contains("Javascripts Alerts"){
         	driver.close();
         	Assert.assertTrue(false);
         
         }
         else {
         	Assert.assertEquals(title,diver.getTitle());
         }
    }

    @And("confirm popup is openend")
    public void confirm_popup_is_openend() {
    	jsPage = linksPage.click_javaScriptAlertLink();
    	jsPage.clickForJsConfirm();
		String actualMsg = jsPage.alertStatusMsg();
		String expectedMsg = "You successfuly clicked an alert";
		Assert.assertEquals(actualMsg,expectedMsg);
    }

    @And("user accepts the confirm alert")
    public void user_accepts_or_dissmiss_the_confirm_alert() {
    	jsPage = linksPage.click_javaScriptAlertLink();
    	jsPage.clickForJsConfirm();
		String actualMsg = jsPage.alertStatusMsg();
		String expectedMsg = "You clicked: Ok";
		Assert.assertEquals(actualMsg,expectedMsg);
		alertPage = linksPage.click_javaScriptAlertLink();
		alertPage.clickForJsConfirm_dismiss();
    }
    @And("user dismiss the confirm alert")
    public void user_accepts_or_dissmiss_the_confirm_alert() {
    	jsPage = linksPage.click_javaScriptAlertLink();
    	jsPage.clickForJsConfirm_dismiss();
		String actualMsg = jsPage.alertStatusMsg();
		String expectedMsg = "You clicked: Cancel";
		Assert.assertEquals(actualMsg,expectedMsg);
		
    }
        

    @And("Close the browser")
    public void close_the_browser(){
        driver.quit();
    }

}