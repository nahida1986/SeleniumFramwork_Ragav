package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Google_search_Page_object_model;




public class test1_googleSearch {
	
	public static WebDriver driver = null;
	
	
 @BeforeTest
	public void SetUpTest() {
	try {WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 driver.get("https://www.google.com/");
	} catch(Exception exp) {
		System.out.println("masege " +exp.getMessage());
		
	}
	}

	
   @Test (priority = 0)
	public void googleSearch () throws InterruptedException {
		
	  try { Google_search_Page_object_model searPage = new Google_search_Page_object_model(driver);
		
		 searPage.setTestinSearchBox("A b");
		 TakesScreenshot ts =(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(src, new File("./ScreenShort/google.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 Thread.sleep(2000);
		 searPage.clickButton();
	  }catch (Exception exp) {
		  System.out.println("my massage" + exp.getMessage());
	  }
	  
		 }
	


   @Test (priority =1)
   public void f1 ()  {
	 try {  Google_search_Page_object_model searPage = new Google_search_Page_object_model(driver);
	 
           searPage.linkClick();
	 }catch(Exception exp1) {
	
		System.out.println("my expetion " + exp1.getMessage()); 
	 }
	   
   
	   
   }


   @AfterTest
   
   public void tearDownTest( ) {
	//Reporter.log("test Successfull");  
	   driver.close();
	   
	   
   }
   }