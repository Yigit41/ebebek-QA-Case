package patikadev;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends MainPage{

	By loginButton = By.id("btnSubmitLogin");
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	public boolean isOnLoginPage() 
	{
		
		
		wait.until(ExpectedConditions
				.presenceOfElementLocated(loginButton));
		
		return isDisplayed(loginButton);
	}

}
