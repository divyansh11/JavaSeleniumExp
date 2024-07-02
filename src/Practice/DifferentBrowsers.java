package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DifferentBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=null;
		String browsername="edge";
		
		if(browsername.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		
		driver.get("https://www.slingacademy.com/article/git-push-error-failed-to-push-some-refs/");
		

	}

}
