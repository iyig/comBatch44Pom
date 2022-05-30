package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class C05_ExceliMapeYukleme {
    @Test
    public void test01(){
        // dosya yolu ve sayfa ismi verilen bie excel sheet'i map olarak kaydeden
        // reusable bir method olusturalim
        String path = "src/test/java/pages/resources/ulkeler.xlsx";
       String sayfaAdi="sayfa1";
//ReusableMethods.mapOlustur(path,sayfaAdi);


        System.out.println(ReusableMethodsExcel.mapOlustur(path,sayfaAdi));


        Map<String,String> ulkelerMap= ReusableMethodsExcel.mapOlustur(path,sayfaAdi);


        // olusturdugumuz map'i kullanarak Turkey'in bilgilerini yazdirin

        System.out.println(ulkelerMap.get("Turkey"));
       // Listede Netherlands oldugunu test edin

        Assert.assertTrue(ulkelerMap.containsKey("Netherlands"));
    }
}