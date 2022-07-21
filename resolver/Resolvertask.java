package resolver;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
public class Resolvertask extends BaseClass{

    @Test(priority = 1)
    public void task1() {
        assertValuePresent(By.id("inputEmail"),"Email input is present");
        assertValuePresent(By.id("inputPassword"),"Password input is present");
        assertValuePresent(By.xpath("//button[@type=\"submit\"]"),"Login button is present");
        enterValues(By.id("inputEmail"),"bainssukh238@gmail.com");
        enterValues(By.id("inputPassword"),"Sukh@123");
        performClick(By.xpath("//button[@type=\"submit\"]"),"Submit");
    }

    @Test(priority = 2)
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

    @Test(priority = 3)
    public void task3() {
        performClick(By.id("dropdownMenuButton"),"Option 1");
        String defaultSelectedValue=extractValue(By.id("dropdownMenuButton"));
        Assert.assertTrue(defaultSelectedValue.contains("Option 1"));
        System.out.println("Default Selected Value in Test 3 = "+defaultSelectedValue);
        String selectOption3=extractValues(By.className("dropdown-item"),2);
        driver.findElements(By.className("dropdown-item")).get(2).click();
        System.out.println("Option Selected = "+ selectOption3);
    }

    @Test(priority = 4)
    public void task4() {
        Assert.assertTrue(driver.findElement(By.xpath("//button[contains(@class,\"btn-primary\")]")).isEnabled(), "first button is enabled");
        boolean primaryButton = driver.findElement(By.xpath("//button[contains(@class,\"btn-primary\")]")).isEnabled();
        System.out.println("Primary Button is Enabled = "+ primaryButton);
        boolean secondaryButton = driver.findElement(By.xpath("//button[contains(@class,\"btn-secondary\")]")).isEnabled();
        System.out.println("Secondary Button is Disabled = "+ secondaryButton);
    }

    @Test(priority = 5)
    public void task5() {
        waittillelementisvisible(60,By.id("test5-button"));
        performClick(By.id("test5-button"),"Button");
        Assert.assertTrue(driver.findElement(By.id("test5-alert")).getText().contains("You clicked a button!"), "Success message is dispalyed");
        Assert.assertFalse(driver.findElement(By.id("test5-button")).isEnabled(), "button is disabled");
    }

    @Test(priority = 6)
    public void task6() {
        String anyCellValue=extractValue(By.xpath("//td"));
        System.out.println("Any cell Value=" + anyCellValue);
        String cellValue1 = extractValue(By.xpath("//table/tbody/tr[3]/td[3]"));
        Assert.assertTrue(cellValue1.contains("Ventosanzap"));
        System.out.println("cell Value(2,2)= " + cellValue1);

    }

}
