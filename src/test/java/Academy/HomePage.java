package Academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Resources.base;
import Resources.dataproviderClass;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePage extends base {
	

  @Test(dataProvider="SearchProvider",dataProviderClass=dataproviderClass.class)
  //
  public void basepageNavigation(String email,String password) throws IOException, InterruptedException 
  {
	  
	  driver = initializeDriver();
	  
	  driver.get(props.getProperty("url"));
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath(".//*[@id='homepage']/div[5]/div[2]/div/div/div/span/div/div[7]/div/div/div[2]")).click();
	  //WebDriverWait wait = new WebDriverWait(driver,7);
	  //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='homepage']/header/div[1]/div/nav/ul/li[4]/a/span")));
	  
	  LandingPage lp = new LandingPage(driver);
	  
	  lp.getlogIn().click();
	  Thread.sleep(5000);
	  LoginPage logp = new LoginPage(driver);
	  logp.getEmail().sendKeys(email);
	  logp.getPassword().sendKeys(password);
	  logp.getloginButton().submit();
	  
  }
  
  
 
}
 