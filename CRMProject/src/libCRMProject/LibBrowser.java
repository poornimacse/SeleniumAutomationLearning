package libCRMProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LibBrowser {
	static WebDriver driver;
	public static WebDriver startBrowser(String browsername, String url) {
		
		if(browsername.equalsIgnoreCase("firefox")){
		driver = new FirefoxDriver();				
		}
		
	  	if(browsername.equalsIgnoreCase("chrome")){
		   driver = new ChromeDriver();
		   }
		
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			driver.get(url);
			return driver;
			}
		}


