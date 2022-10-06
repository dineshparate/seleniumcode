package Academy.E2EProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Base 
{
	public WebDriver driver=null;
	
	public WebDriver intializerDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\SeleniumCode\\E2EProject\\src\\main\\java\\data.properties");
		prop.load(fis);
		String bname=prop.getProperty("browser");
		System.out.println(bname);
		
		
		if(bname.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dinesh.P\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			 driver=new FirefoxDriver();
			//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		}
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		return driver;
	}
}
