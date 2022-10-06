package latestJavaFeatures;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v102.fetch.Fetch;

public class NetworkingMocking 
{
	public static void main(String args[]) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinesh.P\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		DevTools devtool=driver.getDevTools();
		devtool.createSession();
		
		devtool.send(Fetch.enable(Optional.empty(), Optional.empty()));
		devtool.addListener(Fetch.requestPaused(), request ->
		{
			if(request.getRequest().getUrl().contains("shetty"))
			{
				String newUrl=request.getRequest().getUrl().replace("=shetty","=BadGuy");
				System.out.println(newUrl);
				devtool.send(Fetch.continueRequest(request.getRequestId(), Optional.of(newUrl), Optional.of(request.getRequest().getMethod()),
						Optional.empty(), Optional.empty(),Optional.empty()));
			}
			else
			{
				devtool.send(Fetch.continueRequest(request.getRequestId(), Optional.of(request.getRequest().getUrl()), Optional.of(request.getRequest().getMethod()),
						Optional.empty(), Optional.empty(),Optional.empty()));
			}
		});
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.className("btn-primary")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
	}
		
}
