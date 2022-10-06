package Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class ValidateText 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "/D:/chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password?wizard_id=VKIJaUleM_TUVS7ufEar8_PwLbS6pYacDDDvthOCkGxd5tQNx2w6sYnGpJHZeeGyjL1GvOTWQFI6AZKbMixZhw");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("dineshparate61@gmail.com");
		driver.findElement(By.name("password")).sendKeys("G00gle@123");
		driver.findElement(By.cssSelector("input[name='commit']")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.findElement(By.cssSelector("div[class='m-l-3-xs']")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='m-l-3-xs']")).getText(), "Please confirm your email to fully activate your account. You can do this by clicking the link in the email confirmation we sent you.");
		//driver.findElement(By.linkText("Log Out")).click();
		driver.findElement(By.xpath("a[text()='Log Out']")).click();
		driver.close();
		//System.out.println(driver.findElement(By.cssSelector("div.bodySmall")).getText());
		//driver.findElement(By.linkText("Sign Up")).click();

	}

}
