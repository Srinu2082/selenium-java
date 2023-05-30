package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic {
	@BeforeSuite
	void wakeup()
	{
		System.out.println("wakeup only once");
	}
	@Test
	void dosa()
	{
		System.out.println("morning tiffin");
	}
	@Test(priority = 2)
	void chapathi()
	{
		System.out.println("evening dinner");
	}
	@Test(priority = 1,enabled = false)
	void rice()
	{
		System.out.println("afternoon lunch");
	}
	
	@AfterSuite
	void sleeping()
	{
		System.out.println("sleeping ngt");
	}
	

}
