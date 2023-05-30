package Screenshotphotos;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Bugidentifation {
	WebDriver driver;	
	@BeforeTest
	public void open() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\driver\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		  //File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  //FileUtils.copyFile(screenshot, new File("C:\\Users\\Himanth\\Desktop\\Screenshot\\google.png"));
		
	}
	
	@Test
	public void photos() throws IOException
	{
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshot, new File("C:\\Users\\Himanth\\Desktop\\Screenshot\\google.png"));
		
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}


}
