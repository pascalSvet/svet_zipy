package zipy_test_recommendedThumbs;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import zipy_elements.*;

public class Tests_recommendedThumbs_il_sampleOfFail extends Tests_recommendedThumbs_MAIN {
	
	
	//Test - opening thumbnail #1 in dailyDeal (Israel)
	@Test		
	public  void Tests_il_sample() throws Exception {
		System.out.println("Running test for Israel site - dailyDeal - opening thumbnail #1");		

		//open the sample product
		driver.get("https://www.zipy.co.il/s/amazon/tie-clips/3888391/");
		wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(ElementsLogin.Zipy_il)));

		Thread.sleep(5000);
		// if we managed to open the product correctly, there is no message of "not found" on the page:
		Assert.assertTrue(driver.findElements(By.xpath(ElementsBuying.Product_notFound)).isEmpty());
	}
	
}
