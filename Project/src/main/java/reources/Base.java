package reources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base
{
	public WebDriver driver;
	public Properties prop;

	public WebDriver initialDriver() throws IOException {
		prop = new Properties();
		// System.getProperty("user.dir")
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\data.properties");
		prop.load(fis);
		String bname = prop.getProperty("browser");
		
		if (bname.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Documents\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (bname.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh.P\\Downloads\\chromedriver_win32\\chromedriver.exe");
			// to run chrome in headless mode
			ChromeOptions options = new ChromeOptions();
			if (bname.contains("headless")) {
				options.addArguments("headless");
			}
			driver = new ChromeDriver(options);
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		return driver;
	}
}
