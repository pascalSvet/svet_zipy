package zipy_test_recommendedThumbs;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import zipy_elements.*;

@RunWith(Parameterized.class)
public class Tests_recommendedThumbs_gr_populars extends Tests_recommendedThumbs_MAIN {
	
	private static String thumbnail;
	private static String number;

	public Tests_recommendedThumbs_gr_populars(String thumbnail, String number) {
		super();
		this.thumbnail = thumbnail;
		this.number = number;
	}		
	//our parameters to thumbnails
	@Parameterized.Parameters
	public static Collection thumbnails(){
		return Arrays.asList( new Object[][]{
						{ElementsRecommended.populars_1, "1"},	//thumbnail #1
						{ElementsRecommended.populars_2, "2"},	//thumbnail #2
						{ElementsRecommended.populars_3, "3"},	//thumbnail #3
						{ElementsRecommended.populars_4, "4"},	//thumbnail #4
						{ElementsRecommended.populars_5, "5"},	//thumbnail #5
						{ElementsRecommended.populars_6, "6"},	//thumbnail #6
						});
	}
	
	
	
	//Test - opening thumbnails in populars (Greece)
	@Test		
	public  void Tests_gr_popularsThumbs() throws Exception {
		System.out.println("Running test for Greece site - dailyDeal - opening thumbnail #" + number);		

		//open the site
		driver.get(ElementsLogin.Zipy_gr);
		
		//click thumbnail
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(thumbnail))).click();		
		wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(ElementsLogin.Zipy_gr)));
		
		// if we managed to open the product correctly, there is no message of "not found" on the page:
		Assert.assertTrue(driver.findElements(By.xpath(ElementsBuying.Product_notFound)).isEmpty());
	}
	

}
