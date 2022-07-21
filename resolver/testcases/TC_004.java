package resolver.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import resolver.BaseClass;

public class TC_004 extends BaseClass {
    @Test
    public void task4() {
        Assert.assertTrue(driver.findElement(By.xpath("//button[contains(@class,\"btn-primary\")]")).isEnabled(), "first button is enabled");
        boolean primaryButton = driver.findElement(By.xpath("//button[contains(@class,\"btn-primary\")]")).isEnabled();
        System.out.println("Primary Button is Enabled = "+ primaryButton);
        boolean secondaryButton = driver.findElement(By.xpath("//button[contains(@class,\"btn-secondary\")]")).isEnabled();
        System.out.println("Secondary Button is Disabled = "+ secondaryButton);
    }
}
