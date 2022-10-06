package Day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorAndXPath 
{
	//thirdway css selector with tagname#id
	public static void main(String[] args) 
	{
		//act as mediator between code and browser.
		System.setProperty("webdriver.chrome.driver", "/D:/chromedriver.exe");
		
		//provide the method to automate code.
		WebDriver driver=new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password?wizard_id=VKIJaUleM_TUVS7ufEar8_PwLbS6pYacDDDvthOCkGxd5tQNx2w6sYnGpJHZeeGyjL1GvOTWQFI6AZKbMixZhw");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Dinesh");
		driver.findElement(By.cssSelector("input[name='commit']")).click();
		System.out.println(driver.findElement(By.cssSelector("div.bodySmall")).getText());
		driver.findElement(By.linkText("Sign Up")).click();
		
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("dineshparate25@gmail.com");
		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("dineshparate25@gmail.com");
		driver.findElement(By.xpath("//input[@id='user_email']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dinesh");
		driver.findElement(By.cssSelector("input[value='Sign up']")).click();
		System.out.println(driver.findElement(By.cssSelector(".bodySmall")).getText());
		driver.findElement(By.linkText("Login")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Dinesh");
		driver.findElement(By.id("password")).sendKeys("Dinesh");
		driver.findElement(By.xpath("//label[@class='v-middle form-footer obsidian bodySmall']")).clear();
		driver.findElement(By.cssSelector("input[name='commit']")).click();
		//label[@class='v-middle form-footer obsidian bodySmall']
		
		//main//div/div[1]cssSelector
		
		
		
		
		/*driver.get("https://afourtech.com/contact-us-2/");

		//use css selector with tag name and attribute:value
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("Dinesh");
		
		driver.findElement(By.className("icon_right")).click();
		
		//use css selector with tagname:className
		System.out.println(driver.findElement(By.cssSelector("div.wpcf7-response-output")).getText());*/
		
		
		
	}

}
