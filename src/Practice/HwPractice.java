package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		// To get teh title
		String title=driver.getTitle();
		System.out.println(title);
		
		
		// Xpath pracice
//		driver.findElement(By.xpath("//*[@class='ico-register']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		
		
		System.out.println(listof);
//		driver.quit();
	}

}
