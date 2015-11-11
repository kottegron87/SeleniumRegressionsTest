////package com.example.tests;
//
//import java.util.regex.Pattern;
//import java.io.File;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.commons.io.FileUtils;
//import org.junit.*;
//import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
//import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class CreateAccountFirefoxTest {
//  private WebDriver driver;
//  private String baseUrl;
//  private boolean acceptNextAlert = true;
//  private StringBuffer verificationErrors = new StringBuffer();
//
//  @Before
//  public void setUp() throws Exception {
//    driver = new FirefoxDriver();
//    baseUrl = "https://www.google.se/";
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//  }
//
//  @Test
//  public void testFirefox() throws Exception {
//    driver.get(baseUrl + "/search?q=salesforce+login&ie=utf-8&oe=utf-8&gws_rd=cr&ei=Aew5VuquFsOqswG6z4n4Bg");
//    driver.findElement(By.linkText("Salesforce: Logga in")).click();
//    driver.findElement(By.id("password")).clear();
//    driver.findElement(By.id("password")).sendKeys("kottegron87");
//    driver.findElement(By.id("username")).clear();
//    driver.findElement(By.id("username")).sendKeys("mathiaswestman1987@gmail.com");
//    driver.findElement(By.id("Login")).click();
//    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|EU5$00D24000000qCz5_00524000001Vx0u_02_f98538be-d427-43b1-9b78-355f55b920cc|4| | ]]
//    driver.findElement(By.linkText("Accounts")).click();
//    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|EU5$00D24000000qCz5_00524000001Vx0u_02_f98538be-d427-43b1-9b78-355f55b920cc|4| | ]]
//    driver.findElement(By.name("new")).click();
//    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|EU5$00D24000000qCz5_00524000001Vx0u_02_f98538be-d427-43b1-9b78-355f55b920cc|4| | ]]
//    driver.findElement(By.id("acc2")).clear();
//    driver.findElement(By.id("acc2")).sendKeys("Firefox");
//    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|EU5$00D24000000qCz5_00524000001Vx0u_02_f98538be-d427-43b1-9b78-355f55b920cc|4| | ]]
//    driver.findElement(By.cssSelector("#bottomButtonRow > input[name=\"save\"]")).click();
//    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|EU5$00D24000000qCz5_00524000001Vx0u_02_f98538be-d427-43b1-9b78-355f55b920cc|4| | ]]
//   // driver.findElement(By.linkText("Accounts")).click();
//    
//    
//    driver.findElement(By.name("delete")).click();
//	System.out.println(((RemoteWebDriver) driver).getCapabilities());
//    File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//    FileUtils.copyFile(srcFile, new File("C:\\Users\\mwe\\Desktop\\delete" + ".png"));
//    assertTrue(closeAlertAndGetItsText().matches("^Are you sure[\\s\\S]$"));
//  }
//
//  @After
//  public void tearDown() throws Exception {
//    driver.quit();
//    String verificationErrorString = verificationErrors.toString();
//    if (!"".equals(verificationErrorString)) {
//      fail(verificationErrorString);
//    }
//  }
//
//  private boolean isElementPresent(By by) {
//    try {
//      driver.findElement(by);
//      return true;
//    } catch (NoSuchElementException e) {
//      return false;
//    }
//  }
//
//  private boolean isAlertPresent() {
//    try {
//      driver.switchTo().alert();
//      return true;
//    } catch (NoAlertPresentException e) {
//      return false;
//    }
//  }
//
//  private String closeAlertAndGetItsText() {
//    try {
//      Alert alert = driver.switchTo().alert();
//      String alertText = alert.getText();
//      if (acceptNextAlert) {
//        alert.accept();
//      } else {
//        alert.dismiss();
//      }
//      return alertText;
//    } finally {
//      acceptNextAlert = true;
//    }
//  }
//}
