package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.TimeoutExceededException;

public class GoDaddyHomePage {

	@FindBy (xpath ="//header[@id='header']//div[@class='text inverted pl-p15h58fl']//a[@aria-label='GoDaddy']") private WebElement goDaddyLogo;
	@FindBy (xpath ="//header[@id='header']//div[@class='text inverted pl-p15h58fl']//div//nav//ul//li//button")private List<WebElement> menues;
	@FindBy (xpath ="//div[@class='pl-p1l4r46u']//li[@class='pl-prkaso']") private List<WebElement> subList;
	
	private WebDriverWait wait;
	
	public GoDaddyHomePage(WebDriver driver) {
		// have initialized waits here
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnLogo() {
		// given waits to wait until element is clickable
		
		try{
			wait.until(ExpectedConditions.visibilityOf(goDaddyLogo)).click();
		}
		catch(StaleElementReferenceException e){
			wait.until(ExpectedConditions.visibilityOf(goDaddyLogo)).click();
		}
		}
	
	
	public void clickOnDomains() {
		wait.until(ExpectedConditions.elementToBeClickable(menues.get(0))).click();
	}
	
	public void clickOnSubDomains() {
		wait.until(ExpectedConditions.elementToBeClickable(subList.get(0))).click();
	}
	
	public void clickOnWebSiteAndHosting() {
		
		// the task is to come back to home page and again go to another page
		// so this refreshes the page leading to sometimes getting staleElementReferanceException
		// for that reason i have used try catch block to handle exception
		try {
			wait.until(ExpectedConditions.visibilityOf(menues.get(1))).click();	
		}
		catch(StaleElementReferenceException e) {
		wait.until(ExpectedConditions.visibilityOf(menues.get(1))).click();
		}
	}
	
	public void clickOnSubWebSiteAndHosting() {
		try {
		wait.until(ExpectedConditions.visibilityOf(subList.get(9))).click();
		}
		catch(StaleElementReferenceException e) {
			wait.until(ExpectedConditions.visibilityOf(subList.get(9))).click();
		}
		catch(TimeoutExceededException e) {
			wait.until(ExpectedConditions.visibilityOf(subList.get(9))).click();
		}
	}
	
	public void clickOnSecurity() {
		try{
			wait.until(ExpectedConditions.elementToBeClickable(menues.get(2))).click();
		}
		catch(StaleElementReferenceException e) {
			wait.until(ExpectedConditions.elementToBeClickable(menues.get(2))).click();
		}
	}
	
	public void clickOnSubSecurity() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(subList.get(16))).click();
		}
		catch(StaleElementReferenceException e) {
			wait.until(ExpectedConditions.elementToBeClickable(subList.get(16))).click();
		}
		catch(TimeoutExceededException e) {
			wait.until(ExpectedConditions.elementToBeClickable(subList.get(16))).click();
		}
	}
	
	public void clickOnMarketing() {
		try {
		wait.until(ExpectedConditions.elementToBeClickable(menues.get(3))).click();
		}
		catch(StaleElementReferenceException e) {
			wait.until(ExpectedConditions.elementToBeClickable(menues.get(3))).click();
		}
	}
		
	
	public void clickOnSubMarketing() {
		try{
			wait.until(ExpectedConditions.elementToBeClickable(subList.get(20))).click();
		}
		catch(StaleElementReferenceException e) {
			wait.until(ExpectedConditions.elementToBeClickable(subList.get(20))).click();
		}
		catch(TimeoutExceededException e) {
			wait.until(ExpectedConditions.elementToBeClickable(subList.get(20))).click();
		}
	}
	
	
}
