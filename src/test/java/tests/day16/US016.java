package tests.day16;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProjePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.CrossDriver.driver;

public class US016 {
    @Test
    public void Test01(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        ProjePage projePage=new ProjePage();

      Actions actions = new Actions(Driver.getDriver());
       projePage.ilkLoginLinki.click();

projePage.usernameBox.click();
projePage.usernameBox.sendKeys("ahmtaylmz1@gmail.com");
projePage.passwordBox.click();
projePage.passwordBox.sendKeys("753159abc");

projePage.loginButton.click();


projePage.signOutLogin.click();
projePage.storeManagerButton.click();
        ReusableMethods.waitFor(3);
actions.sendKeys(Keys.PAGE_DOWN).perform();
        projePage.customersButtonu.click();

        Assert.assertTrue(projePage.getCustomersButtonu.isDisplayed());

    }

@Test
    public void Test02(){
    Driver.getDriver().get(ConfigReader.getProperty("url"));

    ProjePage projePage=new ProjePage();

    Actions actions = new Actions(Driver.getDriver());
    projePage.ilkLoginLinki.click();

    projePage.usernameBox.click();
    projePage.usernameBox.sendKeys("ahmtaylmz1@gmail.com");
    projePage.passwordBox.click();
    projePage.passwordBox.sendKeys("753159abc");

    projePage.loginButton.click();


    projePage.signOutLogin.click();
    projePage.storeManagerButton.click();
    ReusableMethods.waitFor(5);
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    projePage.customersButtonu.click();

    projePage.pdfButton.click();

    actions.sendKeys(Keys.PAGE_DOWN).perform();
    ReusableMethods.waitFor(5);
    projePage.excelButton.click();
   // actions.sendKeys(Keys.PAGE_DOWN).perform();
    ReusableMethods.waitFor(5);

     projePage.csvButton.click();


}


@Test
    public void Test03(){
    Driver.getDriver().get(ConfigReader.getProperty("url"));

    ProjePage projePage=new ProjePage();
    Faker faker=new Faker();
    Actions actions = new Actions(Driver.getDriver());
    projePage.ilkLoginLinki.click();

    projePage.usernameBox.click();
    projePage.usernameBox.sendKeys("ahmtaylmz1@gmail.com");
    projePage.passwordBox.click();
    projePage.passwordBox.sendKeys("753159abc");

    projePage.loginButton.click();


    projePage.signOutLogin.click();
    projePage.storeManagerButton.click();
    ReusableMethods.waitFor(5);
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    projePage.customersButtonu.click();
    actions.sendKeys(Keys.PAGE_DOWN).perform();

    projePage.addNewButton.click();
   // projePage.userNameCustomer.click();

    actions.sendKeys(Keys.PAGE_DOWN).perform();

   // actions.click(projePage.userNameCustomer)

          projePage.userNameCustomer.click();



         actions.sendKeys(faker.name().username())
            .sendKeys(Keys.TAB)
            .sendKeys(faker.internet().emailAddress())
            .sendKeys(Keys.TAB)
            .sendKeys(faker.name().firstName())
            .sendKeys(Keys.TAB)
            .sendKeys(faker.name().lastName()).perform();


    // projePage.userNameCustomer.sendKeys(faker.name().username());
    Driver.closeDriver();
}


}
