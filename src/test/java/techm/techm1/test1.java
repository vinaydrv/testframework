package techm.techm1;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
	
	public static WebDriver driver;
	
	
	@BeforeMethod
	public void launchDriver() throws MalformedURLException {
		
		ChromeOptions cap = new ChromeOptions(); 
		cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,UnexpectedAlertBehaviour.IGNORE);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aarav\\Desktop\\doc\\chromedriver_win32\\chromedriver.exe");
		
		driver = new RemoteWebDriver(new URL("http://localhost:5566/wd/hub"), cap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	
	@Test
	public void Test1() {
		driver.navigate().to("https://www.google.com/");
		System.out.println("Test 1 title is "+driver.getTitle());
		driver.close();
	}
	
	@Test
	public void Test2() {
		driver.navigate().to("https://www.rediff.com/");
		System.out.println("Test 2 title is "+driver.getTitle());
		driver.close();
	}
	
	@Test
	public void Test3() {
		driver.navigate().to("https://www.google.com/");
		System.out.println("Test 3 title is "+driver.getTitle());
		driver.close();
	}
	

}
