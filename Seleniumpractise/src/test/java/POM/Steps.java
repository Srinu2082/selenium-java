package POM;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Steps {
	
	@Test
	public void operation() throws InterruptedException, IOException
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 Thread.sleep(1000);
		 driver.manage().window().maximize();
		 Hrmlogin s = new Hrmlogin(driver);
		 FileInputStream fso =  new FileInputStream("C:\\Users\\Himanth\\eclipse-workspace\\Seleniumpractise\\Excel\\Testdata.xlsx");
		 XSSFWorkbook wbo  =  new XSSFWorkbook(fso);
		 XSSFSheet wso = wbo.getSheet("Sheet1");
		 Row r ;
		
		 r = wso.getRow(1);
		 s.login(r.getCell(0).getStringCellValue(), r.getCell(1).getStringCellValue());
		 Thread.sleep(1000);
		 Hrmlogout p = new Hrmlogout(driver);
		 p.logout();

}
}