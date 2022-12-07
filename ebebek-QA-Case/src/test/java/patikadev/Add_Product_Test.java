package patikadev;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


public class Add_Product_Test extends MainTest {

	
	HomePage homePage;
	ProductsPage productsPage;
	ProductsDetailPage productDetailPage;
	CartPage cartPage;
	LoginPage loginPage;
	
	@Test
	@Order(1)
	public void search_product()
	{	
		homePage = new HomePage(driver);
		productsPage = new ProductsPage(driver);
		
		homePage.searchBox().search("kaşık maması");
		Assertions.assertTrue(productsPage.isOnProductPage(),"Not on products page");
	}
	
	@Test
	@Order(2)
	public void select_product()
	{
		productDetailPage = new ProductsDetailPage(driver);
		productsPage.selectProduct();
		Assertions.assertTrue(productDetailPage.isOnProductDetailPage(), "Not on product detail page");
		
	}
	
	@Test
	@Order(3)
	public void add_product()
	{
		productDetailPage.addToCart();
		Assertions.assertTrue(homePage.isCounterUp(),"The number of items in the cart did not increase");
	}
	
	@Test
	@Order(4)
	public void go_to_cart()
	{
		cartPage = new CartPage(driver);
		homePage.goToCart();
		Assertions.assertTrue(cartPage.isAddToCart(),"Product not added to cart");
	}
	
	@Test
	@Order(5)
	public void complete_shopping()
	{
		cartPage.complete_Shopping();
		Assertions.assertTrue(true,"Login page not loaded");
	}
	
	
}
