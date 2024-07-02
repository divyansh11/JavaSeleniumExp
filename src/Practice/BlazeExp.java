package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeExp {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://www.demoblaze.com");
		
		driver.findElement(By.cssSelector("#login2")).click();
		
		driver.findElement(By.cssSelector("#loginusername")).sendKeys("divyansh");
		driver.findElement(By.cssSelector("#loginpassword")).sendKeys("123");
		driver.findElement(By.xpath("//*[@onclick='logIn()']")).click();
		Thread.sleep(2000);
		WebElement phonevisible=driver.findElement(By.xpath("//a[contains(text(),'Phones')]"));
		scrollFunct(phonevisible);
		List<WebElement> phonelist=driver.findElements(By.xpath("//*[@class='card-title']/a"));
		Thread.sleep(2000);
		for(WebElement i:phonelist) {
			if(i.getText().equalsIgnoreCase("Samsung galaxy s7")) {
				scrollFunct(i);
				i.click();
			}
		}
		
//		WebElement scrollphone=driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s7')]"));
		

	}
	public static void scrollFunct(WebElement elscroll) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", elscroll);
	}
	
}
