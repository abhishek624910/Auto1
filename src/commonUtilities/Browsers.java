package commonUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {
	public static WebDriver driver;
	public void getbrowser(){
		if(Constants.browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(Constants.browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", ".\\Resources\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else if(Constants.browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}else{
			driver=new FirefoxDriver();
		}
	}
}
