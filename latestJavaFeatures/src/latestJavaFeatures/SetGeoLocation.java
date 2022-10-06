package latestJavaFeatures;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class SetGeoLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh.P\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		DevTools devtool=driver.getDevTools();
		devtool.createSession();
		
		Map geolocation=new HashMap();
		geolocation.put("latitude", 40);
		geolocation.put("longitude", 3);
		//geolocation.put("accuracy",1);
		driver.executeCdpCommand("Emulation.setGeolocationOverride", geolocation);
		
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("netflix",Keys.ENTER);
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		
		
	}

}
