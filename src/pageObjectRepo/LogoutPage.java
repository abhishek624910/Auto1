package pageObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonUtilities.Extensions;

public class LogoutPage {
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement userProfile;
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signout;
	@FindBy()
	private WebElement submit;
	public void logoutFromApp(){
		Extensions.pageToLoad(10);
		Extensions.mouseHover(userProfile);
		signout.click();
	}
}
