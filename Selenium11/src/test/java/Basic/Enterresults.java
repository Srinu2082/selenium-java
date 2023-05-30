package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enterresults {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	     WebElement	search = driver.findElement(By.name("q"));
	     search.sendKeys("Selenium",Keys.RETURN);
	    // search.submit();

}
}
