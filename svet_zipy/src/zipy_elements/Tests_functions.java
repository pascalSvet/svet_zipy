package zipy_elements;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import zipy_elements.*;

	
public class Tests_functions {
	
	// A function for login.
	public static void logIn(WebDriver driver) throws Exception{
			
		//press login button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(ElementsLogin.Login_button)));
		Thread.sleep(500);
						
		//enter login+password and wait for the logging-in
		new Actions (driver).moveToElement(driver.findElement(By.xpath(ElementsLogin.Login_usernameField))).click()
		.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(ElementsLogin.Email, Keys.TAB, ElementsLogin.Password, Keys.ENTER)
		.build().perform();
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsLogin.UserTopBar)));											
	}
	
	// A function for unloging.
	public static void unLogIn(WebDriver driver) throws Exception{
			
		//press login button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(ElementsLogin.Logedin_button)));
								
		//enter login+password and wait for the logging-in
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsLogin.Login_disconnect))).click();				
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsLogin.Login_button))).click();;											

	}
	

	// A function for emptying the cart.
	public static void emptyCart(WebDriver driver) throws Exception{
		Thread.sleep(500);
		//while there is pay button in the cart, continue deleting the first product from the cart and reopen it
		while (!driver.findElements(By.xpath(ElementsBuying.Product_cartPay)).isEmpty() ) {
				driver.findElement(By.xpath(ElementsBuying.Product_cartRemove)).click();
				driver.findElement(By.xpath(ElementsBuying.Product_closeCart)).click();
				driver.findElement(By.xpath(ElementsBuying.Product_openCart)).click();
				Thread.sleep(500);
		}	
	}
	
	// A function for emptying the favorites.
		public static void emptyFavorites(WebDriver driver) throws Exception{
			Thread.sleep(500);
			//while there is pay button in the cart, continue deleting the first product from the cart and reopen it
			while (!driver.findElements(By.xpath(ElementsBuying.Product_favoritesTitle)).isEmpty() ) {
					driver.findElement(By.xpath(ElementsBuying.Product_favoritesRemove)).click();
					driver.findElement(By.xpath(ElementsBuying.Product_closeFavorites)).click();
					driver.findElement(By.xpath(ElementsBuying.Product_openFavorites)).click();
					Thread.sleep(500);
			}	
		}

	// A function for adding two strings of prices.
		public static String priceSum(WebDriver driver, String price1, String price2) throws Exception{
			double firstPrice = Double.parseDouble(driver.findElement(By.xpath(price1)).getText());
			double secondPrice = Double.parseDouble(driver.findElement(By.xpath(price2)).getText());
			BigDecimal sumTemp = BigDecimal.valueOf(firstPrice).add(BigDecimal.valueOf(secondPrice));
			String Sum = String.valueOf(sumTemp);
			return Sum;
		}
		
		// A function for adding two strings of prices.
				public static String stringSum(WebDriver driver, String price1, String price2) throws Exception{
					double firstPrice = Double.parseDouble(price1);
					double secondPrice = Double.parseDouble(price2);
					BigDecimal sumTemp = BigDecimal.valueOf(firstPrice).add(BigDecimal.valueOf(secondPrice));
					String Sum = String.valueOf(sumTemp);
					return Sum;
				}
}
