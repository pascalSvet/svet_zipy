package zipy_test_cart;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import zipy_elements.*;

public class Tests_cart_removeProduct extends Tests_cart_main {
	
	
	//Test - removing product from the cart
	@Test		
	public  void Tests_cart_removeProduct_noVariations() throws Exception {
		System.out.println("Running test for removing product from the cart");		

		//get to the required product page and save its title
		driver.get(ElementsBuying.Product_noVariations);
		String ProductTitle = driver.findElement(By.xpath(ElementsBuying.Product_titleFromPicture)).getAttribute("alt");
		
		//add to the cart
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsBuying.Product_addToCart))).click();

		//back to main page and open the cart			
		driver.get(ElementsLogin.Zipy_il);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ElementsBuying.Product_openCart))).click();
		
		//empty the cart
		Tests_functions.emptyCart(driver);	
		WebElement cartFrame = driver.findElement(By.xpath(ElementsBuying.Product_cartFrame));
		wait.until(ExpectedConditions.visibilityOf(cartFrame));

		// if we managed to remove the product from the cart, it contains a message of empty cart
		Assert.assertTrue(driver.findElement(By.xpath(ElementsBuying.Product_cartIsEmpty)).isDisplayed());					
	}
	
	
	//Test - removing product from the cart to the favorites
	@Test		
	public  void Tests_cart_removeProduct_toFavorites() throws Exception {
		System.out.println("Running test for removing product from the cart to the favorites");		

		//get to the required product page and save its title
		driver.get(ElementsBuying.Product_noVariations);
		String ProductTitle = driver.findElement(By.xpath(ElementsBuying.Product_titleFromPicture)).getAttribute("alt");
		
		//add to the cart
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsBuying.Product_addToCart))).click();

		//back to main page and open the cart			
		driver.get(ElementsLogin.Zipy_il);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ElementsBuying.Product_openCart))).click();
		
		//remove the item and choose adding it to favorites
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ElementsBuying.Product_cartRemove))).click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ElementsBuying.Product_cart_moveToFavorites))).click();
		
		//check if the cart contains the removed item  
		boolean removedItem = driver.findElement(By.xpath(ElementsBuying.Product_cartIsEmpty)).isDisplayed();		
		
		//switch to the favorites window	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsBuying.Product_favoritesButton))).click();
		WebElement favoritesFrame = driver.findElement(By.xpath(ElementsBuying.Product_favoritesFrame));
		wait.until(ExpectedConditions.visibilityOf(favoritesFrame));
		
		// if we managed to remove the product, the cart won't contain its title, but the favorites will contain it:			
		Assert.assertTrue(favoritesFrame.getText().contains(ProductTitle) && removedItem);
		
		//at the end, remove the products from the favorites, for the future tests		
		Tests_functions.emptyFavorites(driver);		
	}
	
	
	//Test - removing product from the cart and then returning it back
	@Test		
	public  void Tests_cart_removeProduct_return() throws Exception {
		System.out.println("Running test for removing product from the cart and then returning it back");		
	
		//get to the required product page and save its title
		driver.get(ElementsBuying.Product_noVariations);
		String ProductTitle = driver.findElement(By.xpath(ElementsBuying.Product_titleFromPicture)).getAttribute("alt");
		
		//add to the cart
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsBuying.Product_addToCart))).click();
	
		//back to main page and open the cart			
		driver.get(ElementsLogin.Zipy_il);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ElementsBuying.Product_openCart))).click();
		
		//remove the item and choose returning it to the cart
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ElementsBuying.Product_cartRemove))).click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ElementsBuying.Product_cart_returnToCart))).click();
		Thread.sleep(500);
		WebElement cartFrame = driver.findElement(By.xpath(ElementsBuying.Product_cartFrame));
		wait.until(ExpectedConditions.visibilityOf(cartFrame));

		// if we managed to return the product, its title is found in the cart:
		Assert.assertTrue(cartFrame.getText().contains(ProductTitle));
				
		//at the end, remove the products from the cart, for the future tests		
		Tests_functions.emptyCart(driver);		
	}
	
	
	//Test - adding same product twice with different variations, and then removing one of them from the cart
	@Test		
	public  void Tests_cart_removeProduct_partOfVariations() throws Exception {
		System.out.println("Running test for removing one of the variations of the same product which is in the cart");		

		//get to the required product page and save its title
		driver.get(ElementsBuying.Product_oneVariation);
		String ProductTitle = driver.findElement(By.xpath(ElementsBuying.Product_titleFromPicture)).getAttribute("alt");		

		//choose the product variation - first option from the droplist - and save its name
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsBuying.Product_variationsColor))).click();		
		Thread.sleep(1000);
		WebElement variationColor_1 = driver.findElement(By.xpath(ElementsBuying.Product_variationsColor_1));
		String ProductVariation1 = variationColor_1.getText().trim();;
		variationColor_1.click();						
		
		//add to the cart
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsBuying.Product_addToCart))).click();

		//choose another product variation - second option from the droplist - and save its name
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsBuying.Product_variationsColorAgain))).click();
		Thread.sleep(1000);
		WebElement variationColor_2 = driver.findElement(By.xpath(ElementsBuying.Product_variationsColor_2));
		String ProductVariation2 = variationColor_2.getText().trim();;
		variationColor_2.click();
		
		//add to the cart again
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsBuying.Product_addToCart))).click();

		//back to main page and open the cart			
		driver.get(ElementsLogin.Zipy_il);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ElementsBuying.Product_openCart))).click();
		
		//remove the first item from the cart
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ElementsBuying.Product_cartRemove))).click();
			
		//reopen the cart			
		driver.get(ElementsLogin.Zipy_il);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ElementsBuying.Product_openCart))).click();
		WebElement cartFrame = driver.findElement(By.xpath(ElementsBuying.Product_cartFrame));
		wait.until(ExpectedConditions.visibilityOf(cartFrame));
		
		// if we removed the first variation only, then the cart includes the title of product and its second variation only 
		Assert.assertTrue((cartFrame.getText().contains(ProductTitle)) &&
				(cartFrame.getText().contains(ProductVariation2)) &&
				!(cartFrame.getText().contains(ProductVariation1)));
		
		//at the end, remove the product from the cart, for the future tests		
		Tests_functions.emptyCart(driver);		
	}
	
	
}
