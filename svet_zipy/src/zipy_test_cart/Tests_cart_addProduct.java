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

public class Tests_cart_addProduct extends Tests_cart_main {
	
	
	//Test - adding a product to the cart (product without variations)
	@Test		
	public  void Tests_cart_addProduct_noVariations() throws Exception {
		System.out.println("Running test for adding product to the cart (product without variations)");		

		//get to the required product page and save its title
		driver.get(Elements.Product_noVariations);
		String ProductTitle = driver.findElement(By.xpath(Elements.Product_titleFromPicture)).getAttribute("alt");
		
		//add to the cart
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Product_addToCart))).click();

		//back to main page and open the cart			
		driver.get(Elements.Zipy_il);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Elements.Product_openCart))).click();
		WebElement cartFrame = driver.findElement(By.xpath(Elements.Product_cartFrame));
		wait.until(ExpectedConditions.visibilityOf(cartFrame));
		
		// if we managed to add the product, its title is found in the cart:
		Assert.assertTrue(cartFrame.getText().contains(ProductTitle));
		
		//at the end, remove the product from the cart, for the future tests		
		Tests_functions.emptyCart(driver);
				
	}
	

	//Test - adding a product to the cart (product with one variation)
	@Test		
	public  void Tests_cart_addProduct_onevVariation() throws Exception {
		System.out.println("Running test for adding product to the cart (product with one variation)");		

		//get to the required product page and save its title
		driver.get(Elements.Product_oneVariation);
		String ProductTitle = driver.findElement(By.xpath(Elements.Product_titleFromPicture)).getAttribute("alt");		

		//choose the product variation - first option from the droplist - and save variation name
		driver.findElement(By.xpath(Elements.Product_variationsColor)).click();		
		WebElement elementColor_1 = driver.findElement(By.xpath(Elements.Product_variationsColor_1));
		String ProductElement1 = elementColor_1.getText();
		elementColor_1.click();
		
		//add to the cart
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Product_addToCart))).click();

		//back to main page and open the cart			
		driver.get(Elements.Zipy_il);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Elements.Product_openCart))).click();
		WebElement cartFrame = driver.findElement(By.xpath(Elements.Product_cartFrame));
		wait.until(ExpectedConditions.visibilityOf(cartFrame));
		
		// if we managed to add the product correctly, its title and its chosen variation are found in the cart:
		Assert.assertTrue((cartFrame.getText().contains(ProductTitle))&&
						(cartFrame.getText().contains(ProductElement1)));
			
		//at the end, remove the products from the cart, for the future tests		
		Tests_functions.emptyCart(driver);

		
	}
		

	//Test - adding a product to the cart (product with more than one variation)
	@Test		
	public  void Tests_cart_addProduct_twoVariations() throws Exception {
		System.out.println("Running test for adding product to the cart (product with two variations)");		

		//get to the required product page and save its title
		driver.get(Elements.Product_twoVariations);
		String ProductTitle = driver.findElement(By.xpath(Elements.Product_titleFromPicture)).getAttribute("alt");				

		//choose the first variation - first option from the first droplist - and save its name
		driver.findElement(By.xpath(Elements.Product_variationsColor)).click();		
		WebElement variationColor_1 = driver.findElement(By.xpath(Elements.Product_variationsColor_1));
		String ProductVariation1 = variationColor_1.getText();
		variationColor_1.click();
		
		//choose the second variation - first option from the second droplist - and save its name
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Elements.Product_variationsLength))).click();		
		WebElement variationLength_1 = driver.findElement(By.xpath(Elements.Product_variationsLength_1));
		String ProductVariation2 = variationLength_1.getText();
		variationLength_1.click();
		
		//add to the cart
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Product_addToCart))).click();

		//back to main page and open the cart			
		driver.get(Elements.Zipy_il);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Elements.Product_openCart))).click();
		WebElement cartFrame = driver.findElement(By.xpath(Elements.Product_cartFrame));
		wait.until(ExpectedConditions.visibilityOf(cartFrame));
		
		// if we managed to add the product correctly, its title and its chosen variations are found in the cart:
		Assert.assertTrue((cartFrame.getText().contains(ProductTitle))&&
						(cartFrame.getText().contains(ProductVariation1))&&
						(cartFrame.getText().contains(ProductVariation2)));
		
		//at the end, remove the products from the cart, for the future tests		
		Tests_functions.emptyCart(driver);

	}
	
	
	//Test - adding a same product twice to the cart ,each time with different variation (product with one variation)
	@Test		
	public  void Tests_cart_addProductTwice_oneVariation() throws Exception {
			System.out.println("Running test for adding product to the cart twice (product with one variation)");		
			
			//get to the required product page and save its title
			driver.get(Elements.Product_oneVariation);
			String ProductTitle = driver.findElement(By.xpath(Elements.Product_titleFromPicture)).getAttribute("alt");		

			//choose the product variation - first option from the droplist - and save elements name
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Product_variationsColor))).click();		
			Thread.sleep(1000);
			WebElement variationColor_1 = driver.findElement(By.xpath(Elements.Product_variationsColor_1));
			String ProductVariation1 = variationColor_1.getText().trim();;
			variationColor_1.click();						
			
			//add to the cart
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Product_addToCart))).click();

			//choose another product variation - second option from the droplist - and save its name
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Product_variationsColorAgain))).click();
			Thread.sleep(1000);
			WebElement variationColor_2 = driver.findElement(By.xpath(Elements.Product_variationsColor_2));
			String ProductVariation2 = variationColor_2.getText().trim();;
			variationColor_2.click();
			
			//add to the cart again
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Product_addToCart))).click();

			//back to main page and open the cart			
			driver.get(Elements.Zipy_il);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Elements.Product_openCart))).click();
			WebElement cartFrame = driver.findElement(By.xpath(Elements.Product_cartFrame));
			wait.until(ExpectedConditions.visibilityOf(cartFrame));
			
			// if we managed to add the product correctly, its title and its chosen variations are found in the cart:
			Assert.assertTrue((cartFrame.getText().contains(ProductTitle))&&
							(cartFrame.getText().contains(ProductVariation1))&&
							(cartFrame.getText().contains(ProductVariation2)));

			//at the end, remove the products from the cart, for the future tests		
			Tests_functions.emptyCart(driver);

		}	
	
		
	//Test - adding a same product twice to the cart ,each time with different variation (product with two variations,
	//																as the first variation is the same in both cases)
	@Test		
	public  void Tests_cart_addProductTwice_twoVariations() throws Exception {
		System.out.println("adding a same product twice to the cart (product with two variations, as the first variation is the same in both cases)");		

		//get to the required product page and save its title
		driver.get(Elements.Product_twoVariations);
		String ProductTitle = driver.findElement(By.xpath(Elements.Product_titleFromPicture)).getAttribute("alt");				

		//choose the first variation - first option from the first droplist - and save its name
		driver.findElement(By.xpath(Elements.Product_variationsColor)).click();		
		WebElement variationColor_1 = driver.findElement(By.xpath(Elements.Product_variationsColor_1));
		String ProductVariation1 = variationColor_1.getText().trim();;
		variationColor_1.click();
		
		//choose the second variation - first option from the second droplist - and save its name
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Elements.Product_variationsLength))).click();		
		WebElement variationLength_1 = driver.findElement(By.xpath(Elements.Product_variationsLength_1));
		String ProductVariation2 = variationLength_1.getText().trim();;
		variationLength_1.click();
		
		//add to the cart
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Product_addToCart))).click();

		//choose the second variation again - second option from the second droplist - and save its name
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Elements.Product_variationsLengthAgain))).click();	
		Thread.sleep(1000);
		WebElement variationLength_2 = driver.findElement(By.xpath(Elements.Product_variationsLength_2));
		String ProductVariation3 = variationLength_2.getText().trim();
		variationLength_2.click();

		//add to the cart again
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Product_addToCart))).click();

		//back to main page and open the cart			
		driver.get(Elements.Zipy_il);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Elements.Product_openCart))).click();
		WebElement cartFrame = driver.findElement(By.xpath(Elements.Product_cartFrame));
		wait.until(ExpectedConditions.visibilityOf(cartFrame));
		
		// if we managed to add the product correctly, its title and its chosen variations are found in the cart:
		Assert.assertTrue((cartFrame.getText().contains(ProductTitle))&&
						(cartFrame.getText().contains(ProductVariation1))&&
						(cartFrame.getText().contains(ProductVariation2))&&
						(cartFrame.getText().contains(ProductVariation3)));
		
		//at the end, remove the products from the cart, for the future tests		
		Tests_functions.emptyCart(driver);	
		}		
		
	
	//Test - adding twice the same product to the cart, using plus-one button  
	@Test		
	public  void Tests_cart_addProduct_plusOne() throws Exception {
		System.out.println("Running test for adding twice the same product to the cart, using plus-one button ");		

		//get to the required product page and save its title
		driver.get(Elements.Product_noVariations);
		
		//add to the cart and then add another one to the cart with the plus-one button
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Product_addToCart))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Product_plusOne))).click();

		//back to main page and open the cart			
		driver.get(Elements.Zipy_il);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Elements.Product_openCart))).click();
		WebElement cartFrame = driver.findElement(By.xpath(Elements.Product_cartFrame));
		wait.until(ExpectedConditions.visibilityOf(cartFrame));
		
		// if we managed to add the product twice, its quantity in the cart is 2:
		Assert.assertTrue(driver.findElement(By.xpath(Elements.Product_quantity)).getAttribute("value").equals("2"));
		
		//at the end, remove the product from the cart, for the future tests		
		Tests_functions.emptyCart(driver);				
	}
		

	//Test - adding twice the same product to the cart, using quantity button 
	@Test		
	public  void Tests_cart_addProduct_quantityTwo() throws Exception {
		System.out.println("Running test for adding twice the same product to the cart, using quantity button");		

		//get to the required product page and save its title
		driver.get(Elements.Product_noVariations);
		
		//increase the quantity to 2 and then add to the cart 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Product_quantityPlus))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Product_addToCart))).click();

		//back to main page and open the cart			
		driver.get(Elements.Zipy_il);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Elements.Product_openCart))).click();
		WebElement cartFrame = driver.findElement(By.xpath(Elements.Product_cartFrame));
		wait.until(ExpectedConditions.visibilityOf(cartFrame));
		
		// if we managed to add the product twice, its quantity in the cart is 2:
		Assert.assertTrue(driver.findElement(By.xpath(Elements.Product_quantity)).getAttribute("value").equals("2"));
		
		//at the end, remove the product from the cart, for the future tests		
		Tests_functions.emptyCart(driver);				
	}
	
	
	//Test - adding twice the same product to the cart, using quantity and then plus-one button
	@Test		
	public  void Tests_cart_addProduct_quantityTwo_plusOne() throws Exception {
		System.out.println("Running test for adding twice the same product to the cart, using quantity and then plus-one button");		

		//get to the required product page and save its title
		driver.get(Elements.Product_noVariations);
		
		//increase the quantity to 2 and then add to the cart 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Product_addToCart))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Product_quantityPlusAgain))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Product_plusOne))).click();

		//back to main page and open the cart			
		driver.get(Elements.Zipy_il);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Elements.Product_openCart))).click();
		WebElement cartFrame = driver.findElement(By.xpath(Elements.Product_cartFrame));
		wait.until(ExpectedConditions.visibilityOf(cartFrame));
		
		// if we managed to add the product and then add it twice again, its quantity in the cart is 3:
		Assert.assertTrue(driver.findElement(By.xpath(Elements.Product_quantity)).getAttribute("value").equals("3"));
		
		//at the end, remove the product from the cart, for the future tests		
		Tests_functions.emptyCart(driver);				
	}
	
	
	//Test - adding twice the same product to the cart, by changing quantity manually in the cart
	@Test		
	public  void Tests_cart_addProduct_changeQuantity() throws Exception {
		System.out.println("Running test for adding twice the same product to the cart, by changing quantity manually in the cart");		

		//get to the required product page and save its title
		driver.get(Elements.Product_noVariations);
		
		//add to the cart 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Product_addToCart))).click();

		//back to main page and open the cart			
		driver.get(Elements.Zipy_il);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Elements.Product_openCart))).click();
		
		//change the quantity in the cart manually to 2
		new Actions (driver).moveToElement(driver.findElement(By.xpath(Elements.Product_quantity))).click()
				.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("2",Keys.ENTER).build().perform();
		
		//back to main page and open the cart again		
		driver.get(Elements.Zipy_il);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Elements.Product_openCart))).click();
		WebElement cartFrame = driver.findElement(By.xpath(Elements.Product_cartFrame));
		wait.until(ExpectedConditions.visibilityOf(cartFrame));
		
		// if we managed to add the product twice, its quantity in the cart is 2:
		Assert.assertTrue(driver.findElement(By.xpath(Elements.Product_quantity)).getAttribute("value").equals("2"));
		
		//at the end, remove the product from the cart, for the future tests		
		Tests_functions.emptyCart(driver);				
	}
	
	
	//Test - adding a product while unlogged, and the logging in and checking for the product in the cart
	@Test		
	public  void Tests_cart_addProduct_unloggedUser() throws Exception {
		System.out.println("Running test for adding product to the cart while the user unlogged, and then logging in");		

		//disconnect from the user
		Tests_functions.unLogIn(driver);

		//get to the required product page and save its title
		driver.get(Elements.Product_noVariations);
		String ProductTitle = driver.findElement(By.xpath(Elements.Product_titleFromPicture)).getAttribute("alt");
		
		//add to the cart
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Product_addToCart))).click();

		//back to main page and connect back to the user
		driver.get(Elements.Zipy_il);
		Tests_functions.logIn(driver);
				
		//open the cart			
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Elements.Product_openCart))).click();
		WebElement cartFrame = driver.findElement(By.xpath(Elements.Product_cartFrame));
		wait.until(ExpectedConditions.visibilityOf(cartFrame));
		
		// if we managed to add the product, its title is found in the cart:
		Assert.assertTrue(cartFrame.getText().contains(ProductTitle));
		
		//at the end, remove the product from the cart, for the future tests		
		Tests_functions.emptyCart(driver);					
		}
	
	
	//Test - adding a product then disconnecting and logging in back, and checking for the product in the cart
	@Test		
	public  void Tests_cart_addProduct_disconnectAndLogInBack() throws Exception {
		System.out.println("Running test for adding product to the cart while the user unlogged, and then logging in");		

		//get to the required product page and save its title
		driver.get(Elements.Product_noVariations);
		String ProductTitle = driver.findElement(By.xpath(Elements.Product_titleFromPicture)).getAttribute("alt");
		
		//add to the cart
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Product_addToCart))).click();

		//back to main page and disconnect from the user
		driver.get(Elements.Zipy_il);
		Tests_functions.unLogIn(driver);
		
		//back to main page and connect back to the user
		driver.get(Elements.Zipy_il);
		Tests_functions.logIn(driver);
				
		//open the cart			
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Elements.Product_openCart))).click();
		WebElement cartFrame = driver.findElement(By.xpath(Elements.Product_cartFrame));
		wait.until(ExpectedConditions.visibilityOf(cartFrame));
		
		// if we managed to add the product, its title is found in the cart:
		Assert.assertTrue(cartFrame.getText().contains(ProductTitle));
		
		//at the end, remove the product from the cart, for the future tests		
		Tests_functions.emptyCart(driver);					
		}
	
	
	//Test - adding both a product from aliExpress and a product from Amazon to the cart 
	@Test		
	public  void Tests_cart_addProduct_aliExpressPlusAmazon() throws Exception {
		System.out.println("Running test for adding product to the cart (product without variations)");		

		//get to the aliExpress product page and save its title
		driver.get(Elements.Product_noVariations);
		String ProductTitle = driver.findElement(By.xpath(Elements.Product_titleFromPicture)).getAttribute("alt");
		
		//add to the cart
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Product_addToCart))).click();

		//get to the amazon product page and save its title
		driver.get(Elements.Product_noVariationsAmazon);
		String ProductTitleAmazon = driver.findElement(By.xpath(Elements.Product_titleFromPicture)).getAttribute("alt");
		
		//add to the cart
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Elements.Product_addToCart))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Product_addedToCart))).click();
		
		//back to main page and open the cart			
		driver.get(Elements.Zipy_il);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Elements.Product_openCart))).click();
		WebElement cartFrame = driver.findElement(By.xpath(Elements.Product_cartFrame));
		wait.until(ExpectedConditions.visibilityOf(cartFrame));
		
		// if we managed to add the products, both titles are in the cart:
		Assert.assertTrue((cartFrame.getText().contains(ProductTitle)) &&
				(cartFrame.getText().contains(ProductTitleAmazon)));
		
		//at the end, remove the products from the cart, for the future tests		
		Tests_functions.emptyCart(driver);			
	}
		
}
