package techm.techm1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
	
	public static WebDriver driver;
	

	@BeforeMethod
	public void launchDriver()  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aarav\\Desktop\\doc\\chromedriver_win32\\chromedriver.exe");
		driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	
	@Test
	public void Test1() {
		driver.navigate().to("https://www.google.com/");
		System.out.println("Test 1 title is "+driver.getTitle());
	}
	
	@Test
	public void Test2() {
		driver.navigate().to("https://www.rediff.com/");
		System.out.println("Test 2 title is "+driver.getTitle());
	}
	
	@Test
	public void Test3() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 3 title is "+driver.getTitle());
		Assert.assertEquals("Expected title", driver.getTitle());
	}
	

}
