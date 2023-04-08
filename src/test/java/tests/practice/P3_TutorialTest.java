package tests.practice;

import org.checkerframework.checker.signature.qual.DotSeparatedIdentifiersOrPrimitiveType;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P3_TutorialPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P3_TutorialTest {
/*
urlye gidin   https://tutorialsninja.com/demo/index.php?route=common/home"
Phones& PDAs e tıklayın
telefonların marka adını al
tüm elemanlar için ekle düğmesine tıklayın
siyah toplam eklenen sepet düğmesine tıklayın
görüntülenen listeden ve sepet listesinden isimleri karşılastırın
görüntülenen listede toplam fiyatın $583.19 olduğunu test edin
*/
@Test
    public void test(){

    Driver.getDriver().navigate().to(ConfigReader.getProperty("tutorialUrl"));
    P3_TutorialPage p3_tutorialPage=new P3_TutorialPage();

    //phones &PDAs tıklayın
    p3_tutorialPage.phonesPDAs.click();

    //telefonların marka adını al
    System.out.println("***görüntülenen isimler***");
    for(WebElement each: p3_tutorialPage.products){

        System.out.println(each.getText());
    }

// tüm elemanları için ekle düğmesini tıklayın

    p3_tutorialPage.addAllCart.stream().forEach(x-> x.click());

    //siyah toplam eklenen sepet düğmesine tıklayın


    p3_tutorialPage.clickBlackButton.click();
    //listenin isimlerini sepetten al
    System.out.println("***sepetteki isimler***");


    for(WebElement each: p3_tutorialPage.sepetList){
        System.out.println(each.getText());
    }
// görüntülenen listeden ve sepet listesinden isimleri karşılaştıran

    for(WebElement each : p3_tutorialPage.sepetList){
        Assert.assertTrue(each.isDisplayed(), "gorüntülenmedi...");


        //görüntülenen listede toplam fiyatın $583.19 olduğunu test edin
    }




}


}
