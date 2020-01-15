package ReportUtility;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin {

	private WebDriver driver;
	// create a resultList that will contain number of test cases
	List<String> resultList = new ArrayList<String>();
	// create an instance of PdfUtilityClass
	pdfRepo pdfUtility = new pdfRepo();

	// login test
	@Test
	public void SeleniumMasterLoginTest() {
		{
			// open login page
			driver.get("https://accounts.lambdatest.com/login");

			driver.findElement(By.name("email")).sendKeys("adityad@lambdatest.com");
			driver.findElement(By.name("password")).sendKeys("7777777");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/form/div[3]/button")).click();

			WebElement reallink = driver.findElement(By.xpath("//*[@id=\"app\"]/header/aside/ul/li[2]/a"));

			reallink.click();
				}
			}

		
	

	@BeforeMethod
	public void Setup() {
		// add test result header information to the resultList
		resultList.add("Step Id, Action,Expected Result, Actual Result, Test Result");
		try {
			// initialize Firefox driver
			System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
			driver = new ChromeDriver();
			// obtain windows handler name
			String windowsHandle = driver.getWindowHandle();
			// assert that a window has been launched
			assertEquals(true, windowsHandle.length() > 0);
			// add a test step string to the resultList as pass after assertion true
			resultList.add("1, Open Browser,Browser should open, Browser Opened, Pass");
		} catch (Exception e) {
			// add a test step string to the resultList as fail after assertion true
			resultList.add("1, Open Browser,Browser should open, Browser NOT Opened, Fail");
		}

	}

	@AfterMethod
	public void TearDown() throws  IOException {
		// close the driver
		driver.close();
		// define a time stamp string to add to the test result
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		// add time stamp to the resultList
		resultList.add("Test Ends: " + timeStamp);
		// write the test result pdf file with file name TestResult
		pdfUtility.WriteTestResultToPdfFile("TestResult.pdf", resultList);
		// quit the driver
		driver.quit();
	}

}
