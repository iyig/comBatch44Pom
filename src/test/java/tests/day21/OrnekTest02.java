package tests.day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

public class OrnekTest02 {
@Test
public void test() throws InterruptedException {



    Driver.getDriver().get("https://www.tutorialsteacher.com/codeeditor?cid=js-1");

 Driver.getDriver().switchTo().alert().accept();
    Thread.sleep(500);
 Driver.getDriver().switchTo().alert().accept();
    Thread.sleep(500);
    Driver.getDriver().switchTo().alert().accept();

   Thread.sleep(3000);
    WebElement homeLinki=Driver.getDriver().findElement(By.xpath("//a[title='TutorialsTeacher.com Home']"));
    homeLinki.click();
}


}
