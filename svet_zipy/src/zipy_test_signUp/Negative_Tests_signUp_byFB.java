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

public class Negative_Tests_signUp_byFB extends Tests_main {
	
	
	@Test		
	public  void N_signUp_byFB_EnteredByUser() throws InterruptedException {
			
		try {
			//press signup button		
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", driver.findElement(By.xpath(Elements.SignUp_button)));
	
			//choose signup by google
			driver.findElement(By.xpath(Elements.SignUp_google_button)).click();
			WebDriverWait wait = new WebDriverWait(driver, 20);	
					
			// enter google account identifiers: 		
					System.out.println("Please enter your gmail or phone from your google account:   ");
					Scanner k= new Scanner(System.in);
					String  Temp_google= k.nextLine();	
					System.out.println("Please enter your password:   ");
					Scanner m= new Scanner(System.in);
					String  Temp_googlePassword= m.nextLine();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_google_field)))
			.sendKeys(Temp_google, Keys.ENTER);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Elements.SignUp_googlePassword_field)))
			.sendKeys(Temp_googlePassword, Keys.ENTER);
					
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
