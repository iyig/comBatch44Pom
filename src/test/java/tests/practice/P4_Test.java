package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class P4_Test {

    @Test
    public void amazonTest(String kelime){
        WebDriver driver = null;

        driver.get("http://amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(kelime + Keys.ENTER);
    }


}
