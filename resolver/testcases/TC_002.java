package resolver.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import resolver.BaseClass;

public class TC_002 extends BaseClass {
    @Test
    public void task2() {
        int actualValue=findSize(By.className("list-group-item"));
        Assert.assertEquals(actualValue,3);
        String secondListItemValue=extractValues(By.className("list-group-item"),1);
        System.out.println("second list item's value = " + secondListItemValue);
        Assert.assertTrue(secondListItemValue.contains("List Item 2"));
        String secondListItemBadgeValue=extractValues(By.className("badge"),1);
        System.out.println("second list item's badge value = " + secondListItemBadgeValue);
        Assert.assertTrue(secondListItemBadgeValue.contains("6"));
    }
}
