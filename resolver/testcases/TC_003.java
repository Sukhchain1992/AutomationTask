package resolver.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import resolver.BaseClass;

public class TC_003 extends BaseClass {
    @Test
    public void task3() {
        performClick(By.id("dropdownMenuButton"),"Option 1");
        String defaultSelectedValue=extractValue(By.id("dropdownMenuButton"));
        Assert.assertTrue(defaultSelectedValue.contains("Option 1"));
        System.out.println("Default Selected Value in Test 3 = "+defaultSelectedValue);
        String selectOption3=extractValues(By.className("dropdown-item"),2);
        driver.findElements(By.className("dropdown-item")).get(2).click();
        System.out.println("Option Selected = "+ selectOption3);
    }
}
