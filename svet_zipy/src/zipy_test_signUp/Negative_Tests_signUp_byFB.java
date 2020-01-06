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
import net.bytebuddy.implementation.bytecode.Throw;
import zipy_elements.*;

@RunWith(Enclosed.class)
public class Negative_Tests_signUp_byFB extends Tests_signUp_main {
	
	
	//tests with parameters 
	@RunWith(Parameterized.class)
	public static class Negative_Tests_signUp_byFB_parameterized extends Tests_signUp_main  {	
			
			private static String paramEmail;
			private static String paramPassword;		
			public Negative_Tests_signUp_byFB_parameterized(String paramEmail, String paramPassword) {
				super();
				this.paramEmail = paramEmail;
				this.paramPassword = paramPassword;	
			}		
			//our parameters to test- email and password 
			@Parameterized.Parameters
			public static Collection falseData(){
				return Arrays.asList( new Object[][]{				
								{ElementsLogin.Email, ElementsLogin.Password},					//email with no FB account		
								{ElementsLogin.Email_domain_withoutAt, ElementsLogin.Password},	//incorrect email
								{ElementsLogin.Email_empty, ElementsLogin.Password},				//empty email 
								{ElementsLogin.Email, ElementsLogin.Password_empty},				//empty password
								{ElementsLogin.Email, ElementsLogin.Password_short},				//wrong password
								});
			}
	
			//TEST - sign up with incorrect FB details, according to the parameters
			@Test		
			public  void N_signUp_byFB() throws InterruptedException {				
				System.out.println("Running test with email: " + paramEmail + ", and password: " + paramPassword);

				//press signup button		
				JavascriptExecutor ex=(JavascriptExecutor)driver;
				ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(ElementsLogin.SignUp_button)));

				//choose signup by FB
				driver.findElement(By.xpath(ElementsLogin.SignUp_fb_button)).click();
				//move to FB frame
				for (String currentWindow: driver.getWindowHandles()) {
				       driver.switchTo().window(currentWindow);
				}
					

				try {
					// enter FB account identifiers and accept connection: 		
					new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsLogin.SignUp_fb_field)))
					.sendKeys(paramEmail, Keys.TAB, paramPassword, Keys.ENTER);
					new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsLogin.SignUp_fb_userAccept)))
					.click();
		
					//check if user logged in
					new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsLogin.UserTopBar)));
					logged = (driver.findElement(By.xpath(ElementsLogin.UserTopBar)).getText().contains(ElementsHeb.SignedIn_ezorIshi));					
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
	public static class NegativeTests_signUpByEmail_notParameterized extends Tests_signUp_main {
			
		//TEST - sign up with incorrect FB details, entered by user (The comment markers should be deleted if this test is needed)
		@Test		
		public  void N_signUp_byFB_EnteredByUser() throws InterruptedException {
				/*	
				System.out.println("Running test with incorrect email and password entered by user");
			
				//press signup button		
				JavascriptExecutor ex=(JavascriptExecutor)driver;
				ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(ElementsLogin.SignUp_button)));

				//choose signup by FB
				driver.findElement(By.xpath(ElementsLogin.SignUp_fb_button)).click();
				//move to FB frame
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

				try {
					// enter FB account identifiers: 		
					WebDriverWait wait = new WebDriverWait(driver, 20);
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsLogin.SignUp_fb_field)))
					.sendKeys(Temp_fb, Keys.ENTER);
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsLogin.SignUp_fbPassword_field)))
					.sendKeys(Temp_fbPassword, Keys.ENTER);
					new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsLogin.SignUp_fb_userAccept))).click();
							
					//check if user logged in
					new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsLogin.UserTopBar)));
					logged = (driver.findElement(By.xpath(ElementsLogin.UserTopBar)).getText().contains(ElementsHeb.SignedIn_ezorIshi));
					
				}
				catch (Exception exc) {
					System.out.println("Negative test - failed as expected");
					errorCaught = true;
				}
				finally {	
					Assert.assertTrue(errorCaught || !logged);		
				}	
		*/
		}
		

	}
}
