package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class SignUpPage
{

	public SignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//input[@placeholder='Enter your first name']")
private WebElement firstNameTextField;

@FindBy(xpath="//input[@placeholder='Enter your last name']")
private WebElement lastNameTextField;

@FindBy(xpath="//input[@placeholder='R0001']")
private WebElement employeeID;

@FindBy(xpath="//input[@placeholder='Enter your email id']")
private WebElement emailField;

@FindBy (xpath="//input[@placeholder='Enter your password']")
private WebElement passwordField;

@FindBy (xpath="//input[@placeholder='Enter confirm password']")
private WebElement confirmPasswordField;

@FindBy (xpath="//input[@placeholder='Enter confirm password']")
private WebElement submitButton;

@FindBy (xpath="//div[@class='text-sm opacity-90']")
private WebElement userCreatedMessage;

@FindBy (xpath="//span[@class='text-primary font-semibold']")
private WebElement signInLink;

public WebElement getSignInLink() {
	return signInLink;
}

public WebElement getUserCreatedMessage() {
	return userCreatedMessage;
}

public WebElement getSubmitButton() {
	return submitButton;
}

public WebElement getConfirmPasswordField() {
	return confirmPasswordField;
}

public WebElement getPasswordField() {
	return passwordField;
}

public WebElement getEmailField() {
	return emailField;
}

public WebElement getEmployeeID() {
	return employeeID;
}

public WebElement getLastNameTextField() {
	return lastNameTextField;
}

public WebElement getFirstNameTextField() {
	return firstNameTextField;
}
}
