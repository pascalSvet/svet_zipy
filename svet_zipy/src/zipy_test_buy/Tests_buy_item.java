package zipy_test_buy;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import zipy_elements.*;

public class Tests_buy_item extends Tests_buy_MAIN {
	
	
	//Test - buying sample product, found by search 
	@Test		
	public  void buy_from_search() throws Exception {
	System.out.println("Running test for finding and buying a sample product");
	
		//login  
		Tests_functions.logInVika(driver);		
				
		// perform search and open the product
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("desktop_search_fild")))
			.sendKeys(ElementsBuying.SearchItem, Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath(ElementsBuying.SearchItem_thumb)))).click();;
		
		// choose the color and the length		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsBuying.ProductFramed_color))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsBuying.ProductFramed_color_1))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsBuying.ProductFramed_length))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsBuying.ProductFramed_length_1))).click();
		
		//buy
		driver.findElement(By.xpath(ElementsBuying.Checkout_button)).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(ElementsBuying.FinalBuy_button)))).click();
		
		// if we managed to buy:
		wait.until(ExpectedConditions.urlToBe("https://www.zipy.co.il/payment/success"));
		Assert.assertTrue(driver.findElement(By.xpath(ElementsBuying.Thanks_box)).getText().contains(ElementsHeb.ThanksForBuying_heb));

	}
	
	
	//Test - buying sample product from our cart
	@Test		
	public  void buy_from_cart() throws Exception {
	System.out.println("Running test for buying a sample product from our cart");
	
		//login  
		Tests_functions.logInVika(driver);		
				
		// open the product page
		driver.get(ElementsBuying.SearchItem_link);

		// choose the color and the length		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsBuying.Product_variationsColor))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsBuying.Product_variationsColor_1))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsBuying.Product_variationsLength))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsBuying.Product_variationsLength_1))).click();
		
		//add to the cart
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsBuying.Product_addToCart))).click();

		//back to main page and open the cart			
		driver.get(ElementsLogin.Zipy_il);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ElementsBuying.Product_openCart))).click();
		WebElement cartFrame = driver.findElement(By.xpath(ElementsBuying.Product_cartFrame));
		wait.until(ExpectedConditions.visibilityOf(cartFrame));
				
		//buy
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsBuying.Product_cartPay))).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(ElementsBuying.FinalBuy_button)))).click();

		// if we managed to buy:
		wait.until(ExpectedConditions.urlToBe("https://www.zipy.co.il/payment/success"));
		Assert.assertTrue(driver.findElement(By.xpath(ElementsBuying.Thanks_box)).getText().contains(ElementsHeb.ThanksForBuying_heb));

	}

 
	//Test - buying random product, from lessThan5 tab 
	@Test		
	public  void buy_from_lessThan5() throws Exception {
	System.out.println("Running test for buying random product, from lessThan5 tab ");
	
		//login  
		Tests_functions.logInVika(driver);		
		
		//open the lessThan5 tab and pick the first product in deals 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ElementsBuying.lessThan5_Open))).click();;
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ElementsBuying.lessThan5_dealThumbnail1))).click();;
		wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe("https://www.zipy.co.il/fiveshekel/")));

		//choose the color if there is such an option
		if (!driver.findElements(By.xpath(ElementsBuying.ProductFramed_color)).isEmpty()){
			if (!driver.findElement(By.xpath(ElementsBuying.ProductFramed_color)).getText().contains("One Size") &&
					!driver.findElement(By.xpath(ElementsBuying.ProductFramed_color)).getText().contains("As Picture")) {
				driver.findElement(By.xpath(ElementsBuying.ProductFramed_color)).click();
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsBuying.ProductFramed_color_1))).click();
			}
		}
		
		//choose the size if there is such an option
		if (!driver.findElements(By.xpath(ElementsBuying.ProductFramed_length)).isEmpty()){
			if (!driver.findElement(By.xpath(ElementsBuying.ProductFramed_length)).getText().contains("One Size") &&
					!driver.findElement(By.xpath(ElementsBuying.ProductFramed_length)).getText().contains("As Picture")) {
				driver.findElement(By.xpath(ElementsBuying.ProductFramed_length)).click();
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsBuying.ProductFramed_length_1))).click();
			}
		}
		
		//buy
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ElementsBuying.Checkout_button))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ElementsBuying.FinalBuy_button))).click();
		
		// if we managed to buy:
		wait.until(ExpectedConditions.urlToBe("https://www.zipy.co.il/payment/success"));
		Assert.assertTrue(driver.findElement(By.xpath(ElementsBuying.Thanks_box)).getText().contains(ElementsHeb.ThanksForBuying_heb));

	}
				
		
	
}
