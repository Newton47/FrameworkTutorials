package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public WebDriver driver;
	public Properties props;
	public WebDriver initializeDriver() throws IOException
	{
		props = new Properties();
		File src = new File("C:\\Users\\Newton\\Project\\src\\main\\java\\Resources\\data.properties");
		FileInputStream fis = new FileInputStream(src);
		
		props.load(fis);
		String browserName = props.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{ 
			
		}
		else if(browserName.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;	
	}

}
