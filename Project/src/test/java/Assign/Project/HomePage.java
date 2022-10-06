package Assign.Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import reources.Base;

public class HomePage extends Base {

	@Test
	public void basePageNavigation() throws Exception {
		driver = initialDriver();
		driver.get(prop.getProperty("url"));
		LandingPage l1 = new LandingPage(driver);
		l1.joinBtnClick().click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentid = it.next();// get parent window id
		String childid = it.next();// get child window id
		driver.switchTo().window(childid);
		UserRegistration u = new UserRegistration(driver);
		u.registerBtnClick().click();
		driver.findElement(By.id("displayPreferencesCountryformControl")).click();
		List<WebElement> countryDropdown = driver.findElements(By.xpath(
				"//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root custom-select-single-menuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']//div[@class='col-10']"));
		// System.out.println(countryDropdown.size());
		int size = countryDropdown.size();
		//writeData(countryDropdown,size);
		readdata();
	}

	public void writeData(List<WebElement> countryDropdown, int size) throws IOException {
		String Path = "C:\\Users\\Dinesh.P\\Downloads\\MissingCountry.xlsx";
		FileInputStream fis = new FileInputStream(Path);
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		XSSFSheet sheet = xsf.getSheetAt(0);
		for (int i = 0; i < size; i++) {
			Row row = sheet.getRow(i);
			Cell cell = row.createCell(1);
			cell.setCellValue(countryDropdown.get(i).getText());

		}

		FileOutputStream fos = new FileOutputStream(Path);

		xsf.write(fos);

		fos.close();
	}

	public void readdata() throws IOException {
		String Path = "C:\\Users\\Dinesh.P\\Downloads\\MissingCountry.xlsx";
		FileInputStream fis = new FileInputStream(Path);
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		XSSFSheet sheet = xsf.getSheetAt(0);
		int num = sheet.getLastRowNum();
		System.out.println(num);
		List countryset = new ArrayList();
		List countryset1 = new ArrayList();
		for (int i = 0; i <=num; i++) {
			String value = sheet.getRow(i).getCell(0).getStringCellValue();
			countryset.add(value);
			//String value1=sheet.getRow(i).getCell(1).getStringCellValue();
			try
			{
			countryset1.add(sheet.getRow(i).getCell(1).getStringCellValue());
			}
			catch(Exception e)
			{
				String d=null;
				countryset1.add(d);
			}
			 
		
		}
		countryset.removeAll(countryset1);
		System.out.println(countryset);
	}
}
