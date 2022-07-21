package resolver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseClass {
    public static WebDriver driver;

    @BeforeMethod
    static public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("C:\\QE - index.html");
    }

    public void assertValuePresent(By element, String data) {
        Assert.assertTrue(driver.findElement(element).isDisplayed());
        System.out.println(data);
    }

    public void enterValues(By element, String data) {
        System.out.println("Enter value=" + data);
        driver.findElement(element).sendKeys(data);
    }

    public void performClick(By element, String data) {
        driver.findElement(element).click();
        System.out.println("Clicking an element=" + data);
    }

    public int findSize(By element) {
        int Size = driver.findElements(element).size();
        System.out.println("List of Items in Test2 =" + Size);
        return Size;
    }

    public String extractValues(By element, int index) {
        String value = driver.findElements(element).get(index).getText();
        return value;
    }

    public String extractValue(By element) {
        String optionValue = driver.findElement(element).getText();
        return optionValue;
    }

    public void waittillelementisvisible(long timeOutInSeconds, By element) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, timeOutInSeconds);
        System.out.println("Waiting for element to be visible");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(element));
        System.out.println("Element is getting visible");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}



