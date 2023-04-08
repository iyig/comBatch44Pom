package tests.day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.Set;

public class ornekTest {

@Test
    public void test() throws InterruptedException {

    Driver.getDriver().get("https://www.w3schools.com/colors/colors_picker.asp");
    WebElement facebookLinki = Driver.getDriver().findElement(By.xpath("//a[@title='Facebook']"));
facebookLinki.click();
    System.out.println(Driver.getDriver().getWindowHandles());
    Thread.sleep(3000);

    Set<String> handles=Driver.getDriver().getWindowHandles();
    Object[]array= handles.toArray();

    String sonSayfaninHandleDegeri= array[array.length-1].toString();


    array[array.length-1].toString();
    System.out.println(array[array.length-1].toString());
Driver.getDriver().switchTo().window( sonSayfaninHandleDegeri);
}

}
