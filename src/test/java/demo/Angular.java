package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/**
 * Created by Kuldeep.Kumar on 10/04/2017.
 */
public class Angular {
    //  http://www.automationtestinghub.com/selenium-3-0-launch-firefox-with-geckodriver/
   //   http://www.automationtestinghub.com/selenium-chromedriver/
    WebDriver driver;
    @BeforeTest
    public void setUp()  {
/*      System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Users\\Kuldeep.Kumar\\AppData\\Local\\Mozilla Firefox\\firefox.exe"); //This is the location where you have installed Firefox on your machine
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("moz:firefoxOptions", options);
        //set more capabilities as per your requirements
        FirefoxDriver driver = new FirefoxDriver(capabilities);
*/
//      https://sites.google.com/a/chromium.org/chromedriver/capabilities
        System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("disable-infobars");
//        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://uat.electricityinfo.co.nz"); //sample URL
//      System.setProperty("webdriver.ie.driver", "E:\\drivers\\IEDriverServer.exe");
//        WebDriver driver = new InternetExplorerDriver();
//        driver.get("https://uat.electricityinfo.co.nz"); //sample URL
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/nav[1]/ul/li[2]/a/i")).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 60, 100);
        wait.until(angularHasFinishedProcessing());
        driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div/div/div/wits-ajax-search-form/form/footer/div[2]/input")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div/div/div/wits-ajax-search-form/form/footer/div[2]/a[1]")).click();
    }
    @Test
    public void launch() {
    System.out.println("Test");
//        driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/nav[1]/ul/li[2]/a/i")).click();
    }
    public static ExpectedCondition<Boolean> angularHasFinishedProcessing() {
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return Boolean.valueOf(((JavascriptExecutor) driver).executeScript("return (window.angular !== undefined) && (angular.element(document).injector() !== undefined) && (angular.element(document).injector().get('$http').pendingRequests.length === 0)").toString());
            }
        };
    }
    public WebDriver getDriver(){
        return driver ;
    }
}
