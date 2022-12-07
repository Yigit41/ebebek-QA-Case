package patikadev;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends MainPage {
	
	
	SearchBox searchBox;

	By cartCountLocator = By.xpath("//div/div/cx-page-layout/cx-page-slot/eb-mini-cart/a/button/span");
	By cartButtonLocator = By.id("iconMiniCart");
	
	public HomePage(WebDriver driver) {
		super(driver);
		searchBox = new SearchBox(driver);
	}


	public SearchBox searchBox() {
		
		return this.searchBox;
	}


	public void goToCart() {
		
		click(cartButtonLocator);
	}
	
	public boolean isCounterUp() 
	{
		return getCartCount()>0;
	}

	private int getCartCount() 
	{
		String count = find(cartCountLocator).getText();
		return Integer.parseInt(count);
	}




}
