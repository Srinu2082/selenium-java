package Datadriven;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Readexcel {

	WebDriver driver;
	 FileInputStream fso;
	 XSSFWorkbook wbo;
	 XSSFSheet wso;
	 FileOutputStream fo;
	
	 @BeforeTest
	 public void open() throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver",
				"C:\\driver\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(3000);
		 
	 }
	 @Test
	 public void operations() throws IOException, InterruptedException
	 {
		 fso = new FileInputStream("C:\\Users\\Himanth\\eclipse-workspace\\Seleniumpractise\\Excel\\Testdata.xlsx");
		 wbo = new XSSFWorkbook(fso);
		 wso = wbo.getSheet("Sheet1");
		 Row r;
		 int rno = wso.getLastRowNum();
		 for (int i = 1; i<=rno; i++)
		 {
			 r = wso.getRow(i);
			 WebElement user = driver.findElement(By.name("username"));
			 user.clear();
			 Thread.sleep(1000);
			 driver.findElement(By.name("username")).sendKeys(r.getCell(0).getStringCellValue());
			 Thread.sleep(1000);
			 driver.findElement(By.name("password")).clear();
			 driver.findElement(By.name("password")).sendKeys(r.getCell(1).getStringCellValue());
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//button[text()=' Login ']")).click();
			 Thread.sleep(1000);
			 driver.manage().window().maximize();
			 String actual= driver.getCurrentUrl();
			 r.createCell(3).setCellValue(actual);
			 String expected = r.getCell(2).getStringCellValue();
			 if(expected.equals(actual))
			 {
				 r.createCell(4).setCellValue("pass");
			 }
			 else
			 {
				 r.createCell(4).setCellValue("fail");
			 }
	       driver.navigate().back();
	       Thread.sleep(1000);
			
		   }
			 
			 
			 
	         
			 fo =  new FileOutputStream ("C:\\Users\\Himanth\\eclipse-workspace\\Seleniumpractise\\Excel\\Testdata.xlsx");
			 wbo.write(fo);
		 }

}
