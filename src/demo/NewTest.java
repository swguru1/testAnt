package demo;		
	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;	
	    
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.chrome.driver","./lib/chromedriver.exe");
		    driver = new ChromeDriver();  
		    
		}
		
		@Test				
		public void testEasy() {	
			driver.get("http://www.google.com");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Google123")); 		
		}	
			
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}
