package magicleap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class Lt {

	public static RemoteWebDriver driver = null;

	boolean status = false;

	@BeforeClass
	@org.testng.annotations.Parameters(value={"browser","version","platform"})
	public void setUp(String browser, String version, String platform) throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", browser);
		capabilities.setCapability("version", version);
		capabilities.setCapability("platform", platform); // If this cap isn't specified, it will just get the any
															// available one
		capabilities.setCapability("build", "NEW");
		capabilities.setCapability("name", "LambdaTestJavaSample");
		capabilities.setCapability("network", true); // To enable network logs
		capabilities.setCapability("visual", true); // To enable step by step screenshot

		capabilities.setCapability("video", true); // To enable video recording
		capabilities.setCapability("console", true); // To capture console logs

		try {
			driver = new RemoteWebDriver(new URL(
					"https://adityad:wS3T8Z3ZuuoMKFHQ1CWBy9TNKzbbqFq1arS6kS1SjqPGw6derC@hub.lambdatest.com/wd/hub"),
					capabilities);
		} catch (MalformedURLException e) {
			System.out.println("Invalid grid URL");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testSimple() throws Exception {
		try {
			// Change it to production page
			driver.get("https://4dvanceboy.github.io/lambdatest/lambdasampleapp.html");

			// Let's mark done first two items in the list.
			driver.findElement(By.name("li1")).click();
			driver.findElement(By.name("li2")).click();

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
