package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task3 {
	
	private WebDriver driver = null;
			
			@BeforeClass
			public void beforeClass()
			{
		    
				 System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
					driver = new ChromeDriver();
					driver.navigate().to("https://www.facebook.com/");
		
			}
	       
			@AfterClass
			public void afterClass()
			{
				driver.close();
			}
			
			@Test
			
			public void radioButtonsFemale()
			{
				driver.findElement(By.id("u_0_h")).click();
		        boolean isSelected = driver.findElement(By.id("u_0_h")).isSelected();
		        if(isSelected == false) {
		            System.out.println("Button is not selected");
		        } else {
		            Assert.fail("Button should not be selected by default");
		        }
				
			}
			@Test
			public void radioButtonsMale()
			{
				driver.findElement(By.id("u_0_i")).click();
		        boolean isSelected = driver.findElement(By.id("u_0_i")).isSelected();
		        if(isSelected == false) {
		            System.out.println("Button is not selected");
		        } else {
		            Assert.fail("Button should not be selected by default");
		        }
				
			}
			

}
