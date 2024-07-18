package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.GoDaddyHomePage;

public class GoDaddyHomePageNavTest extends BaseTest{
	
	@BeforeMethod
	public void openApplication() {
		driver= Browser.launchApplication("https://www.godaddy.com/");
	}
	
	@Test
	public void verifyGoDaddayNavigationMenues() throws InterruptedException {
		goDaddyHomePage = new GoDaddyHomePage(driver);
		
		goDaddyHomePage.clickOnDomains();
		goDaddyHomePage.clickOnSubDomains();
		String domainTitle =driver.getTitle();
		Assert.assertEquals(domainTitle, "Search & Buy Available Domains - Register a Domain with GoDaddy");
				
		goDaddyHomePage.clickOnLogo();
		
		
		goDaddyHomePage.clickOnWebSiteAndHosting();
		goDaddyHomePage.clickOnSubWebSiteAndHosting();
		String websiteHostingTitle =driver.getTitle();
		Assert.assertEquals(websiteHostingTitle,"Website Builder | Create a Free Website in Minutes - GoDaddy IN");
				
		goDaddyHomePage.clickOnLogo();
		
		
		goDaddyHomePage.clickOnSecurity(); 
		goDaddyHomePage.clickOnSubSecurity();
		String securityTitle=driver.getTitle();
				
		Assert.assertEquals(securityTitle,"SSL Certificate | Secure Your Data & Transactions - GoDaddy IN");
		
		
		goDaddyHomePage.clickOnLogo();
		
		goDaddyHomePage.clickOnMarketing();
		goDaddyHomePage.clickOnSubMarketing();
		String marketingTitle =driver.getTitle();
				
		Assert.assertEquals(marketingTitle,"Digital Marketing Suite | Get Found Everywhere Online - GoDaddy");
		
		goDaddyHomePage.clickOnLogo();
	}
	
	

}
