package Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/D:/chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		driver.findElement(By.id("autosuggest")).sendKeys("aus");
		Thread.sleep(2000);
		List<WebElement> options= driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));
		//li[class='ui-menu-item'] a
		
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("austria"))
			{
				option.click();
				break;
			}
		}
		

	}

}
