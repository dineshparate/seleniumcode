package Assign.Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserRegistration 
{
public WebDriver driver;
	
	public UserRegistration(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By register=By.cssSelector("a[class$='uma-user-registration-button cursor-pointer']");
	
	public WebElement registerBtnClick()
	{
		return driver.findElement(register);
	}
}
