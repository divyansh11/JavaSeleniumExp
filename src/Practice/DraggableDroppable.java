package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableDroppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		
		Actions act= new Actions(driver);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		
		WebElement drop= driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(drag, drop).perform();
		
		

		
		

	}

}
