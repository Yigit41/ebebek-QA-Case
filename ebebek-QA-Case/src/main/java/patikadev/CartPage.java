package patikadev;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends MainPage {

	By productListLocator = By.xpath("/html/body/app-root/cx-storefront/main/cx-page-layout/div/div/div[1]/cx-page-layout/cx-page-slot/eb-cart-details/div/div/eb-cart-item-list");
	By completeShoppingButton = By.id("btnGoToShippingAddress");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	public CartPage(WebDriver driver) {
		super(driver);
		
	}

	public boolean isAddToCart() {
	
		wait.until(ExpectedConditions
				.presenceOfElementLocated(productListLocator));
		
		return getProductsList().size()>0;
	}

	private List<WebElement> getProductsList()
	{
		return findAll(productListLocator);
	}
	
	public void complete_Shopping() {
		
		find(completeShoppingButton).click();
		
		
		
	}

}
