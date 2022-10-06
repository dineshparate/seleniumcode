package qaClickacademy.ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo 
{
	ExtentReports extent;
	
	@BeforeTest
	public void config()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter ex=new ExtentSparkReporter(path);
		ex.config().setReportName("Web Automation Report");
		ex.config().setDocumentTitle("Title Name");
		
		
		extent=new ExtentReports();
		extent.attachReporter(ex);
		extent.setSystemInfo("Tester","Dinesh Parate");
		
	}
	
	
	
	@Test
	public void initialTest()
	{
		extent.createTest("initial Test");
		//act as mediator between code and browser.
				System.setProperty("webdriver.chrome.driver", "/D:/chromedriver.exe");
				
				//provide the method to automate code.
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://afourtech.com/");
				System.out.println(driver.getTitle());
				driver.close();
				extent.flush();
		
	}
}
