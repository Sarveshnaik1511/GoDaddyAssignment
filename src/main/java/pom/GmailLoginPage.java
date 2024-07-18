package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Parametrization;

public class GmailLoginPage {
	@FindBy (xpath = "//a[@data-action='sign in']") private WebElement signInButton;
	@FindBy (xpath = "//input[@id='identifierId']") private WebElement emailOrPhoneField;
	@FindBy (xpath = "//div[@id='identifierNext']//div//button") private WebElement nextButton;
	
	public GmailLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignInButton() {
		signInButton.click();
	}
	
	public void enterEmailAddress(String sheet, int row , int column) throws EncryptedDocumentException, IOException {
		emailOrPhoneField.sendKeys(Parametrization.getData(sheet,row,column));
	}
	
	public void clickOnNext() {
		nextButton.click();
	}

}
