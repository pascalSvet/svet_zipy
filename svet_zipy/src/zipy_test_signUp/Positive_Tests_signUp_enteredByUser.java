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

public class Positive_Tests_signUp_enteredByUser extends Tests_signUp_main {
	
	//TEST - sign up with unused email, entered by the user
	@Test		
	public  void signUp_byEmail_newEmailByUser() throws InterruptedException {
		System.out.println("Running test with email and password entered by user");

		//press signup button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
	
		// ask user and enter e-mail, with default password: 		
			System.out.println("Please enter your e-mail:  ");
			Scanner i= new Scanner(System.in);
			String  temp_mail= i.nextLine();	
		driver.findElement(By.xpath(Elements.Login_terms_uncheckedVi)).click();
		driver.findElement(By.id("i_signup-email")).sendKeys(temp_mail, Keys.TAB, Elements.Password, Keys.ENTER);
		
	
		//check if user logged in
		new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.UserTopBar)));
		Boolean logged = (driver.findElement(By.xpath(Elements.UserTopBar)).getText().contains(Elements.SignedIn_ezorIshi));
		Assert.assertTrue(logged);
		
	}	
	
	//TEST - sign up with unused phone number, entered by the user
	@Test		
	public  void signUp_byPhone_newPhoneByUser() throws InterruptedException {
		System.out.println("Running test with phone number entered by user");
	
		//press signup button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));

		//choose signup by phone
		driver.findElement(By.xpath(Elements.SignUp_phone_button)).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		
		// ask user and enter temporary phone number: 		
				System.out.println("Please enter your phone number:   ");
				Scanner k= new Scanner(System.in);
				String  Temp_phoneNumber= k.nextLine();		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_phoneNumber)))
		.sendKeys(Temp_phoneNumber, Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Elements.SignUp_phone_pressEnter)))).click();
		
		
		// ask user and enter phone code: 		
		if(!driver.findElement(By.xpath(Elements.SignUp_phone_messageExist)).isEnabled()) {
			System.out.println("Please enter the code from your phone:  ");
			Scanner j= new Scanner(System.in);
			String  phone_code= j.nextLine();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_phone_fieldCode)))
		.sendKeys(phone_code, Keys.ENTER);
		}
		
		//check if user logged in
		new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.UserTopBar)));
		Boolean logged = (driver.findElement(By.xpath(Elements.UserTopBar)).getText().contains(Elements.SignedIn_ezorIshi));
		Assert.assertTrue(logged);	
	
	}
	
	//TEST - sign up with unused google account, entered by the user
	@Test		
	public  void signUp_byGoogle_newGoogleByUser() throws InterruptedException {
		System.out.println("Running test with google account entered by user");
	
		//press signup button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));

		//choose signup by google
		driver.findElement(By.xpath(Elements.SignUp_google_button)).click();
		for (String currentWindow: driver.getWindowHandles()) {
		       driver.switchTo().window(currentWindow);
		}
				
		// ask user and enter google account identifiers: 		
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
	
	//TEST - sign up with unused facebook account, entered by the user
	@Test		
	public  void signUp_byFB_newFBbyUser() throws InterruptedException {
		System.out.println("Running test with facebook account entered by user");
	
		//press signup button		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));

		//choose signup by FB
		driver.findElement(By.xpath(Elements.SignUp_fb_button)).click();
		
		for (String currentWindow: driver.getWindowHandles()) {
		       driver.switchTo().window(currentWindow);
		}
			
				
		// ask user and enter FB account identifiers: 		
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
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_fb_userAccept))).click();

				
					
		//check if user logged in
		new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.UserTopBar)));
		Boolean logged = (driver.findElement(By.xpath(Elements.UserTopBar)).getText().contains(Elements.SignedIn_ezorIshi));
		Assert.assertTrue(logged);
		
		

	}	
}
