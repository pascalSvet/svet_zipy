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

public class Negative_Tests_signUp_byPhone extends Tests_main {
	
	
	@Test		
	public  void N_signUp_byPhone_numberEnteredByUser() throws InterruptedException {

		//half automated
		/*			
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));

			//choose signup by phone
			driver.findElement(By.xpath(Elements.SignUp_phone_button)).click();
			WebDriverWait wait = new WebDriverWait(driver, 20);	
			
			// enter temporary phone number** : 		
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
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.UserTopBar)));
			logged = (driver.findElement(By.xpath(Elements.UserTopBar)).getText().contains(Elements.SignedIn_ezorIshi));
			
		}
		catch (Exception ex) {
			System.out.println("The test failed as expexted");
			errorCaught = true;
		}
		finally {	
			Assert.assertTrue(errorCaught || !logged);		
		}	
		 */
	}

	
	
	@Test		
	public  void N_signUp_byPhone_existingNumber() throws InterruptedException {
			
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));

			//choose signup by phone
			driver.findElement(By.xpath(Elements.SignUp_phone_button)).click();
			WebDriverWait wait = new WebDriverWait(driver, 20);	
			
			// enter an existing phone number** : 			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_phoneNumber)))
			.sendKeys(Elements.Temp_phoneNumber, Keys.ENTER);
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
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.UserTopBar)));
			logged = (driver.findElement(By.xpath(Elements.UserTopBar)).getText().contains(Elements.SignedIn_ezorIshi));
			
		}
		catch (Exception ex) {
			System.out.println("The test failed as expexted");
			errorCaught = true;
		}
		finally {	
			Assert.assertTrue(errorCaught || !logged);		
		}	

	}
	
	@Test		
	public  void N_signUp_byPhone_shortNumber() throws InterruptedException {
			
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));

			//choose signup by phone
			driver.findElement(By.xpath(Elements.SignUp_phone_button)).click();
			WebDriverWait wait = new WebDriverWait(driver, 20);	
			
			// enter an existing phone number: 			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_phoneNumber)))
			.sendKeys(Elements.Temp_phoneNumber, Keys.ENTER);
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
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.UserTopBar)));
			logged = (driver.findElement(By.xpath(Elements.UserTopBar)).getText().contains(Elements.SignedIn_ezorIshi));
			
		}
		catch (Exception ex) {
			System.out.println("The test failed as expexted");
			errorCaught = true;
		}
		finally {	
			Assert.assertTrue(errorCaught || !logged);		
		}	

	}

	@Test		
	public  void N_signUp_byPhone_longNumber() throws InterruptedException {
			
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));

			//choose signup by phone
			driver.findElement(By.xpath(Elements.SignUp_phone_button)).click();
			WebDriverWait wait = new WebDriverWait(driver, 20);	
			
			// enter an existing phone number** : 			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_phoneNumber)))
			.sendKeys(Elements.Temp_phoneNumber_long, Keys.ENTER);
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
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.UserTopBar)));
			logged = (driver.findElement(By.xpath(Elements.UserTopBar)).getText().contains(Elements.SignedIn_ezorIshi));
			
		}
		catch (Exception ex) {
			System.out.println("The test failed as expexted");
			errorCaught = true;
		}
		finally {	
			Assert.assertTrue(errorCaught || !logged);		
		}	

	}

	@Test		
	public  void N_signUp_byPhone_lettersInNumber() throws InterruptedException {
			
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));

			//choose signup by phone
			driver.findElement(By.xpath(Elements.SignUp_phone_button)).click();
			WebDriverWait wait = new WebDriverWait(driver, 20);	
			
			// enter an existing phone number** : 			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_phoneNumber)))
			.sendKeys(Elements.Temp_phoneNumber_letters, Keys.ENTER);
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
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.UserTopBar)));
			logged = (driver.findElement(By.xpath(Elements.UserTopBar)).getText().contains(Elements.SignedIn_ezorIshi));
			
		}
		catch (Exception ex) {
			System.out.println("The test failed as expexted");
			errorCaught = true;
		}
		finally {	
			Assert.assertTrue(errorCaught || !logged);		
		}	

	}
	
	@Test		
	public  void N_signUp_byPhone_startWithLetter() throws InterruptedException {
			
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));

			//choose signup by phone
			driver.findElement(By.xpath(Elements.SignUp_phone_button)).click();
			WebDriverWait wait = new WebDriverWait(driver, 20);	
			
			// enter an existing phone number** : 			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_phoneNumber)))
			.sendKeys(Elements.Temp_phoneNumber_letterF, Keys.ENTER);
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
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.UserTopBar)));
			logged = (driver.findElement(By.xpath(Elements.UserTopBar)).getText().contains(Elements.SignedIn_ezorIshi));
			
		}
		catch (Exception ex) {
			System.out.println("The test failed as expexted");
			errorCaught = true;
		}
		finally {	
			Assert.assertTrue(errorCaught || !logged);		
		}	

	}
	
	@Test		
	public  void N_signUp_byPhone_startWithSign() throws InterruptedException {
			
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));

			//choose signup by phone
			driver.findElement(By.xpath(Elements.SignUp_phone_button)).click();
			WebDriverWait wait = new WebDriverWait(driver, 20);	
			
			// enter an existing phone number** : 			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_phoneNumber)))
			.sendKeys(Elements.Temp_phoneNumber_signF, Keys.ENTER);
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
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.UserTopBar)));
			logged = (driver.findElement(By.xpath(Elements.UserTopBar)).getText().contains(Elements.SignedIn_ezorIshi));
			
		}
		catch (Exception ex) {
			System.out.println("The test failed as expexted");
			errorCaught = true;
		}
		finally {	
			Assert.assertTrue(errorCaught || !logged);		
		}	

	}
	
	@Test		
	public  void N_signUp_byPhone_wiredPhone() throws InterruptedException {
			
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));

			//choose signup by phone
			driver.findElement(By.xpath(Elements.SignUp_phone_button)).click();
			WebDriverWait wait = new WebDriverWait(driver, 20);	
			
			// enter an existing phone number** : 			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_phoneNumber)))
			.sendKeys(Elements.Temp_phoneNumber_wiredPhone, Keys.ENTER);
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
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.UserTopBar)));
			logged = (driver.findElement(By.xpath(Elements.UserTopBar)).getText().contains(Elements.SignedIn_ezorIshi));
			
		}
		catch (Exception ex) {
			System.out.println("The test failed as expexted");
			errorCaught = true;
		}
		finally {	
			Assert.assertTrue(errorCaught || !logged);		
		}	

	}

	@Test		
	public  void N_signUp_byPhone_illegalMobileNumber() throws InterruptedException {
			
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));

			//choose signup by phone
			driver.findElement(By.xpath(Elements.SignUp_phone_button)).click();
			WebDriverWait wait = new WebDriverWait(driver, 20);	
			
			// enter an existing phone number** : 			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_phoneNumber)))
			.sendKeys(Elements.Temp_phoneNumber_mobileIllegal, Keys.ENTER);
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
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.UserTopBar)));
			logged = (driver.findElement(By.xpath(Elements.UserTopBar)).getText().contains(Elements.SignedIn_ezorIshi));
			
		}
		catch (Exception ex) {
			System.out.println("The test failed as expexted");
			errorCaught = true;
		}
		finally {	
			Assert.assertTrue(errorCaught || !logged);		
		}	

	}
	
	@Test		
	public  void N_signUp_byPhone_illegalWiredNumber() throws InterruptedException {
			
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));

			//choose signup by phone
			driver.findElement(By.xpath(Elements.SignUp_phone_button)).click();
			WebDriverWait wait = new WebDriverWait(driver, 20);	
			
			// enter an existing phone number** : 			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_phoneNumber)))
			.sendKeys(Elements.Temp_phoneNumber_wiredIllegal, Keys.ENTER);
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
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.UserTopBar)));
			logged = (driver.findElement(By.xpath(Elements.UserTopBar)).getText().contains(Elements.SignedIn_ezorIshi));
			
		}
		catch (Exception ex) {
			System.out.println("The test failed as expexted");
			errorCaught = true;
		}
		finally {	
			Assert.assertTrue(errorCaught || !logged);		
		}	

	}
	
	
	
}
