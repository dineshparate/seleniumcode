package objectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage 
{
	WebDriver driver;

	public RediffHomePage(WebDriver driver)
	{
		this.driver=driver;
		
	}

	By search=By.id("srchword");
		By submit=By.xpath("//input[@aria-label='Search']");
	
	public WebElement search1()
	{
		return driver.findElement(search);
	}
	public  WebElement click1()
	{
		return driver.findElement(submit);
	}
	
}
