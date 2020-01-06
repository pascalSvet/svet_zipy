 package zipy_test_signUp;

import java.util.Scanner;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import zipy_elements.Elements;

public class Positive_Tests_signUp_buttons extends Tests_signUp_main {
	
	//Test - sign-up buttons - open window
	@Test		
	public  void signUp_button_openFrame() throws InterruptedException {
		
	
		//press signup button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
				
		//check if sign-up frame opened
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath(Elements.SignUp_phone_button)).isDisplayed());
	}	
	
	//Test - sign-up buttons - close window by open button
	@Test		
	public  void signUp_button_closeFrame() throws InterruptedException {
			
		//press signup button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
		Thread.sleep(500);
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
	
		//check if sign-up frame closed
		Thread.sleep(500);
		Assert.assertFalse(driver.findElement(By.xpath(Elements.SignUp_phone_button)).isDisplayed());
	}	
	
	//Test - sign-up buttons - close window by X button
	@Test		
	public  void signUp_button_closeFrameByX() throws InterruptedException {
			
		//press signup button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
		//press X button
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.LoginFrame_close))).click();
	
		//check if sign-up frame closed
		Thread.sleep(500);
		Assert.assertFalse(driver.findElement(By.xpath(Elements.SignUp_phone_button)).isDisplayed());
	}	
	
	//Test - sign-up buttons - show password
	@Test		
	public  void signUp_button_showPassword() throws InterruptedException {
			
		//press signup button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
		
		//enter the password
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("i_signup-email"))).sendKeys(Keys.TAB, Elements.Password);
		//click show password
		driver.findElement(By.xpath(Elements.SignUp_PasswordHiden)).click();
		
		//check if password now shown 
		Thread.sleep(500);
		Assert.assertTrue(driver.findElement(By.xpath(Elements.SignUp_PasswordShown)).isDisplayed());
	}	
	
	//Test - sign-up buttons - hide password
	@Test		
	public  void signUp_button_hidePassword() throws InterruptedException {
			
		//press signup button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
		//enter the password
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("i_signup-email"))).sendKeys(Keys.TAB, Elements.Password);
		//click show password and hide password again
		driver.findElement(By.xpath(Elements.SignUp_PasswordHiden)).click();		
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_PasswordShown))).click();
		
		//check if password now hidden 
		Thread.sleep(500);
		Assert.assertTrue(driver.findElement(By.xpath(Elements.SignUp_PasswordHiden)).isDisplayed());
	}	
	
	//Test - sign-up buttons - discounts v-check (uncheck) 
	@Test		
	public  void signUp_button_uncheckDiscounts() throws InterruptedException {
			
		//press signup button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
		
		//uncheck the discounts
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Login_discounts_checkVi))).click();
		
		//check if the Vi is unchecked now 
		Thread.sleep(500);
		Assert.assertTrue(driver.findElement(By.xpath(Elements.Login_discounts_uncheckVi)).isDisplayed());
	}	

	//Test - sign-up buttons - discounts v-check
	@Test		
	public  void signUp_button_checkDiscounts() throws InterruptedException {
			
		//press signup button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
		
		//uncheck and check again the discounts
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Login_discounts_checkVi))).click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Login_discounts_uncheckVi))).click();

		//check if the Vi is checked now 
		Thread.sleep(500);
		Assert.assertTrue(driver.findElement(By.xpath(Elements.Login_discounts_checkVi)).isDisplayed());
	}

	//Test - sign-up buttons - terms v-check
	@Test		
	public  void signUp_button_checkTerms() throws InterruptedException {
			
		//press signup button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
		
		//check the terms
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Login_terms_uncheckedVi))).click();

		//check if the Vi is checked now 
		Thread.sleep(500);
		Assert.assertTrue(driver.findElement(By.xpath(Elements.Login_terms_checkedVi)).isDisplayed());
	}
	
	//Test - sign-up buttons - terms v-check (uncheck)
	@Test		
	public  void signUp_button_uncheckTerms() throws InterruptedException {
			
		//press signup button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
		
		//check the terms
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Login_terms_uncheckedVi))).click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Login_terms_checkedVi))).click();

		//check if the Vi is checked now 
		Thread.sleep(500);
		Assert.assertTrue(driver.findElement(By.xpath(Elements.Login_terms_uncheckedVi)).isDisplayed());
	}

	//Test - sign-up buttons - facebook
	@Test		
	public  void signUp_button_openFB() throws InterruptedException {
			
		//press signup button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
		//choose by FB
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_fb_button))).click();
		for (String currentWindow: driver.getWindowHandles()) {
		       driver.switchTo().window(currentWindow);
		}				
		
		//check if the FB sign-in window opened
		Thread.sleep(500);
		Assert.assertTrue(driver.getCurrentUrl().contains("facebook.com"));
	}
	
	//Test - sign-up buttons - google
	@Test		
	public  void signUp_button_openGoogle() throws InterruptedException {
			
		//press signup button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
		//choose by google
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_google_button))).click();
		for (String currentWindow: driver.getWindowHandles()) {
		       driver.switchTo().window(currentWindow);
		}				
		
		//check if the google sign-in window opened
		Thread.sleep(500);
		Assert.assertTrue(driver.getCurrentUrl().contains("google.com"));
	}

	//Test - sign-up buttons - phone
	@Test		
	public  void signUp_button_openPhone() throws InterruptedException {
			
		//press signup button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
		//choose by google
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_phone_button))).click();
		
		//check if the google sign-in window opened
		Thread.sleep(500);
		Assert.assertTrue(driver.findElement(By.xpath(Elements.SignUp_phoneNumber)).isDisplayed());
	}
	
	//Test - sign-up buttons - phone switching to sign-in
	@Test		
	public  void signUp_button_Phone_switchFromSignUpToSignIn() throws InterruptedException {
			
		//press signup button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
		//choose by google
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_phone_button))).click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_phoneNumber_toSignIn))).click();

		//check if the google sign-in window opened
		Thread.sleep(500);
		Assert.assertTrue(driver.findElement(By.xpath(Elements.SignIn_phoneNumber_toSignUp)).isDisplayed());
	}

}
