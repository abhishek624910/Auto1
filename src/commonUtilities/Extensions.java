package commonUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Extensions {
	public static void pageToLoad(int i){
		Browsers.driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
	}
	public static void selectByIndex(WebElement wb,int index){
		Select s=new Select(wb);
		s.selectByIndex(index);
	}
	public static void selectByValue(WebElement wb,String value){
		Select s=new Select(wb);
		s.selectByValue(value);
	}
	public static void selectByText(WebElement wb,String text){
		Select s=new Select(wb);
		s.selectByVisibleText(text);
	}
	public static void mouseHover(WebElement wb){
		Actions act=new Actions(Browsers.driver);
		act.moveToElement(wb).perform();
	}
	public static void rightClick(WebElement wb){
		Actions act=new Actions(Browsers.driver);
		act.contextClick(wb).perform();
	}
	public static void moveToFrame(int index){
		Browsers.driver.switchTo().frame(index);
	}
	public static void moveToFrame(String name){
		Browsers.driver.switchTo().frame(name);
	}
	public static void moveToFrame(WebElement wb){
		Browsers.driver.switchTo().frame(wb);
	}
	public static void moveToTopWindow(){
		Browsers.driver.switchTo().defaultContent();
	}
}
