package Gun11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

//
/*
     select class ı
     görünen text ile seçim için: selectByVisibleText
     valueden seçim için        : selectByValue
     sırasından seçim için      : selectByIndex
 */
/*
  Senaryo :
  1- https://www.ebay.com/ sitesini açın
  2- Arama seçim menüsünden 2984  değerli elemanı seçtiriniz. selectByValue
  3- Arama işlemini yaptırınız.
 */
//
public class SelectSoru extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com");
        driver.manage().deleteAllCookies();  // butun cookisleri sildik


        WebElement ddMenu=driver.findElement(By.id("gh-cat"));

        Select menu=new Select(ddMenu);
        menu.selectByValue("2984");

        WebElement searchButton=driver.findElement(By.id("gh-btn"));
        searchButton.click();

        Bekle(10);
        BekleVeKapat();




    }


}
