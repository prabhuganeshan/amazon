package pojo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.utili;

public class LoginPojo extends utili {
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//span[text()='Hello, Sign in']")
	 private WebElement Hellosigin;
	 
	 @FindBy(xpath="(//span[text()='Sign in'])[2]")
	 private WebElement Sigin;
	 
	 @FindBy(id="ap_email")
	 private WebElement phoneoremail;
	 
	 @FindBy(id="continue")
	 private WebElement phoneoremailContinue;
	 
	 @FindBy(id="ap_password")
	 private WebElement password;
	 
	 @FindBy(id="signInSubmit")
	 private WebElement submit;

	public WebElement getHellosigin() {
		return Hellosigin;
	}

	public WebElement getSigin() {
		return Sigin;
	}

	public WebElement getPhoneoremail() {
		return phoneoremail;
	}

	public WebElement getPhoneoremailContinue() {
		return phoneoremailContinue;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}
	 
	 
	 
	 
}
