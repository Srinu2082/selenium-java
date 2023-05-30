package Datepicker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class Calender {

	WebDriver driver;	
	@BeforeTest
	public void open() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\driver\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	}
	
	@Test
	public void counttables() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('datepicker1').value = '09/12/2017'");
		Thread.sleep(1000);
		
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}


}
