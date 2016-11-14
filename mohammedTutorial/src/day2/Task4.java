package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task4 {
	
	private WebDriver driver = null;
	 
	@BeforeClass
	
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");

		
	}
	
	@AfterClass
	public void  afterClass()
	{
		driver.close();
	}
	
	
	@Test
	
	public void radiButton()
	{
		boolean isenabled = driver.findElement(By.id("u_0_h")).isEnabled();
		if(isenabled == true)
		{
		driver.findElement(By.id("u_0_i")).click();
		}
		else
		{
			System.out.println("you cant click both buttons at once");
		}
	}
	

}
