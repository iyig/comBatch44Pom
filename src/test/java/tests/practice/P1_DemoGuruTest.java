package tests.practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P1_DemoGuruPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;


public class P1_DemoGuruTest extends TestBaseRapor {

/*
 http:// demo.guru99.com/test/drag_drop.html url e git

 DEBİT SİDE da Account bölümüne BANK butonu surukle ve birak
 CREDİT SİDE  da Accounmt bölümüne SALES butonu surukle ve birak
 DEBİT SİDE  da Amount bölümüne 5000 butonu sürukle ve birak
 CREDİT SİDE  da Amount bölümüne ise kinici 5000 butunu sürükle ve birak
 Perfect butonun görüntülendiğini doğrulayın
 */
 @Test
 public void    test() throws InterruptedException {
extentTest=extentReports.createTest("demoGuru Test", "drag-droop Test");
     Driver.getDriver().get(ConfigReader.getProperty("demoGuruUrl"));
extentTest.info("istenilen ur e gidildi");
 Actions actions=new Actions(Driver.getDriver());

     P1_DemoGuruPage p1_demoGuruPage=new P1_DemoGuruPage();
     Thread.sleep(1000);
   actions.sendKeys(Keys.PAGE_DOWN).perform();
   actions.dragAndDrop(p1_demoGuruPage.bankButonu,p1_demoGuruPage.debitsideAccount)
           .dragAndDrop(p1_demoGuruPage.salesButonu,p1_demoGuruPage.creditSideAccount)
           .dragAndDrop(p1_demoGuruPage.firstnum5000Butonu,p1_demoGuruPage.debitsideAmount)
           .dragAndDrop(p1_demoGuruPage.secondnum5000Butonu,p1_demoGuruPage.creditsideAmount).
     sendKeys(Keys.PAGE_DOWN).perform();
extentTest.info("webElementler istenile yere gonderildi");
     Assert.assertTrue(p1_demoGuruPage.perfectYazisi.isDisplayed());
    extentTest.pass("Perfect yazisi gorüldü");
     ReusableMethods.waitFor(4);
 }





}
