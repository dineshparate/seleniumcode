package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepositories.RediffHomePage;
import objectRepositories.RediffLoginPage;

public class LoginPageApplication 
{
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "/D:/chromedriver.exe");
		
		//provide the method to automate code.
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage r=new RediffLoginPage(driver);
		r.emailId().sendKeys("hello");
		r.password().sendKeys("hello");
		r.click1().click();
		r.home().click();
		RediffHomePage home=new RediffHomePage(driver);
		home.search1().sendKeys("Dinesh");
		home.click1().click();
				
	}
}
