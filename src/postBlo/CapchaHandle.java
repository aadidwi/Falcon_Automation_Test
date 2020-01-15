package postBlo;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CapchaHandle {

	private WebDriver driver;
	private String baseUrl;

	@BeforeTest

	
	public void setUp() throws Exception {
		// Selenium version 3 beta releases require system property set up
		String key = "webdriver.chrome.driver";
		String value = "./exefiles/chromedriver.exe";
		System.setProperty(key, value);
		// Create a new instance for the class FirefoxDriver
		// that implements WebDriver interface
		driver = new ChromeDriver();
		// Implicit wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Assign the URL to be invoked to a String variable
		baseUrl = "https://www.in.ckgs.us/myaccount/";
	}

	@Test
	public void testPageTitle() throws Exception {
		// Open baseUrl in Firefox browser window
		driver.get(baseUrl);
		// Locate 'Current Passport Number' text box by cssSelector: tag and name
		// attribute
		WebElement passportNo = driver.findElement(By.cssSelector("input[name='currentPassportNo']"));
		// Clear the default placeholder or any value present
		passportNo.clear();
		// Enter/type the value to the text box
		passportNo.sendKeys("123456789");
		// prompting user to enter captcha
		String captchaVal = JOptionPane.showInputDialog("Please enter the captcha value:");
		// Type the entered captcha to the text box
		driver.findElement(By.id("recaptcha_response_field")).sendKeys(captchaVal);
	}

	@AfterTest
	public void tearDown() throws Exception {
		// Close the Firefox browser
		driver.close();
	}

}
