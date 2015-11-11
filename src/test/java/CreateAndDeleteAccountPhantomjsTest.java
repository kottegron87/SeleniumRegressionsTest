//package com.example.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.thoughtworks.selenium.webdriven.commands.MouseEvent;

public class CreateAndDeleteAccountPhantomjsTest {
	private WebDriver driver;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new PhantomJSDriver();
		((JavascriptExecutor) driver).executeScript("window.alert = function(msg){};");
		((JavascriptExecutor) driver).executeScript("window.confirm = function(msg){return true;};");
		
	
		System.out.println(((RemoteWebDriver) driver).getCapabilities());
       
        
		//driver = new PhantomJSDriver();
		//driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws Exception {

		//Login to Org
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("kottegron87");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("mathiaswestman1987@gmail.com");
		driver.findElement(By.id("Login")).click();

		//Navigate to Accounts and Create a new record
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.name("new")).click();
		driver.findElement(By.id("acc2")).clear();
		driver.findElement(By.id("acc2")).sendKeys("PhantomJSRecordGeni");
		driver.findElement(By.name("save")).click();
	//	driver.findElement(By.cssSelector("#bottomButtonRow > input[name=\"save\"]")).click();
		
	    
		driver.findElement(By.name("delete"));
			
		/*PhantomJS page source*/
	   //  System.out.println(driver.getPageSource());
		    
	      /*take picture*/
	     //  File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	     //  FileUtils.copyFile(srcFile, new File("C:\\Users\\mwe\\Desktop\\delete" + ".png"));
	     
   
		//driver.findElement(By.name("delete")).click();		
	  //  assertTrue(closeAlertAndGetItsText().matches("^Are you sure[\\s\\S]$"));
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
