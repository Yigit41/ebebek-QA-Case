package patikadev;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage extends MainPage{
	
	By categoryOptionLocator = By.id("btnCategoryFilter");
	By productNameLocator = By.xpath("//div/eb-product-list-item[1]/div/eb-generic-link/a");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public ProductsPage(WebDriver driver) {
		super(driver);
	
	}

	public boolean isOnProductPage() {
		wait.until(ExpectedConditions
				.presenceOfElementLocated(productNameLocator));
		return isDisplayed(categoryOptionLocator);
	
	}

	public void selectProduct() {
	
		wait.until(ExpectedConditions
				.presenceOfElementLocated(productNameLocator));
		String productLink =find(productNameLocator).getAttribute("href");
		driver.get(productLink);	
		
	}
	
	

}
