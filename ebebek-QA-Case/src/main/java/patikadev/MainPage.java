package patikadev;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

	WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement find(By locator) {
		return driver.findElement(locator);

	}

	public List<WebElement> findAll(By locator) {
		return driver.findElements(locator);

	}

	public void click(By locator) {
		find(locator).click();
	}

	public void type(By locator, String text) {
		find(locator).sendKeys(text);
	}
	public void enter(By locator, Keys keys) {
		find(locator).sendKeys(keys);
	}

	public Boolean isDisplayed(By locator) {
		return find(locator).isDisplayed();
	}
}
