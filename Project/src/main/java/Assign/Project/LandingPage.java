package Assign.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage
{
public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By join=By.id("btnJoinCommunity");
	
	public WebElement joinBtnClick()
	{
		return driver.findElement(join);
	}
}
