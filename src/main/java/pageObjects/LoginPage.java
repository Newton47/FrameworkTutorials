package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
@FindBy(xpath=".//*[@id='user_email']")
WebElement email;

@FindBy(xpath=".//*[@id='user_password']")
WebElement password;

@FindBy(xpath=".//*[@id='new_user']/div[3]/input")
WebElement loginButton;



public WebElement getEmail()
{
	return email;
}

public WebElement getPassword()
{
	return password;
}

public WebElement getloginButton()
{
	return loginButton;
	
}


}
