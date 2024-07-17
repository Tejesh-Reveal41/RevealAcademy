package LandingPageTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.LandingPage;
import POM.LoginPage;
import POM.SignUpPage;
import genericUtility.BaseClass;
import genericUtility.WebDriverUtility;
@Listeners(genericUtility.ListImp.class)
public class SignUpPageTest extends BaseClass{

	@Test
	public void signUpVald() throws Throwable {
		LandingPage lp=new LandingPage(driver);
		lp.getstartedButton().click();
		Thread.sleep(2000);
		SignUpPage sp=new SignUpPage(driver);
		sp.getFirstNameTextField().sendKeys("Test1");
		sp.getLastNameTextField().sendKeys("Test2");
		sp.getEmployeeID().sendKeys("R0041");
		sp.getEmailField().sendKeys("test12@ymail.com");
		sp.getPasswordField().sendKeys("123456");
		sp.getConfirmPasswordField().sendKeys("123456");
		sp.getSubmitButton().click();
		//WebDriverUtility.waitForElementPresent(driver, sp.getUserCreatedMessage()); //This method is used since the success or failure pop up would take time to appear.
		//Assert.assertTrue(sp.getUserCreatedMessage().getText().toLowerCase().contains("")); //Assert true is used in cases where a pop up message has to be verified/
	}
	@Test
	public void signinLinkvald() throws Throwable {
		LandingPage lp=new LandingPage(driver);
		Thread.sleep(2000);
		lp.getstartedButton().click();
		Thread.sleep(2000);
		SignUpPage sp=new SignUpPage(driver);
		sp.getSignInLink().click();
		Thread.sleep(2000);
		LoginPage lt=new LoginPage(driver);
		Assert.assertTrue(lt.getLogintext().getText().toLowerCase().contains("login"));
		Thread.sleep(1000);
		
	}
}
