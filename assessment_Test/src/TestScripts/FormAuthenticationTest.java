/**
 * 
 */
package TestScripts;

import Pages.BaseClass;
import Pages.FormAuthentication;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages.SecurePage;




public class FormAuthenticationTest extends BaseClass {
	private static final int priority = 0;
	FormAuthentication formPage;
	SecurePage sPage;
	
	@Test(priority=1)
	public void validate_success_Login() {
		formPage = linksPage.click_FormAuthenticationLink();
		formPage.login("tomsmith","SuperSecretPassword!");
		
		String actualMessage = formPage.loginStatusMsg();
		System.out.println(actualMessage);
		String expectedMessage ="You logged into a secure area!\n×";
		try {
		Assert.assertEquals(actualMessage,expectedMessage);
		System.out.println("Login sucessfull");
		}
		catch(Throwable e) {
			System.out.println("Error" + e);
		}
		
			
		
	}
	@Test(priority=2)
	public void validate_invalid_Login() {
		formPage = linksPage.click_FormAuthenticationLink();
		formPage.login("tom","SuperSecret");
		
		String actualMsg = formPage.loginStatusMsg();
		System.out.println(actualMsg);
		String expectedMsg ="Your username is invalid!\n×";
		
		try {
			Assert.assertEquals(actualMsg,expectedMsg);
			System.out.println("Login unsucessfull");
			}
			catch(Throwable e) {
				System.out.println("Error" + e);
			}	
		
	}
	@Test(priority=3)
	public void validate_invalidUsername_Login() {
		formPage = linksPage.click_FormAuthenticationLink();
		formPage.login("tom","SuperSecretPassword!");
		
		String actualMessage = formPage.loginStatusMsg();
		System.out.println(actualMessage);
		String expectedMessage ="Your username is invalid!\n×";
		try {
			Assert.assertEquals(actualMessage,expectedMessage);
			System.out.println("Login unsucessfull");
			}
			catch(Throwable e) {
				System.out.println("Error" + e);
			}	
			
		
	}
	@Test(priority=4)
	public void validate_invalidPassword_Login() {
		formPage = linksPage.click_FormAuthenticationLink();
		formPage.login("tomsmith","Super!");
		
		String actualMessage = formPage.loginStatusMsg();
		System.out.println(actualMessage);
		String expectedMessage ="Your password is invalid!\n×";
		try {
			Assert.assertEquals(actualMessage,expectedMessage);
			System.out.println("Login unsucessfull");
			}
			catch(Throwable e) {
				System.out.println("Error" + e);
			}	
			
		
	}
	@Test(priority=5)
	public void validate_missingInputs_Login() {
		formPage = linksPage.click_FormAuthenticationLink();
		formPage.login("","");
		
		String actualMessage = formPage.loginStatusMsg();
		System.out.println(actualMessage);
		String expectedMessage ="Your username is invalid!\n×";
		try {
			Assert.assertEquals(actualMessage,expectedMessage);
			System.out.println("Login unsucessfull");
			}
			catch(Throwable e) {
				System.out.println("Error" + e);
			}	
			
		
	}
	@Test(priority=6)
	public void validate_missingUsername_Login() {
		formPage = linksPage.click_FormAuthenticationLink();
		formPage.login("","SuperSecretPasswod!");
		
		String actualMessage = formPage.loginStatusMsg();
		System.out.println(actualMessage);
		String expectedMessage ="Your username is invalid!\n×";
		try {
			Assert.assertEquals(actualMessage,expectedMessage);
			System.out.println("Login unsucessfull");
			}
			catch(Throwable e) {
				System.out.println("Error" + e);
			}	
			
		
	}
	
	@Test(priority=7)
	public void validate_missingPassword_Login() {
		formPage = linksPage.click_FormAuthenticationLink();
		formPage.login("tomsmith","");
		
		String actualMessage = formPage.loginStatusMsg();
		System.out.println(actualMessage);
		String expectedMessage ="Your password is invalid!\n×";
		try {
			Assert.assertEquals(actualMessage,expectedMessage);
			System.out.println("Login unsucessfull");
			}
			catch(Throwable e) {
				System.out.println("Error" + e);
			}	
			
		
	}
	@Test(priority=8)
	public void validate_clickLogout() {
		formPage = linksPage.click_FormAuthenticationLink();
		
		sPage = formPage.login("tomsmith","SuperSecretPassword!");
		sPage.clickLogout();
		String actualMsg = formPage.loginStatusMsg();
		System.out.println(actualMsg);
		String expectedMsg ="You logged out of the secure area!\n×";
		
		try {
			Assert.assertEquals(actualMsg,expectedMsg);
			System.out.println("Sucessfully logged out");
			}
			catch(Throwable e) {
				System.out.println("Error" + e);
			}	
	
	}
	
	


}
