package zipy_test_signUp;
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
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import zipy_elements.Elements;

	
	public class Tests_signUp_main {
	
	static WebDriver driver;
	boolean errorCaught;
	Boolean logged;


	
	@Before 
	public void closeEnteringPopUp() {	
		
		errorCaught = false;
		System.setProperty("webdriver.chrome.driver","src/zipy_resources/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		//enter site
		driver.get(Elements.Zipy_il);
		
		//close the pop-up window if exist
		if (driver.findElements(By.xpath(Elements.Popup_welcome_close)).size() != 0){
			driver.findElement(By.xpath(Elements.Popup_welcome_close)).click();
		}
		
		
	}
	
	

	@After	
	public void closeBrowser() {		
		driver.quit();	// Closing all windows of the browser, opened by the test.		 
	}	
	/*
	@AfterClass		
	public static void killDriverProcess() throws IOException, InterruptedException {		
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");	// Killing the chromedriver process in the end of the test.
        Thread.sleep(500); 
        
	}*/

}
