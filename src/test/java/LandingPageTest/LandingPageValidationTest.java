package LandingPageTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import POM.LandingPage;
import genericUtility.BaseClass;
import genericUtility.ListImp;
import genericUtility.WebDriverUtility;
@Listeners (genericUtility.ListImp.class)
public class LandingPageValidationTest extends BaseClass {

	@Test(priority = 1)
	public void getStartedButtonVald() throws Throwable {
		LandingPage lp = new LandingPage(driver);
		lp.getstartedButton().click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.getCurrentUrl().contains("signup"));
		ListImp.test.info("Redirected to signup page", MediaEntityBuilder.createScreenCaptureFromBase64String(WebDriverUtility.getScreenshotAsBase64(driver)).build());
	}
	
	@Test(priority = 2)
	public void welcomeTextVald() {
		LandingPage lp = new LandingPage(driver);
		Assert.assertTrue(lp.getWelcomeText().getText().toLowerCase().contains("welcome to reveal academy"));
		ListImp.test.info("Welcome Message Displayed", MediaEntityBuilder.createScreenCaptureFromBase64String(WebDriverUtility.getScreenshotAsBase64(driver)).build());
	}
}
