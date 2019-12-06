package postBlo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {
		 
		// Initiate browser
		String key = "webdriver.chrome.driver";
		String value = "./exefiles/chromedriver.exe";
		System.setProperty(key, value);
		// ChromeDriver c = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		 
		// maximize browser
		driver.manage().window().maximize();
		 
		// Open webpage
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		 
		// Add 5 seconds wait
		Thread.sleep(5000);
		 
		// Create object of actions class
		Actions act=new Actions(driver);
		 
		// find element which we need to drag
		WebElement drag=driver.findElement(By.id("drag1"));
		
		Thread.sleep(3000);
		 
		// find element which we need to drop
		WebElement drop=driver.findElement(By.id("div2"));
		 
		// this will drag element to destination
		act.dragAndDrop(drag, drop).build().perform();
		 
		}
		 
		}