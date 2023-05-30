package Checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statusofcheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
	     List<WebElement>checkboxes= driver.findElements(By.xpath("//input[@type='checkbox']"));
	     System.out.println("no of total radios"+""+checkboxes.size());
	     for(int i= 0;i<checkboxes.size();i++)
	       {
	    	 String rname = checkboxes.get(i).getAttribute("value");
	    	 if(checkboxes.get(i).isSelected())
	    	 {
	    		 System.out.println(rname+""+ "Active");
	    	 }
	    	 else {
	    		 System.out.println(rname+""+ "unActive");
	    	 }
	       }

	}

}
