package Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.meetlalo.com/");
		
		TakesScreenshot screeshot = (TakesScreenshot) driver;
		
		File src = screeshot.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"//Screenshots//screenshot"+".png");
		
		FileUtils.moveFile(src, dest);
		
		

	}

}
