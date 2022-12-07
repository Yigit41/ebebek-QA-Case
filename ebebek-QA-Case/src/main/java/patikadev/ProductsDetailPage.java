package patikadev;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsDetailPage extends MainPage {
	
	By addButtonLocator = By.id("addToCartBtn");
	By showCartButton = By.id("btnShowCart");
	public ProductsDetailPage(WebDriver driver) {
		super(driver);
	
	}

	public boolean isOnProductDetailPage() {
	
		return isDisplayed(addButtonLocator);
	}

	public void addToCart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		click(addButtonLocator);
		wait.until(ExpectedConditions.presenceOfElementLocated(showCartButton));
		click(showCartButton);
	}


}
