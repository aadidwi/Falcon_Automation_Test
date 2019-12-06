package Falcon;

import java.io.File;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParameterDataProviderWithClassLevel {
	WebDriver driver;
	String d;

	@BeforeTest
	public void URLlanch() throws Throwable {
		//ChromeOptions options = new ChromeOptions();  
		//options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");  

		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		//driver = new ChromeDriver(options);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://accounts.lambdatest.com/login");

		driver.findElement(By.name("email")).sendKeys("adityad@lambdatest.com");
		driver.findElement(By.name("password")).sendKeys("7777777");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/form/div[3]/button")).click();

		WebElement reallink = driver.findElement(By.xpath("//*[@id=\"app\"]/header/aside/ul/li[2]/a"));

		reallink.click();

		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
		Date date = new Date();
		d = dateFormat.format(date);
		File dir = new File("C:/Users/Admin/Desktop/Automation_Testing/" + d + "");
		dir.mkdir();

	}

	// @SuppressWarnings("unchecked")
	@Test(dataProvider = "findProvider", dataProviderClass = New_Data_Provider.class)
	public void testMethod(String browser, String brosName, String Version, String verName, String OS, String OSName,
			String Resolution, String ResoName) throws InterruptedException {

		JavascriptExecutor je = (JavascriptExecutor) driver;
		String borwsre = "/html/body/app-root/app-console/app-header/section/app-test-detail/div[1]/div[2]/div/div[1]/app-desktop/div[1]/div/div[1]/div/ul/li["
				+ browser + "]";
		WebElement element1 = driver.findElement(By.xpath(borwsre));
		je.executeScript("arguments[0].scrollIntoView(true);", element1);

		String Verse = "/html/body/app-root/app-console/app-header/section/app-test-detail/div[1]/div[2]/div/div[1]/app-desktop/div[2]/div/div[1]/div/ul/li["
				+ Version + "]";
		WebElement element = driver.findElement(By.xpath(Verse));
		je.executeScript("arguments[0].scrollIntoView(true);", element);

		System.out.println(element.getText());
		String NewOS = "/html/body/app-root/app-console/app-header/section/app-test-detail/div[1]/div[2]/div/div[1]/app-desktop/div[3]/div/div[1]/div/ul/li["
				+ OS + "]";
		String Reso = "/html/body/app-root/app-console/app-header/section/app-test-detail/div[1]/div[2]/div/div[1]/app-desktop/div[4]/div/div[1]/div/ul/li["
				+ Resolution + "]";

		System.out.println(
				"Browser - " + brosName + " Version - " + verName + " OS - " + OSName + " Resolution - " + ResoName);

		String ss_name = brosName + "-" + verName + "-" + OSName + "-" + ResoName;
		Thread.sleep(1000);

		WebElement ClickBrowser = driver.findElement(By.xpath(borwsre));

		ClickBrowser.click();

		Thread.sleep(2000);
		WebElement ClickVersion = driver.findElement(By.xpath(Verse));

		ClickVersion.click();

		WebElement ClickOS = driver.findElement(By.xpath(NewOS));

		ClickOS.click();

		WebElement ClickReso = driver.findElement(By.xpath(Reso));

		ClickReso.click();

		Thread.sleep(2000);
		WebElement TestUrl = driver.findElement(By.id("input-text"));
		TestUrl.clear();
		TestUrl.sendKeys("https://www.ferro-ok.cz/");

		StopWatch pageLoad = new StopWatch();
		pageLoad.start();
		long start = System.currentTimeMillis();
		WebElement startbtn = driver.findElement(By.className("btn-start"));
		startbtn.click();

		Thread.sleep(2000);

		String TID = driver.getCurrentUrl();

		String[] TEST_ID = TID.split("https://app.lambdatest.com/viewer/");
		System.out.println(TEST_ID[1]);

		try {
			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.cssSelector(".display-container div div div canvas")));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("info-tab")));
		} catch (Throwable e) {
			System.err.println("Error Notification" + e.getMessage());
		}

		pageLoad.stop();

		long pageLoadTime_ms = pageLoad.getTime();
		long pageLoadTime_Seconds = pageLoadTime_ms / 1000;
		System.out.println("Total Page Load Time: " + pageLoadTime_ms + " milliseconds");
		System.out.println("Total Page Load Time: " + pageLoadTime_Seconds + " seconds");

		WebElement searchBtn = driver.findElement(By.id("info-tab"));
		Actions action = new Actions(driver);
		action.moveToElement(searchBtn).perform();

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {

			FileUtils.copyFile(src, new File("C:/Users/Admin/Desktop/LT_SS/" + d + "/Screenshot[" + brosName + ","
					+ verName + "," + OSName + "," + ResoName + "].png"));
		}

		catch (IOException e) {
			System.out.println(e.getMessage());

		}
		WebElement ExitVM = driver.findElement(By.cssSelector(".menu-7 a"));
		ExitVM.click();

		WebElement Exitconf = driver.findElement(By.cssSelector(".end-butt.yes"));
		Exitconf.click();

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
