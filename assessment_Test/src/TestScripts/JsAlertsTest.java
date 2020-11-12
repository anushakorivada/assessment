package TestScripts;


import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.BaseClass;
import Pages.JsAlertsPage;

public class JsAlertsTest extends BaseClass {
	JsAlertsPage alertPage;
	
	@Test
	public void validate_clickForJsAlertAccept() {
		alertPage = linksPage.click_javaScriptAlertLink();
		alertPage.clickForJsAlertAccept();
		String actualMsg = alertPage.alertStatusMsg();
		String expectedMsg = "You successfuly clicked an alert";
		Assert.assertEquals(actualMsg,expectedMsg);
	}
	@Test
	public void validate_clickForJsConfirm() {
		alertPage = linksPage.click_javaScriptAlertLink();
		alertPage.clickForJsConfirm();
		String actualMsg = alertPage.alertStatusMsg();
		String expectedMsg = "You clicked: Ok";
		Assert.assertEquals(actualMsg,expectedMsg);
	}
	@Test
	public void validate_clickForJsConfirm_dismiss() {
		alertPage = linksPage.click_javaScriptAlertLink();
		alertPage.clickForJsConfirm_dismiss();
		String actualMsg = alertPage.alertStatusMsg();
		String expectedMsg = "You clicked: Cancel";
		Assert.assertEquals(actualMsg,expectedMsg);
	}
	@Test
	public void validate_clickForJsPrompt_accept() {
		alertPage = linksPage.click_javaScriptAlertLink();
		alertPage.clickForJsPrompt_accept("hai");
		String actualMsg = alertPage.alertStatusMsg();
		String expectedMsg = "You entered: hai";
		Assert.assertEquals(actualMsg,expectedMsg);
	}
	/*
	@Test
	public void validate_clickForJsPrompt_textField() {
		alertPage = linksPage.click_javaScriptAlertLink();
		alertPage.clickForJsPrompt_textField(" ");
		String actualMsg = alertPage.alertStatusMsg();
		String expectedMsg = "You entered: ";
		Assert.assertEquals(actualMsg,expectedMsg);
	}*/
	
	@Test
	public void validate_clickForJsPrompt_dismiss() {
		alertPage = linksPage.click_javaScriptAlertLink();
		alertPage.clickForJsPrompt_dismiss("hai");
		String actualMsg = alertPage.alertStatusMsg();
		String expectedMsg = "You entered: hai";
		Assert.assertEquals(actualMsg,expectedMsg);
	}

}
