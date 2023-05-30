package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputdata {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	WebElement	username = driver.findElement(By.xpath("//input[@placeholder ='Username']"));
	username.sendKeys("Admin");
	WebElement	password = driver.findElement(By.xpath("//input[@placeholder ='Password']"));
	password.sendKeys("admin123");
	WebElement	login = driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();
	Thread.sleep(2000);
	driver.close();


	}

}
