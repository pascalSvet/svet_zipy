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

public class Negative_Tests_signUp_byEmail extends Tests_main {
	
	
	@Test		
	public  void N_signUp_byEmail_enteredByUser() throws InterruptedException {
		//half automated
		/*		
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
		
				// enter temporary e-mail by user: 		
				System.out.println("Please enter your e-mail:  ");
				Scanner i= new Scanner(System.in);
				String  Username= i.nextLine();
		
			//enter login+password** 
			driver.findElement(By.xpath(Elements.Terms_uncheckedVi)).click();
			driver.findElement(By.id("i_signup-email")).sendKeys(Username, Keys.TAB, Elements.Password, Keys.ENTER);
					
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
	public  void N_signUp_byEmail_existingEmail() throws InterruptedException {
		
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
				
			//enter login+password**
			driver.findElement(By.xpath(Elements.Terms_uncheckedVi)).click();
			driver.findElement(By.id("i_signup-email")).sendKeys(Elements.Username, Keys.TAB, Elements.Password, Keys.ENTER);
					
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
	public  void N_signUp_byEmail_uncheckedTerms() throws InterruptedException {
		
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));		
		
			//enter login+password
			driver.findElement(By.id("i_signup-email")).sendKeys(Elements.Username, Keys.TAB, Elements.Password, Keys.ENTER);
			
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
	public  void N_signUp_byEmail_empty() throws InterruptedException {
		
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
				
			//enter login+password**
			driver.findElement(By.xpath(Elements.Terms_uncheckedVi)).click();
			driver.findElement(By.id("i_signup-email")).sendKeys("", Keys.TAB, Elements.Password, Keys.ENTER);
					
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
	public  void N_signUp_byEmail_domainWithoutAt() throws InterruptedException {
		
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
				
			//enter login+password**
			driver.findElement(By.xpath(Elements.Terms_uncheckedVi)).click();
			driver.findElement(By.id("i_signup-email")).sendKeys(Elements.emailIllegal_domain_withoutAt, Keys.TAB, Elements.Password, Keys.ENTER);
					
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
	public  void N_signUp_byEmail_endingWithoutDot() throws InterruptedException {
		
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
				
			//enter login+password**
			driver.findElement(By.xpath(Elements.Terms_uncheckedVi)).click();
			driver.findElement(By.id("i_signup-email")).sendKeys(Elements.emailIllegal_ending_withoutDot, Keys.TAB, Elements.Password, Keys.ENTER);
					
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
	public  void N_signUp_byEmail_domainIllegal() throws InterruptedException {
		
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
				
			//enter login+password**
			driver.findElement(By.xpath(Elements.Terms_uncheckedVi)).click();
			driver.findElement(By.id("i_signup-email")).sendKeys(Elements.emailIllegal_domain_illegal, Keys.TAB, Elements.Password, Keys.ENTER);
					
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
	public  void N_signUp_byEmail_endingIllegal() throws InterruptedException {
		
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
				
			//enter login+password**
			driver.findElement(By.xpath(Elements.Terms_uncheckedVi)).click();
			driver.findElement(By.id("i_signup-email")).sendKeys(Elements.emailIllegal_ending_illegal, Keys.TAB, Elements.Password, Keys.ENTER);
					
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
	public  void N_signUp_byEmail_nameStartWithSign() throws InterruptedException {
		
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
				
			//enter login+password**
			driver.findElement(By.xpath(Elements.Terms_uncheckedVi)).click();
			driver.findElement(By.id("i_signup-email")).sendKeys(Elements.emailIllegal_name_startWithSign, Keys.TAB, Elements.Password, Keys.ENTER);
					
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
	public  void N_signUp_byEmail_nameWithspace() throws InterruptedException {
		
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
				
			//enter login+password**
			driver.findElement(By.xpath(Elements.Terms_uncheckedVi)).click();
			driver.findElement(By.id("i_signup-email")).sendKeys(Elements.emailIllegal_name_withSpace, Keys.TAB, Elements.Password, Keys.ENTER);
					
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
	public  void N_signUp_byEmail_nameEmpty() throws InterruptedException {
		
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
				
			//enter login+password**
			driver.findElement(By.xpath(Elements.Terms_uncheckedVi)).click();
			driver.findElement(By.id("i_signup-email")).sendKeys(Elements.emailIllegal_name_empty, Keys.TAB, Elements.Password, Keys.ENTER);
					
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
	public  void N_signUp_byEmail_domainEmpty() throws InterruptedException {
		
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
				
			//enter login+password**
			driver.findElement(By.xpath(Elements.Terms_uncheckedVi)).click();
			driver.findElement(By.id("i_signup-email")).sendKeys(Elements.emailIllegal_domain_empty, Keys.TAB, Elements.Password, Keys.ENTER);
					
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
	public  void N_signUp_byEmail_endingEmpty() throws InterruptedException {
		
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
				
			//enter login+password**
			driver.findElement(By.xpath(Elements.Terms_uncheckedVi)).click();
			driver.findElement(By.id("i_signup-email")).sendKeys(Elements.emailIllegal_ending_empty, Keys.TAB, Elements.Password, Keys.ENTER);
					
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
	public  void N_signUp_byEmail_domainOneSignOnly() throws InterruptedException {
		
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
				
			//enter login+password**
			driver.findElement(By.xpath(Elements.Terms_uncheckedVi)).click();
			driver.findElement(By.id("i_signup-email")).sendKeys(Elements.emailIllegal_domain_oneSignOnly, Keys.TAB, Elements.Password, Keys.ENTER);
					
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
	public  void N_signUp_byEmail_endingOneSignOnly() throws InterruptedException {
		
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
				
			//enter login+password**
			driver.findElement(By.xpath(Elements.Terms_uncheckedVi)).click();
			driver.findElement(By.id("i_signup-email")).sendKeys(Elements.emailIllegal_ending_oneSignOnly, Keys.TAB, Elements.Password, Keys.ENTER);
					
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
	public  void N_signUp_byEmail_nameMoreThan256signs() throws InterruptedException {
		
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
				
			//enter login+password**
			driver.findElement(By.xpath(Elements.Terms_uncheckedVi)).click();
			driver.findElement(By.id("i_signup-email")).sendKeys(Elements.emailIllegal_moreThan254signs, Keys.TAB, Elements.Password, Keys.ENTER);
					
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
	public  void N_signUp_byEmail_passwordMoreThan100signs() throws InterruptedException {
		
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
				
			//enter login+password**
			driver.findElement(By.xpath(Elements.Terms_uncheckedVi)).click();
			driver.findElement(By.id("i_signup-email")).sendKeys(Elements.Username, Keys.TAB, Elements.passwordIllegal_moreThan100signs, Keys.ENTER);
					
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

	public  void N_signUp_byEmail_passwordShort() throws InterruptedException {
		
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
				
			//enter login+password**
			driver.findElement(By.xpath(Elements.Terms_uncheckedVi)).click();
			driver.findElement(By.id("i_signup-email")).sendKeys(Elements.Username, Keys.TAB, Elements.passwordIllegal_short, Keys.ENTER);
					
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

	public  void N_signUp_byEmail_passwordEmpty() throws InterruptedException {
		
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
				
			//enter login+password**
			driver.findElement(By.xpath(Elements.Terms_uncheckedVi)).click();
			driver.findElement(By.id("i_signup-email")).sendKeys(Elements.Username, Keys.TAB, "", Keys.ENTER);
					
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