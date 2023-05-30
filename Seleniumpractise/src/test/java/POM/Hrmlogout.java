package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hrmlogout {
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	WebElement drop;
	
	@FindBy(linkText="Logout")
	WebElement loginout;
	
	public  Hrmlogout(WebDriver driver) //page name
	{
		PageFactory.initElements(driver, this);
	}
	

	public void logout() throws InterruptedException
	{
		drop.click();
		Thread.sleep(1000);
		loginout.click();
		Thread.sleep(100);
	}


}
