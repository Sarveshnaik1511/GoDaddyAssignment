package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import pojo.Browser;
import pom.GmailLoginPage;

public class LoginToGmailTest extends BaseTest {
	
	
	@BeforeMethod 
	public void openApplication() {
		driver= Browser.launchApplication("https://www.google.com/intl/en/gmail/about/");
	}
	
	@Test
	public void loginToGmail() throws EncryptedDocumentException, IOException {
		gmailLoginPage = new GmailLoginPage(driver);
		gmailLoginPage.clickOnSignInButton();
		gmailLoginPage.enterEmailAddress("emailAddresses", 1, 1);
		gmailLoginPage.clickOnNext();
	}
}
