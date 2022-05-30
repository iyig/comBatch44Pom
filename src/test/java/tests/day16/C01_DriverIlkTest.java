package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest {

                         // Driver classi sayesinde bizim eski driver oldu
                        // artik driver'a ihtiyac varsa Driver.getDriver() yazacagiz
    @Test
    public void test01(){
    // amazona gidelim
    Driver.getDriver().get("https://www.amazon.com");
                     // amazona gittigimizi test edelim

    String actualTitle=Driver.getDriver().getTitle();
  String actualUrl=Driver.getDriver().getCurrentUrl();
    Assert.assertTrue(actualTitle.contains("Amazon"));

                          // Driver.getDriver methodu her calistiginda
                         //driver=new chromeDriver(); komutundan oturu yeni bir driver olusturuyor
                        // Biz Driver classdan getDriveri ilk calıştirdigimizda new atamasi olsun
                       // sonraki calistirmalardan atama olmasin istiyoruz
                      //bunun icin driver=new Chrome Driver() satiri bir if blogu icine alacagiz
    Driver.closeDriver();
}
    @Test
    public void test02(){
                    // bestbuy anasayfa gidelim
                    // bestbuya gittigimizdi test edelim
    Driver.getDriver().get("https://www.bestbuy.com");

    String actualurl=Driver.getDriver().getCurrentUrl();
    Assert.assertTrue(actualurl.contains("bestbuy"));

    Driver.closeDriver();
}
}
