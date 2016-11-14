package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork2 {
	
private WebDriver driver = null;
	
	@BeforeClass
	public void beforeClass()
	{
		 System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/");
		
	}
	
	@AfterClass
	public void afterClass() 
	{
		
		driver.close();
   }
	
	@Test
	
	public void invalidRegistration() 
	{
		
		driver.findElement(By.id("u_0_1")).sendKeys("vamsi");
		driver.findElement(By.id("u_0_3")).sendKeys("Tumati");
		driver.findElement(By.id("u_0_5")).sendKeys("+157169953795728293974");
		driver.findElement(By.id("u_0_8")).sendKeys("+157169953795728293974");
		driver.findElement(By.id("u_0_a")).sendKeys("123456");
		driver.findElement(By.id("day")).sendKeys("30");
		driver.findElement(By.id("month")).sendKeys("jan");
		driver.findElement(By.id("year")).sendKeys("1992");
		driver.findElement(By.id("u_0_i")).click();
		driver.findElement(By.id("u_0_e")).click();
	}
		
		@Test
		
		public void testingString()
		{
			String actualtext = driver.findElement(By.xpath(".//*[starts-with(@id,'js_')][contains(@class,'_5633 _5634 _53ij')]")).getText();
			String expectedtext = "Please enter a valid mobile number or email address.";
			Assert.assertEquals(actualtext, expectedtext);
		}
		
		
		
		

    
	
}
