package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hrmlogin {
	
	@FindBy(name="username")
	WebElement user;
	
	//creating POM for password
	
	@FindBy(name="password")
	WebElement password;
	
	
	//creating POM for login button
	
	@FindBy(xpath="//button[@type = 'submit']")
	WebElement ok;
	
	public  Hrmlogin(WebDriver driver) //page name
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login(String u,String p)
	{
		user.clear();
		user.sendKeys(u);
		password.clear();
		password.sendKeys(p);
		ok.click();

} 

	

}
