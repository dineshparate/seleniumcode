package Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/D:/chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).click();
		boolean bool=driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected();
		if(bool)
		{
			System.out.println(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isDisplayed());
		}
		Thread.sleep(2000);
		List<WebElement> option=driver.findElements(By.cssSelector("input[type='checkbox']"));
		
		int count=option.size();
		System.out.println("Count ="+count);
	}

}
