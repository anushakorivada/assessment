
package Stepdefinitions


import cucumber.api.java.en.*;
import PageObjects.LinksHomePage;
import PageObjects.formPage;
import PageObjects.LinksHomePage;




public class FormLinkSteps {
	
	public WebDriver driver;
	public LinksHomePage linkPage;
	public FormAuthentication fPage;
	public SecurePage securePage;

    @Given("User launch chrome browser")
    public void user_launch_chrome_browser() {
    	System.setProperty("webdriver.chrome.driver",System.getProperty("user")+"//Drivers/chromedriver.exe);")
    	driver = new ChomeDriver();
    	linkPage = new LinksHomePage(driver);
    	fPage = new FormAuthentication(driver);
    	securePage = new SecurePage(driver);
    }

    @When("Click on form authentication link")
    public void click_on_form_authentication_link() {
    	linkPage.click_FormAuthenticationLink();
    }

    @Then("User navigates to login page and page URL should be {string}")
    public void user_navigates_to_login_page(String title) {
        driver.FormAuthentication();
        if(driver.FormAuthentication().contains("Your username is invalid\nx"){
        	driver.close();
        	Assert.assertTrue(false);
        
        }
        else {
        	Assert.assertEquals(title,diver.getTitle());
        }
    }


    @When("User enters username (.*) and password as (.*)")
    public void user_enters_username_something_and_password_as_(String uname, String Psword) throws Throwable {
        fPage.setUsername(uname);
        fPage.setUsername(psword);
    }

   

    
    @Then("User navigates to login page")
    public void user_navigates_to_login_page() throws Throwable {
        driver.login();
    }

    @Then("User navigates to secure page and page header should (string)")
    public void user_navigates_to_secure_page_and_page_header_should_something(String strArg1)  {
    	driver.FormAuthentication();
    	driver.SecurePage();
        if(driver.SecurePage().contains("You entered into secure area!\nx"){
        	driver.close();
        	Assert.assertTrue(false);
        
        }
        else {
        	Assert.assertEquals(title,diver.getTitle());
        }
    }


    
    @And("Clicks on login button")
    public void clicks_on_login_button() {
        driver.login();
    }

    @And("Close browser")
    public void close_browser() {
      driver.quit();
}