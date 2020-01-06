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
public class Negative_Tests_signUp_byGoogle extends Tests_signUp_main {
	
	
	//tests with parameters 
	@RunWith(Parameterized.class)
	public static class Negative_Tests_signUp_byGoogle_parameterized extends Tests_signUp_main  {	
			
			private static String paramGoogle;
			private static String paramGPassword;		
			public Negative_Tests_signUp_byGoogle_parameterized(String paramGoogle, String paramGPassword) {
				super();
				this.paramGoogle = paramGoogle;
				this.paramGPassword = paramGPassword;	
			}		
			//our parameters to test- email and password 
			@Parameterized.Parameters
			public static Collection falseData(){
				return Arrays.asList( new Object[][]{				
								{ElementsLogin.Email_noGoogle, ElementsLogin.Password},		//email with no google account		
								{ElementsLogin.Email_ending_illegal, ElementsLogin.Password},	//incorrect email
								{ElementsLogin.Email_empty, ElementsLogin.Password},			//empty email 
								{ElementsLogin.Email, ElementsLogin.Password_empty},			//empty password
								{ElementsLogin.Email_zipy, ElementsLogin.Password_short},		//wrong password
								});
			}
	
			//TEST - sign up with incorrect google details, according to the parameters
			@Test		
			public  void N_signUp_byGoogle() throws InterruptedException {				
				System.out.println("Running test with email: " + paramGoogle + ", and password: " + paramGPassword);

				//press signup button		
				JavascriptExecutor ex=(JavascriptExecutor)driver;
				ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(ElementsLogin.SignUp_button)));
		
				//choose signup by google
				driver.findElement(By.xpath(ElementsLogin.SignUp_google_button)).click();
				WebDriverWait wait = new WebDriverWait(driver, 20);	
				
				//move to google frame
				for (String currentWindow: driver.getWindowHandles()) {
				       driver.switchTo().window(currentWindow);
				}
				
				try {
					// enter google account identifiers: 
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsLogin.SignUp_google_field)))
					.sendKeys(paramGoogle, Keys.ENTER);
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsLogin.SignUp_googlePassword_field)))
					.sendKeys(paramGPassword, Keys.ENTER);
					
							
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
	public static class Negative_Tests_signUp_byGoogle_notParameterized extends Tests_signUp_main {
			
		//TEST - sign up with incorrect Google details, entered by user (The comment markers should be deleted if this test is needed)
		@Test		
		public  void N_signUp_byGoogle_EnteredByUser() throws InterruptedException {
		/*		
				System.out.println("Running test with incorrect email and password entered by user");
		
			
				//press signup button		
				JavascriptExecutor ex=(JavascriptExecutor)driver;
				ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(ElementsLogin.SignUp_button)));
		
				//choose signup by google
				driver.findElement(By.xpath(ElementsLogin.SignUp_google_button)).click();
				WebDriverWait wait = new WebDriverWait(driver, 20);	
						
				// ask user for google account identifiers: 		
						System.out.println("Please enter your gmail or phone from your google account:   ");
						Scanner k= new Scanner(System.in);
						String  Temp_google= k.nextLine();	
						System.out.println("Please enter your password:   ");
						Scanner m= new Scanner(System.in);
						String  Temp_googlePassword= m.nextLine();
			try {
				// enter google account identifiers: 
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsLogin.SignUp_google_field)))
				.sendKeys(Temp_google, Keys.ENTER);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsLogin.SignUp_googlePassword_field)))
				.sendKeys(Temp_googlePassword, Keys.ENTER);
				
						
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
