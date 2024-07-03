package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://selenium.qabible.in/javascript-alert.php");
		
		driver.findElement(By.xpath("//*[@onclick='jsAlert()']")).click();
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		

	}

}
