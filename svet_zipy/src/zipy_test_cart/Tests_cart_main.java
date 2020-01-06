package zipy_test_cart;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import zipy_elements.*;
	
	public class Tests_cart_main {
	
	static WebDriver driver;
	boolean errorCaught;
	Boolean logged;
	WebDriverWait wait;
	
	@Before 
	public void closeEnteringPopUp() throws Exception {	
		
		

		errorCaught = false;
		System.setProperty("webdriver.chrome.driver","src/zipy_resources/chromedriver.exe");
		driver = new ChromeDriver();
		
		wait = new WebDriverWait(driver, 15);	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		//enter site
		driver.get(ElementsLogin.Zipy_il);
		
		//close the pop-up window if exist
		if (driver.findElements(By.xpath(ElementsLogin.Popup_welcome_close)).size() != 0){
			driver.findElement(By.xpath(ElementsLogin.Popup_welcome_close)).click();
		}
		
		//login  
		Tests_functions.logIn(driver);
		
	}
	
	
	
	@After	
	public void cartEnding() throws InterruptedException {	
		
		// Closing all windows of the browser, opened by the test.
		driver.quit();			 
	}	
	/*
	@AfterClass		
	public static void killDriverProcess() throws IOException, InterruptedException {		
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");	// Killing the chromedriver process in the end of the test.
        Thread.sleep(500); 
        
	}*/

}
