package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task2 {
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
	public void testMonth()
	{
	
		Select dropdown = new Select(driver.findElement(By.id("month")));
		
		List<WebElement> option =  dropdown.getOptions();
		boolean flag =  false;
		
		for(int i=0;i<option.size()-1;i++)
		{
			for(int j=1;j<option.size();j++)
			{
				if(option.get(i).getText()==(option.get(j).getText()))
				{
					System.out.println("Duplicate values for month dropdown  found");
					flag = true;
					break;
					
				}
				
			}
			
		}
		if(flag == false)
		{
			System.out.println("Duplicate valaues for month dropdown not found");
		}


	}
	
	@Test
	
	public void testDay()
	{

		Select dropdown = new Select(driver.findElement(By.id("day")));
		
		List<WebElement> option =  dropdown.getOptions();
		boolean flag =  false;
		
		for(int i=0;i<option.size()-1;i++)
		{
			for(int j=1;j<option.size();j++)
			{
				if(option.get(i).getText()==(option.get(j).getText()))
				{
					System.out.println("Duplicate values for day dropdown  found");
					flag = true;
					break;
					
				}
				
			}
			
		}
		if(flag == false)
		{
			System.out.println("Duplicate valaues for day dropdown not found");
		}

	}
	
	@Test
	
	public void testYear()
	{
Select dropdown = new Select(driver.findElement(By.id("year")));
		
		List<WebElement> option =  dropdown.getOptions();
		boolean flag =  false;
		
		for(int i=0;i<option.size()-1;i++)
		{
			for(int j=1;j<option.size();j++)
			{
				if(option.get(i).getText()==(option.get(j).getText()))
				{
					System.out.println("Duplicate values for year dropdown  found");
					flag = true;
					break;
					
				}
				
			}
			
		}
		if(flag == false)
		{
			System.out.println("Duplicate valaues for year dropdowon not found");
		}
	}
}
	
	
	


