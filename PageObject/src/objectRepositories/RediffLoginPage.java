package objectRepositories;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	WebDriver driver;

	public RediffLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By Email = By.xpath("//input[@id='login1']");
	By pass = By.name("passwd");
	By signin = By.name("proceed");
	By Home=	By.linkText("rediff.com");
	 
	public WebElement emailId() {
		return driver.findElement(Email);
	}

	public WebElement password() {
		return driver.findElement(pass);
	}

	public WebElement click1() {
		return driver.findElement(signin);
	}
	
	public WebElement home() {
		return driver.findElement(Home);
	}

}
