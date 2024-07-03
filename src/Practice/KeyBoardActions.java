package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
		Actions act = new Actions(driver);
		
		WebElement textBox= driver.findElement(By.id("single-input-field"));
		
		act.moveToElement(textBox).click().sendKeys("rahul").perform();
		
		textBox.clear();
		
		act.moveToElement(textBox).click().keyDown(Keys.SHIFT).sendKeys("divyansh").perform();
	}

}
