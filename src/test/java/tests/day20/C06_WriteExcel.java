package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C06_WriteExcel {

   @Test
    public void test01() throws IOException {
       //ulkeler exceline 5.sutun olarak Nufus sutunu ekleyelim
       //3.satirdaki ulkenin nufusunu  1000000 yapalım
       //1-dosyaya ulasalim
       String path="src/test/java/resources/ulkeler.xlsx";
       FileInputStream fis= new FileInputStream(path);

// 2.class'da calismak icin dosyanin bir kopyasi alan workbook olusturalim

     Workbook workbook=WorkbookFactory.create(fis);

   // 3- dosyada yapmak istedigimiz degisiklikleri
      //kopya workbook'da yapalim
       // ilk satirin 5.hucresine Nufus basligını yazdıracağım
     workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("NUFUS");

       // 3.satirdaki ulkenin nufusunu 1000000 yapalim
     workbook.getSheet("Sayfa1").getRow(2).createCell(4).setCellValue("1000000");

// 4- kopyada yaptgimiz degisiklikleri ana dosyaya kaydedelim

      FileOutputStream fos= new FileOutputStream(path);
      workbook.write(fos);
   }


}
