package zipy_test_signUp;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import org.junit.experimental.runners.Enclosed;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import zipy_elements.*;

@RunWith(Enclosed.class)
public class Negative_Tests_signUp_byEmail extends Tests_signUp_main {
	
	//tests with parameters 
	@RunWith(Parameterized.class)
	public static class NegativeTests_signUpByEmail_parameterized extends Tests_signUp_main  {	
		
		private static String paramEmail;
		private static String paramPassword;		
		public NegativeTests_signUpByEmail_parameterized(String paramEmail, String paramPassword) {
			super();
			this.paramEmail = paramEmail;
			this.paramPassword = paramPassword;	
		}		
		//our parameters to test- email and password 
		@Parameterized.Parameters
		public static Collection falseData(){
			return Arrays.asList( new Object[][]{				
							{ElementsLogin.Email, ElementsLogin.Password},							//existing email
							{ElementsLogin.Email_domain_withoutAt, ElementsLogin.Password},	//wrong email- domain without "@"
							{ElementsLogin.Email_empty, ElementsLogin.Password_empty},	//wrong email- empty
							{ElementsLogin.Email_domain_illegal, ElementsLogin.Password}, 		//wrong email- domain with non-alphanumeric
							{ElementsLogin.Email_domain_empty, ElementsLogin.Password},		//wrong email- empty domain
							{ElementsLogin.Email_ending_withoutDot, ElementsLogin.Password}, 	//wrong email- no dot after domain
							{ElementsLogin.Email_ending_empty, ElementsLogin.Password}, 		//wrong email- no ending
							{ElementsLogin.Email_ending_illegal, ElementsLogin.Password}, 		//wrong email- ending with non-alphabetic
							{ElementsLogin.Email_name_startWithSign, ElementsLogin.Password}, 	//wrong email- starting with non-alphanumeric
							{ElementsLogin.Email_name_withSpace, ElementsLogin.Password}, 		//wrong email- name with space
							{ElementsLogin.Email_name_empty, ElementsLogin.Password}, 			//wrong email- empty name
							{ElementsLogin.Email_domain_oneSignOnly, ElementsLogin.Password}, 	//wrong email- domain with one char only
							{ElementsLogin.Email_ending_oneSignOnly, ElementsLogin.Password}, 	//wrong email- ending with one char only
							{ElementsLogin.Email_moreThan254signs, ElementsLogin.Password},	//wrong email- longer than 254 chars 
							{ElementsLogin.Email, ElementsLogin.Password_short}, 				//wrong password - shorter than 5 chars
							{ElementsLogin.Email, ElementsLogin.Password_moreThan100signs}, 	//wrong password - longer than 100 chars
							{ElementsLogin.Email, ElementsLogin.Password_empty},				//wrong password - empty
							});
		}
		
		//TEST - sign up with incorrect email or incorrect password
		@Test	
		public  void N_signUp_wrongEmailOrPassword() throws InterruptedException {
			System.out.println("Running test with email: " + paramEmail + ", and password: " + paramPassword);
			
				//press signup button		
				JavascriptExecutor ex=(JavascriptExecutor)driver;
				ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(ElementsLogin.SignUp_button)));
					
				//check terms
				driver.findElement(By.xpath(ElementsLogin.Login_terms_uncheckedVi)).click();
				
				//enter login+password according to the parameters
				driver.findElement(By.id("i_signup-email")).sendKeys(paramEmail, Keys.TAB, paramPassword, Keys.ENTER);
			
			try {			
				//check if user logged in (if so, appears new button "איזור אישי")
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

		//TEST - sign up with unchecked terms of use
		@Test		
		public  void N_signUp_byEmail_uncheckedTerms() throws InterruptedException {
			System.out.println("Running test with unchecked terms of use");
			
				//press signup button		
				JavascriptExecutor ex=(JavascriptExecutor)driver;
				ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(ElementsLogin.SignUp_button)));		
			
				//enter login+password and click signup
				driver.findElement(By.id(ElementsLogin.SignUp_field_email)).sendKeys(ElementsLogin.Email, Keys.TAB, ElementsLogin.Password);
				driver.findElement(By.xpath(ElementsLogin.SignUp_button_confirm)).click();
			
			try {	
				//check if user logged in (if so, appears new button "איזור אישי")
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
		
		//TEST - sign up with email and password, entered by the user (The comment markers should be deleted if this test is needed)
		@Test		
		public  void N_signUp_byEmail_enteredByUser() throws InterruptedException {
			/*	
			System.out.println("Running test with incorrect email and password, entered by the user");	
			try {
				//press signup button		
				JavascriptExecutor ex=(JavascriptExecutor)driver;
				ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(ElementsLogin.SignUp_button)));
			
					// enter temporary e-mail by user: 		
					System.out.println("Please enter your e-mail:  ");
					Scanner i= new Scanner(System.in);
					String  Username= i.nextLine();
			
				//enter login+password** 
				driver.findElement(By.xpath(ElementsLogin.Login_terms_uncheckedVi)).click();
				driver.findElement(By.id("i_signup-email")).sendKeys(Username, Keys.TAB, ElementsLogin.Password, Keys.ENTER);
						
				//check if user logged in (if so, appears new button "איזור אישי")
				new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementsLogin.UserTopBar)));
				logged = (driver.findElement(By.xpath(ElementsLogin.UserTopBar)).getText().contains(ElementsHeb.SignedIn_ezorIshi));
				
			}
			catch (Exception ex) {
				System.out.println("Negative test - failed as expected");
				errorCaught = true;
			}
			finally {	
				Assert.assertTrue(errorCaught || !logged);		
			}	*/
			 		
		}	
	}


}
