package TestScripts;

import org.testng.Assert;
import org.testng.annotations.*;
import Pages.FormAuthentication;
import Pages.JsAlertsPage;
import Pages.BaseClass;
import Pages.DynamicLoadingPage;
//import assessment.



public class LinksHomePageTest extends BaseClass {
	//LinksHomePage linksPage;
	FormAuthentication formPage;
	JsAlertsPage alertPage;
	DynamicLoadingPage loadingPage;
	
	@Test
	public void validate_formAuthenticationLink() {
		formPage = linksPage.click_FormAuthenticationLink();
		String expectedURL = "https://the-internet.herokuapp.com/login";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL,expectedURL);
	}
	
	@Test
	public void validate_dynamicLoadingLink() {
		 loadingPage = linksPage.click_DynamicLoadingLink();
		 String expectedURL = "https://the-internet.herokuapp.com/dynamic_loading";
		 String actualURL = driver.getCurrentUrl();
		 Assert.assertEquals(actualURL,expectedURL);
	}
	
	
	
	@Test
	public void validate_jsAlertLink() {
		
		alertPage = linksPage.click_javaScriptAlertLink();
		String expectedURL = "https://the-internet.herokuapp.com/javascript_alerts";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL,expectedURL);
		//Assert.assertTrue(result);
		
	}
	
}



