
package TestScripts;

import org.testng.Assert;
import org.testng.annotations.*;

import Pages.BaseClass;
import Pages.DynamicLoadingPage;
import Pages.LoadingEx2Page;

public class LoadingEx2Test extends BaseClass {
	LoadingEx2Page loadingEx2Page;
	DynamicLoadingPage loadingPage;
	
	
	
	@Test
	public void validate_clickStartButton() {
		loadingPage = linksPage.click_DynamicLoadingLink();
		loadingEx2Page = loadingPage.clickLoadingExample2Link();
		loadingEx2Page.isStartButtonDisplayed();
		loadingEx2Page.clickStartButton();
		String expectedMsg =loadingEx2Page.loadedText();
		String actualMsg = "Hello World!";
		Assert.assertEquals(expectedMsg,actualMsg);
	}
	


	
	

}
