package TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestNGClass {
	
	public WebDriver driver = null;	
	       String appUrl = "https://accounts.google.com";
	
	       void CreateChromeDriver()
	       {
	    		  System.setProperty("webdriver.chrome.driver", "E:\\Software\\exe\\chromedriver_win32\\chromedriver.exe");
	    		  driver = new ChromeDriver();	   
	       }
	       
	        @Test
	        public void GmailLogin() {
	        	
	        	CreateChromeDriver();
	        	
	        	// launch the chrome browser and open the application url
	        	driver.get("https://gmail.com");

	        	//maximize the browser window
	        	driver.manage().window().maximize();

	        	//declare and initialize the variable to store the expected title of the web page.
	        	String expectedTitle = "Gmail";
     
	        	//fetch the title of the web page and save it into a string variable
	        	String actualTitle = driver.getTitle();
	        	System.out.println("Before Assetion : " + expectedTitle + " - " + actualTitle);
	        	Assert.assertEquals(expectedTitle,actualTitle);
	    		//print out the result
	    		System.out.println("After Assertion " + expectedTitle + " - " + actualTitle + " Title matched ");


	        	//close the web browser
	        	driver.close();
	        	driver = null;	
	        }
	        
	        @Test
	        public void LaunchSwarnatheghi() {
	        	CreateChromeDriver();
	        	
	        	// launch the chrome browser and open the application url
	        	driver.get("http://swarnatheghiexports.com");

	        	//maximize the browser window
	        	driver.manage().window().maximize();

	        	//declare and initialize the variable to store the expected title of the web page.
	        	String expectedTitle = "Swarnatheghi";
     
	        	//fetch the title of the web page and save it into a string variable
	        	String actualTitle = driver.getTitle();
	        	System.out.println("Before Assetion : " + expectedTitle + " - " + actualTitle);
	        	Assert.assertEquals(expectedTitle,actualTitle);
	    		//print out the result
	    		System.out.println("After Assertion " + expectedTitle + " - " + actualTitle + " Title matched ");


	        	//close the web browser
	        	driver.close();
	        	driver = null;	
	        }    
}
