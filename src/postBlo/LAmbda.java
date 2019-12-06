package postBlo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lambda {

	/*public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		// ChromeDriver c = new ChromeDriver();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.lambdatest.com/feature");
		Actions actions = new Actions(driver);
		//WebElement elementLocator = driver.findElement(By.xpath("//*[@id=\"vid\"]"));
		
		//Thread.sleep(40);
	//	actions.contextClick(elementLocator).sendKeys(Keys.ENTER).perform();
		//driver.switchTo().
		
	//	actions.contextClick(elementLocator).sendKeys(Keys.ENTER).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).click().perform();
		
		


	}*/
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
     
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lambdatest.com/feature");
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.xpath("//*[@id=\"vid\"]"));
       actions.contextClick(elementLocator).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
        Actions action = new Actions(driver);
        action.contextClick(elementLocator).build().perform();
        Robot robot = new Robot();
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
    }
}


