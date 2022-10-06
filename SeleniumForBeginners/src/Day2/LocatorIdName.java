package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorIdName {

	public static void main(String[] args)
	{
				//act as mediator between code and browser.
				System.setProperty("webdriver.chrome.driver", "/D:/chromedriver.exe");
				
				//provide the method to automate code.
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://afourtech.com/contact-us-2/");
				driver.findElement(By.name("FirstName")).sendKeys("Dinesh");		
				driver.findElement(By.name("EmailAddress")).sendKeys("Dinesh");
				driver.findElement(By.className("wpcf7-validates-as-tel")).sendKeys("9098787878");
				
				driver.findElement(By.className("icon_right")).click();
				

	}

}
