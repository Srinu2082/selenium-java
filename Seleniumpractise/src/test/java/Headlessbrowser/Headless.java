package Headlessbrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headless {
	public static void main(String[] args) {
		  WebDriver driver = new HtmlUnitDriver();
		        driver.get("http://www.google.com");
		        WebElement element = driver.findElement(By.name("q"));  

		        element.sendKeys("Edureka",Keys.ENTER);
		        //element.submit();   

		        System.out.println("Page title is: " + driver.getTitle());  

		        driver.quit();


}
}
