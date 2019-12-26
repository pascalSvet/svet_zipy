package zipy_test_signUp;

import java.util.Scanner;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import zipy_elements.Elements;

public class Tests_signUp_enteredByUser extends Tests_main {
	
	
	@Test		
	public  void signUp_byEmail_newEmail() throws InterruptedException {
		
	
		//press signup button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
	
			// enter temporary e-mail: 		
			System.out.println("Please enter your e-mail:  ");
			Scanner i= new Scanner(System.in);
			String  temp_mail= i.nextLine();
	
		//enter login+password
		driver.findElement(By.xpath(Elements.Terms_uncheckedVi)).click();
		driver.findElement(By.id("i_signup-email")).sendKeys(temp_mail, Keys.TAB, Elements.Password, Keys.ENTER);
		
	
		//check if user logged in
		new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.UserTopBar)));
		Boolean logged = (driver.findElement(By.xpath(Elements.UserTopBar)).getText().contains(Elements.SignedIn_ezorIshi));
		Assert.assertTrue(logged);
	}	
	
	
	@Test		
	public  void signUp_byPhone_newPhone() throws InterruptedException {
			
		//press signup button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));

		//choose signup by phone
		driver.findElement(By.xpath(Elements.SignUp_phone_button)).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		
		// enter temporary phone number: 		
				System.out.println("Please enter your phone number:   ");
				Scanner k= new Scanner(System.in);
				String  Temp_phoneNumber= k.nextLine();		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_phoneNumber)))
		.sendKeys(Temp_phoneNumber, Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Elements.Temp_phoneNumber_pressEnter)))).click();
		
		
		// enter phone code: 		
		if(!driver.findElement(By.xpath(Elements.SignUp_phone_messageExist)).isEnabled()) {
			System.out.println("Please enter the code from your phone:  ");
			Scanner j= new Scanner(System.in);
			String  phone_code= j.nextLine();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.Temp_phoneNumber_fieldCode)))
		.sendKeys(phone_code, Keys.ENTER);
	}
		
		//check if user logged in
		new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.UserTopBar)));
		Boolean logged = (driver.findElement(By.xpath(Elements.UserTopBar)).getText().contains(Elements.SignedIn_ezorIshi));
		Assert.assertTrue(logged);	

	}
	
	
	@Test		
	public  void signUp_byEmail_newGoogle() throws InterruptedException {
		
	
		//press signup button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));

		//choose signup by google
		driver.findElement(By.xpath(Elements.SignUp_google_button)).click();
		for (String currentWindow: driver.getWindowHandles()) {
		       driver.switchTo().window(currentWindow);
		}
				
		// enter google account identifiers: 		
				System.out.println("Please enter your gmail or phone from your google account:   ");
				Scanner k= new Scanner(System.in);
				String  Temp_google= k.nextLine();	
				System.out.println("Please enter your password:   ");
				Scanner m= new Scanner(System.in);
				String  Temp_googlePassword= m.nextLine();
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_google_field)))
		.sendKeys(Temp_google, Keys.ENTER);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_googlePassword_field)))
		.sendKeys(Temp_googlePassword, Keys.ENTER);
				
					
		//check if user logged in
		new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.UserTopBar)));
		Boolean logged = (driver.findElement(By.xpath(Elements.UserTopBar)).getText().contains(Elements.SignedIn_ezorIshi));
		Assert.assertTrue(logged);	

	}	
	

	@Test		
	public  void signUp_byEmail_newFB() throws InterruptedException {
		
	
		//press signup button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));

		//choose signup by FB
		driver.findElement(By.xpath(Elements.SignUp_fb_button)).click();
		
		for (String currentWindow: driver.getWindowHandles()) {
		       driver.switchTo().window(currentWindow);
		}
			
				
		// enter google account identifiers: 		
				System.out.println("Please enter your facebook mail or phone:   ");
				Scanner k= new Scanner(System.in);
				String  Temp_fb= k.nextLine();	
				System.out.println("Please enter your password:   ");
				Scanner m= new Scanner(System.in);
				String  Temp_fbPassword= m.nextLine();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_fb_field)))
		.sendKeys(Temp_fb, Keys.ENTER);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_fbPassword_field)))
		.sendKeys(Temp_fbPassword, Keys.ENTER);
				
					
		//check if user logged in
		new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.UserTopBar)));
		Boolean logged = (driver.findElement(By.xpath(Elements.UserTopBar)).getText().contains(Elements.SignedIn_ezorIshi));
		Assert.assertTrue(logged);	

	}	
}
