package resolver.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import resolver.BaseClass;

public class TC_001 extends BaseClass {
@Test
    public void task1() {
        assertValuePresent(By.id("inputEmail"), "Email input is present");
        assertValuePresent(By.id("inputPassword"), "Password input is present");
        assertValuePresent(By.xpath("//button[@type=\"submit\"]"), "Login button is present");
        enterValues(By.id("inputEmail"), "bainssukh238@gmail.com");
        enterValues(By.id("inputPassword"), "Sukh@123");
        performClick(By.xpath("//button[@type=\"submit\"]"), "Submit");
    }

}
