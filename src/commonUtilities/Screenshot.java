package commonUtilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Screenshot implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String fileName=result.getMethod().getMethodName();
		TakesScreenshot ts=(TakesScreenshot) Browsers.driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File(".//Screenshot//"+fileName+".png");
		try{
			FileUtils.copyFile(src, des);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String fileName=result.getMethod().getMethodName();
		TakesScreenshot ts=(TakesScreenshot) Browsers.driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File(".//Screenshot//"+fileName+".png");
		try{
			FileUtils.copyFile(src, des);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
