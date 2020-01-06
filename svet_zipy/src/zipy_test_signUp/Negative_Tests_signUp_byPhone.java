package zipy_test_signUp;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import zipy_elements.Elements;

@RunWith(Enclosed.class)
public class Negative_Tests_signUp_byPhone extends Tests_signUp_main {
	
	//tests with parameters 
	@RunWith(Parameterized.class)
	public static class NegativeTests_signUpByPhone_parameterized extends Tests_signUp_main  {	
			
		private static String paramPhone;
		public NegativeTests_signUpByPhone_parameterized(String paramPhone) {
			super();
			this.paramPhone = paramPhone;
		}		
		//our parameters to test- phone numbers 
		@Parameterized.Parameters
		public static Collection falseData(){
			return Arrays.asList( new Object[][]{
							{Elements.PhoneNumber},					//existing number
							{Elements.PhoneNumber_short},			//number too short 
							{Elements.PhoneNumber_long},			//number too long 
							{Elements.PhoneNumber_letters},			//number including non digit signs in the middle
							{Elements.PhoneNumber_letterF},			//number starting not with 0
							{Elements.PhoneNumber_wiredPhone},		//wired phone number
							{Elements.PhoneNumber_mobileIllegal},	//illegal mobile number
							{Elements.PhoneNumber_wiredIllegal}		//illegal wired phone number
							});
		}
		
		
		//TEST - sign up with incorrect phone number
		@Test		
		public  void N_signUp_byPhone_existingNumber() throws InterruptedException {
			System.out.println("Running test with phone: " + paramPhone);
				
					//press signup button		
					JavascriptExecutor ex=(JavascriptExecutor)driver;
					ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));

					//choose signup by phone
					driver.findElement(By.xpath(Elements.SignUp_phone_button)).click();
					WebDriverWait wait = new WebDriverWait(driver, 20);	
					
					// enter phone number according to the parameters			
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_phoneNumber)))
					.sendKeys(paramPhone, Keys.ENTER);
				try {
					//press sign-up button if enabled
					wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Elements.SignUp_phone_pressEnter)))).click();
					
					//enter phone code if needed: 		
					if(!driver.findElement(By.xpath(Elements.SignUp_phone_messageExist)).isEnabled()) {
							System.out.println("Please enter the code from your phone:  ");
							Scanner j= new Scanner(System.in);
							String  phone_code= j.nextLine();
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_phone_fieldCode)))
						.sendKeys(phone_code, Keys.ENTER);
					}
							
					//check if user logged in (if so, appears new button "איזור אישי")
					new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.UserTopBar)));
					logged = (driver.findElement(By.xpath(Elements.UserTopBar)).getText().contains(Elements.SignedIn_ezorIshi));
					
				}
				catch (Exception exc) {
					System.out.println("Negative test - failed as expected");
					errorCaught = true;
				}
				finally {	
					Assert.assertTrue(errorCaught || !logged);		
				}	
			}
			
		}
	
	//tests without parameters
	public static class NegativeTests_signUpByPhone_notParameterized extends Tests_signUp_main  {	
		
		//TEST - sign up with phone, entered by the user (The comment markers should be deleted if this test is needed)
		@Test		
		public  void N_signUp_byPhone_numberEnteredByUser() throws InterruptedException {			
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
	}
}
