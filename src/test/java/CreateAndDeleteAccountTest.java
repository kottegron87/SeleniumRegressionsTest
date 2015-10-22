import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAndDeleteAccountTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://login.salesforce.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCreateAccount() throws Exception {
    driver.get(baseUrl + "/?locale=se");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("kottegron87");
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("mathiaswestman1987@gmail.com");
    driver.findElement(By.id("Login")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|EU5$00D24000000qCz5_00524000001Vx0u_02_afec93c7-5654-431f-bd3f-dd36c96ed5da|4| | ]]
    driver.findElement(By.linkText("Accounts")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|EU5$00D24000000qCz5_00524000001Vx0u_02_afec93c7-5654-431f-bd3f-dd36c96ed5da|4| | ]]
    driver.findElement(By.name("new")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|EU5$00D24000000qCz5_00524000001Vx0u_02_afec93c7-5654-431f-bd3f-dd36c96ed5da|4| | ]]
    driver.findElement(By.id("acc2")).clear();
    driver.findElement(By.id("acc2")).sendKeys("mathiasAccount");
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|EU5$00D24000000qCz5_00524000001Vx0u_02_afec93c7-5654-431f-bd3f-dd36c96ed5da|4| | ]]
    driver.findElement(By.cssSelector("#bottomButtonRow > input[name=\"save\"]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|EU5$00D24000000qCz5_00524000001Vx0u_02_afec93c7-5654-431f-bd3f-dd36c96ed5da|4| | ]]
    driver.findElement(By.linkText("Accounts")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|EU5$00D24000000qCz5_00524000001Vx0u_02_afec93c7-5654-431f-bd3f-dd36c96ed5da|4| | ]]
    driver.findElement(By.cssSelector("th..dataCell   > a")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|EU5$00D24000000qCz5_00524000001Vx0u_02_afec93c7-5654-431f-bd3f-dd36c96ed5da|4| | ]]
    driver.findElement(By.name("delete")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|EU5$00D24000000qCz5_00524000001Vx0u_02_afec93c7-5654-431f-bd3f-dd36c96ed5da|4| | ]]
    driver.findElement(By.name("delete")).click();
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
