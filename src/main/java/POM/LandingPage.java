package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Get Started']")
	private WebElement startedButton;
	
	@FindBy(xpath="//p[@class='text-textPrimary font-semibold text-[60px]']")
	private WebElement welcomeText;
	
	@FindBy(xpath="//p[normalize-space()='Healthcare']")
	private WebElement healthcareTile;

	public WebElement getHealthcareTile() {
		return healthcareTile;
	}

	public WebElement getstartedButton() {
		return startedButton;
	}

	public WebElement getWelcomeText() {
		return welcomeText;
	}
	
	
}
