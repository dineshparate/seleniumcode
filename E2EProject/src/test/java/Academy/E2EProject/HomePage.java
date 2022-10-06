package Academy.E2EProject;

import java.io.IOException;

import org.testng.annotations.Test;

public class HomePage extends Base
{
	
	@Test
	public void Navigation() throws IOException
	{
		driver=intializerDriver();
		driver.get("http://qaclickacademy.com");
	}
	
}
