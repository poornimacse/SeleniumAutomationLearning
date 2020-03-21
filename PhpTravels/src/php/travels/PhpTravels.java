package php.travels;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhpTravels {
	static WebDriver driver;

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.com/demo/");
	    String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		Set<String> allwindows = driver.getWindowHandles();	
     	ArrayList<String> tabs = new ArrayList<String>(allwindows);
    	driver.switchTo().window(tabs.get(1));
		driver.findElement(By.id("inputEmail")).sendKeys("user@phptravels.com");
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("demouser");
		
//		  WebDriverWait wait = new WebDriverWait(driver, 500); WebElement loginBtn =
//		  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.
//		  xpath("//input[@id='login']")))); loginBtn.click();
//		 

		
		
  try {
		Thread.sleep(8000);		
				}
  catch (InterruptedException e) {
			// TODO Auto-generated catch block			e.printStackTrace();		}	
	}
  
  driver.findElement(By.xpath("//input[@id='login']")).click();
}}
