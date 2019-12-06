package postBlo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class click {

	public static void main(String[] args) throws Exception {
		String key = "webdriver.chrome.driver";
		String value = "./exefiles/chromedriver.exe";
		System.setProperty(key, value);
		// ChromeDriver c = new ChromeDriver();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.lambdatest.com/");
		driver.findElement(By.linkText("Login")).click();
		System.out.println("login element clicked successfully");

		WebElement un_bx = driver.findElement(By.name("email"));
		un_bx.sendKeys("abcd");
		un_bx.sendKeys(Keys.CONTROL + "a");
		un_bx.sendKeys(Keys.DELETE);
		un_bx.sendKeys("adtiyadw.ivedi61@gmail.com");
		driver.findElement(By.name("password")).sendKeys("1234567");
		WebElement chkBx = driver.findElement(By.id("remember"));

		boolean flag2 = chkBx.isSelected();
		System.out.println(flag2);
		if (flag2) // true
		{
			System.out.println("checkbox is already selected");
		} else // false
		{
			System.out.println("select checkbox");
			chkBx.click();

		}
		driver.findElement(By.xpath("//*[@id=\"app\"]/section/form/div/div/button")).click();
		WebElement reallink = driver.findElement(By.xpath("//*[@id=\"app\"]/header/aside/ul/li[2]/a"));
		reallink.click();
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,1000)");

		Thread.sleep(2000);
		Actions act = new Actions(driver);
		driver.findElement(By.id("recent")).click();
		// Double click on element
		WebElement wb2 = driver.findElement(By.id("history-ACT1009631001566465288733290"));
		act.doubleClick(wb2).perform();

	}
}