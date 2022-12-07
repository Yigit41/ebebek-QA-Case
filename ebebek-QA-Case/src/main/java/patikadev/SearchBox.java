package patikadev;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchBox extends MainPage{
	
	By searchBoxLocator = By.id("txtSearchBox");
	By searchButtonLocator = By.xpath("//div/img[1]");
	public SearchBox(WebDriver driver) {
		super(driver);
		
	}

	public void search(String text) {
		
		type(searchBoxLocator,text);
		enter(searchBoxLocator,Keys.ENTER);
		
	}


	
	
	

}
