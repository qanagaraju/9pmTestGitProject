package AppElements;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Product_Search_Elements {
	
	
	
	@FindBy(id = "twotabsearchtextbox") private WebElement search;
	public void insert_productDetails(String InsertProducts) {
		if(search.isEnabled()) {
			search.sendKeys(InsertProducts);
		}
	}
	
	
	@FindBy(id="nav-search-submit-button") private WebElement searchButton;
	public void user_click_searchButton() {
		
		if(searchButton.isEnabled()) {
			searchButton.click();
		}
		
	}
	
	@FindBy(css = "span[class='a-color-state a-text-bold']") private WebElement productName;
	public void user_verify_productName() {
		
		String actProduct = productName.getText();
		String actpro = actProduct.replace("\"", "");
		
		String expsearch = search.getAttribute("value");
		try {
			
			Assert.assertEquals(actpro, expsearch);
			
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
				
		
	}
	
	
	

}
