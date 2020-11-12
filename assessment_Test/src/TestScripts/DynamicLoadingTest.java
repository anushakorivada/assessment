package TestScripts;

import org.testng.Assert;
import org.testng.annotations.*;

import Pages.BaseClass;
import Pages.DynamicLoadingPage;

public class DynamicLoadingTest extends BaseClass {
	DynamicLoadingPage loadingPage;
	
	/*@Test
	public void validate_clickLoadingExample1Link() {
		loadingPage = linksPage.click_DynamicLoadingLink();
		
		loadingPage.clickLoadingExample1Link();
		String expectedURL = "https://the-internet.herokuapp.com/dynamic_loading/1";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL,expectedURL);
	}*/
	
	@Test
	public void validate_clickLoadingExample2Link() {
		 loadingPage = linksPage.click_DynamicLoadingLink();
		 loadingPage.clickLoadingExample2Link();
		 String expectedURL = "https://the-internet.herokuapp.com/dynamic_loading/2";
		 String actualURL = driver.getCurrentUrl();
		 Assert.assertEquals(actualURL,expectedURL);
	}
	
	

}
