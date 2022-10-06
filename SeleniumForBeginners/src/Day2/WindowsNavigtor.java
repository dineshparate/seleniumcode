package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsNavigtor {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/D:/chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		driver.navigate().back();

	}

}
