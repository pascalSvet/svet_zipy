package zipy_test_buy;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import zipy_elements.Elements;

public class Tests_buy_item extends Tests_buy_main {
	
	
	
	@Test		
	public  void buy_from_search() throws InterruptedException {
	System.out.println("Running test for buying");
	
		//press login button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.Login_button)));
						
		//enter login+password
		driver.findElement(By.id("i_signin-email")).sendKeys(Elements.Username, Keys.TAB, Elements.Password, Keys.ENTER);
						
				
		// perform search and open the product
		WebDriverWait wait = new WebDriverWait(driver, 20);				
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("desktop_search_fild")))
			.sendKeys(Elements.SearchItem, Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath(Elements.SearchItem_thumb)))).click();;
		
		// choose the color and the length		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Elements.Dropbox_color)))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Elements.Dropbox_color_black)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Elements.Dropbox_length)))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Elements.Dropbox_length_1m)).click();
		
		//buy
		driver.findElement(By.xpath(Elements.Checkout_button)).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Elements.Buy_button)))).click();
		
		// if we managed to buy:
		wait.until(ExpectedConditions.urlToBe("https://www.zipy.co.il/payment/success"));
		Assert.assertTrue(driver.findElement(By.xpath(Elements.Thanks_box)).getText().contains(Elements.ThanksForBuying_heb));

	}
	

		
				
		
	
}
