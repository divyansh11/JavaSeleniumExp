package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		WebElement scrollelem=driver.findElement(By.cssSelector("#mousehover"));
		scroll(scrollelem);
		
		driver.switchTo().frame("courses-iframe");
		String emailText=driver.findElement(By.xpath("//*[@class='icon fa fa-envelope']/parent::*")).getText();
		System.out.println(emailText);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@value='radio1']")).click();
		driver.quit();
		
		
		
		

	}
	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor )driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
