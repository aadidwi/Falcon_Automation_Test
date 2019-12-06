package postBlo;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Random1 {
	   public static void main(String[] args) throws InterruptedException, Exception 
	   {
	      // TODO Auto-generated method stub
	     // WebDriver obj=new FirefoxDriver();
	      
	      String key = "webdriver.chrome.driver";
			String value = "./exefiles/chromedriver.exe";
			System.setProperty(key, value);
			// ChromeDriver c = new ChromeDriver();
			WebDriver obj = new ChromeDriver();

	      obj.get("https://www.lambdatest.com");
	      Thread.sleep(5000);
	      
	 //  Object rb = robot.mouseMove(x,y);
	   
	   Actions actions = new Actions(obj);

	   Robot robot = new Robot();

	   robot.mouseMove(120,560);

	   actions.click().build().perform();

	   robot.mouseMove(300,170);

	   actions.click().build().perform();
	      
	      
	      
	      /*WebElement Boxarea = obj.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a"));
	      List<WebElement> l1 = Boxarea.findElements(By.tagName("a"));
	      System.out.println("The Number Of Anchor Text" + l1.size());
	      for (int i=0; i<l1.size(); i++)
	      {
	         Random r=new Random();
	         l1.get(r.nextInt(5)).click();
	         String ptitle=obj.getTitle();
	         System.out.println("The Page Title is :" + ptitle);
	         Thread.sleep(5000);
	         obj.get("https://www.lambdatest.com");
	         Thread.sleep(5000);
	         Boxarea = obj.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a"));
	         l1 = Boxarea.findElements(By.tagName("a"));*/   
	      }
	   }
	