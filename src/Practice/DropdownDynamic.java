package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/jquery-select.php");
		driver.findElement(By.xpath("//*[contains(@class,'-selection--multiple')]")).sendKeys("new");
		
	List<WebElement> elemt=driver.findElements(By.xpath("//*[contains(@class,'-results__options')]/li"));
	
	System.out.println(elemt);
	
	for(WebElement i:elemt) {
		
		if(i.getText().equalsIgnoreCase("new jersey")) {
			
			i.click();
			break;
		}
	}
		
		

	}

}
