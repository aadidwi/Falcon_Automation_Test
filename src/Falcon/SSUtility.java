package Falcon;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class SSUtility {
	public static void CaptureSreenshot(WebDriver driver ,String  LambdaSS)
	{
		
		
		try
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File Source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Source, new File("./SCREENSHOTS/"+LambdaSS+".png"));
			System.out.println("Screenshts_taken");
		} 
		catch (Exception e)
		{
			System.out.println("Exception while taking screenshot"+e.getMessage());
			 
			
			
			
		} 
	}

}
