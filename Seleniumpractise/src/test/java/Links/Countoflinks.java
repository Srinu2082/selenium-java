package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class Countoflinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
						"C:\\driver\\chromedriver_win32\\chromedriver.exe");
				 WebDriver driver = new ChromeDriver();
				 driver.get("https://www.google.com/");
				 driver.manage().window().maximize();
				 List<WebElement>links= driver.findElements(By.tagName("a"));
			     System.out.println("no of total links"+""+links.size());
			     SoftAssert softAssert = new SoftAssert();
			     String actualtitle = driver.getTitle();			     
			     String expectedtitle = "Google";
			     softAssert.assertEquals(actualtitle, expectedtitle,"Titlefailed");
			    // Assert.assertEquals(actualtitle, expectedtitle,"Title failed" );
			     String actualurl = driver.getCurrentUrl();
			     String expectedurl = "https://www.google.com/";
			     softAssert.assertEquals(actualurl , expectedurl );
			     System.out.println("Bv");
			     softAssert.assertAll();
			     driver.close();

	}

}
