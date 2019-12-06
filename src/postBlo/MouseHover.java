package postBlo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		// ChromeDriver c = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com");
		
		
		WebElement logo = driver.findElement(By.xpath("/html/body/div[2]/section[10]/div/div/form/div/button\r\n" + 
				""));
        //To get the width of the logo
 int logoWidth = logo.getSize().getWidth();
 System.out.println("Logo width : "+logoWidth+" pixels");
        //To get the height of the logo
 int logoHeight = logo.getSize().getHeight();        
 System.out.println("Logo height : "+logoHeight+" pixels");
		
		
		
		
		
		Actions act = new Actions(driver);

		act.moveByOffset(161, 42).contextClick().build().perform();

	}
}