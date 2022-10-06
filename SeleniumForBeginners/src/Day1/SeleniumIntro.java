package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro 
{
	public static void main(String[] args) 
	{
		//act as mediator between code and browser.
		System.setProperty("webdriver.chrome.driver", "/D:/chromedriver.exe");
		
		//provide the method to automate code.
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://afourtech.com/");
	}
}
