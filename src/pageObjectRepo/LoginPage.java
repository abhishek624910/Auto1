package pageObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonUtilities.Constants;
import commonUtilities.Extensions;

public class LoginPage {
	@FindBy(name="user_name")
	private WebElement userName;
	@FindBy(name="user_password")
	private WebElement pwd;
	@FindBy(id="submitButton")
	private WebElement submit;
	public void loginToApp(){
		Extensions.pageToLoad(10);
		userName.sendKeys(Constants.username);
		pwd.sendKeys(Constants.password);
		submit.click();
	}
}
