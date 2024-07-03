package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		Iterator<String> it = windowHandles.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.getTitle());

	}

}
