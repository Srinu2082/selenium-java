package Datadriven;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Insertexcel {
	public static void main(String[] args) throws IOException {
	
		 FileInputStream fso =  new FileInputStream("C:\\Users\\Himanth\\eclipse-workspace\\Seleniumpractise\\Excel\\Book1.xlsx");
		 XSSFWorkbook wbo  =  new XSSFWorkbook(fso);
		 XSSFSheet wso = wbo.getSheet("Sheet1");
		 Row r ;
		
		 r = wso.getRow(0);
		String value = r.getCell(0).getStringCellValue();
		System.out.println(value);
		 
		 FileOutputStream fo = new FileOutputStream ("C:\\Users\\Himanth\\eclipse-workspace\\Seleniumpractise\\Excel\\Book1.xlsx");
		 wbo.write(fo);
}
}
