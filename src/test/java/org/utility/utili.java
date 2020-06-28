package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class utili{

		public static WebDriver driver;
		public static void browserLaunch() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabhu\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
		
			
		}
		public static void fill(WebElement e,String s) {
			e.sendKeys(s);
		}
		public static void enter(WebElement e) {
			e.click();
		}
		public static void mouseOve(WebElement e) {
			Actions a=new Actions(driver);
			a.moveToElement(e);
		}
		public static void impliwait() {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	/*	public static void credentials() throws IOException {
			File f=new File("C:\\Users\\prabhu\\eclipse-workspace\\MobileTesting\\Amazon\\hemausernamedata.xlsx");
			FileInputStream stream=new FileInputStream(f);
			Workbook w=new XSSFWorkbook(stream);
			Sheet s = w.getSheet("Sheet1");
			for (int i = 1; i <s.getPhysicalNumberOfRows(); i++) {
				Row r = s.getRow(i);
				for (int j = 0; j <=1; j++) {
					Cell c = r.getCell(j);
					DataFormatter format=new DataFormatter();
					format.formatCellValue(c);
					
				}*/
	
}
