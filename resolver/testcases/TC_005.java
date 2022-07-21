package resolver.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import resolver.BaseClass;

public class TC_005 extends BaseClass {
    @Test
    public void task5() {
        waittillelementisvisible(60, By.id("test5-button"));
        performClick(By.id("test5-button"),"Button");
        Assert.assertTrue(driver.findElement(By.id("test5-alert")).getText().contains("You clicked a button!"), "Success message is dispalyed");
        Assert.assertFalse(driver.findElement(By.id("test5-button")).isEnabled(), "button is disabled");
    }
}
