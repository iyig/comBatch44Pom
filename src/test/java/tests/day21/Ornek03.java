package tests.day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class Ornek03 {

    @Test
    public void test() {
        Driver.getDriver().get("https://w3schools.com");

        WebElement learnHtml = Driver.getDriver().findElement(By.linkText("Learn HTML"));
        String arkaplanRengi = learnHtml.getCssValue("background-color");

        System.out.println(arkaplanRengi);
        boolean esitMi = arkaplanRengi.equals("rgba(4, 170, 109, 1)");
        Assert.assertTrue(esitMi);


    }
}