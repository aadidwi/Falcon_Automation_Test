package magicleap;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LtTry {
	  public String username = "adityad";
	    public String accesskey = "x2CsRSl0PDmEjL9B9jGwf5QOb1Ee8pXCGAGiTKQS4SYpY24cBB";
	    public static RemoteWebDriver driver = null;
	    public String gridURL = "@hub.lambdatest.com/wd/hub";
	    boolean status = false;
	  
	    @BeforeClass
	    public void setUp() throws Exception {
     DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("browserName", "chrome");
	        capabilities.setCapability("version", "69.0");
	        capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get the any available one
	        capabilities.setCapability("build", "aadiwT");
	        capabilities.setCapability("name", "LambdaTestJavaSample");
	        capabilities.setCapability("network", true); // To enable network logs
	        capabilities.setCapability("visual", true); // To enable step by step screenshot
		
	        capabilities.setCapability("video", true); // To enable video recording
	        capabilities.setCapability("console", true); // To capture console logs
	        try {
	            driver = new RemoteWebDriver(new URL("https://adityad:x2CsRSl0PDmEjL9B9jGwf5QOb1Ee8pXCGAGiTKQS4SYpY24cBB@hub.lambdatest.com/wd/hub"), capabilities);
	        } catch (MalformedURLException e) {
	            System.out.println("Invalid grid URL");
	        }
	        catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
	  
	    @Test
	    public void testSimple() throws Exception 
	    {
	       try {
	              //Change it to production page
	            driver.get("https://www.lambdatest.com/");
	             
	              //Let's mark done first two items in the list.
	            System.out.println("URL IS:-" + driver.getCurrentUrl());
	         System.out.println( "PAGE_TITLE_IS:-"+ driver.getTitle());
	         
	             
	             // Let's add an item in the list.
	              driver.findElement(By.id("sampletodotext")).sendKeys("Yey, Let's add it to list");
	            driver.findElement(By.id("addbutton")).click();
	             
	              // Let's check that the item we added is added in the list.
	            String enteredText = driver.findElementByXPath("/html/body/div/div/div/ul/li[6]/span").getText();
	            if (enteredText.equals("Yey, Let's add it to list")) {
	                status = true;
	            }
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
	  
	    @AfterClass
	    public void tearDown() throws Exception {
	       if (driver != null) {
	            ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
	            driver.quit();
	        }
	    }
}
