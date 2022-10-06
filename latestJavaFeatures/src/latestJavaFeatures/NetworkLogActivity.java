package latestJavaFeatures;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v102.network.Network;
import org.openqa.selenium.devtools.v102.network.model.AuthChallengeResponse.Response;

public class NetworkLogActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh.P\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		DevTools devtool=driver.getDevTools();
		devtool.createSession();
		
		devtool.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		
		//Event is fired
		devtool.addListener(Network.responseReceived(), response ->
		{
			org.openqa.selenium.devtools.v102.network.model.Response res=response.getResponse();
			System.out.println(res.getUrl()+" "+res.getStatus());
			res.getStatus();
				
		});
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.className("btn-primary")).click();
	}

}
