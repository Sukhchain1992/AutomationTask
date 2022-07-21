package resolver.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import resolver.BaseClass;

public class TC_006 extends BaseClass {
    @Test
    public void task6() {
        String anyCellValue=extractValue(By.xpath("//td"));
        System.out.println("Any cell Value=" + anyCellValue);
        String cellValue1 = extractValue(By.xpath("//table/tbody/tr[3]/td[3]"));
        Assert.assertTrue(cellValue1.contains("Ventosanzap"));
        System.out.println("cell Value(2,2)= " + cellValue1);

    }
}
