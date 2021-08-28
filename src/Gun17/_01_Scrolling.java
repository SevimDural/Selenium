package Gun17;

import org.openqa.selenium.JavascriptExecutor;
import utils.BaseStaticDriver;

public class _01_Scrolling extends BaseStaticDriver {
    public static void main(String[] args) {
        /*
    Selenium da Sayfayı aşağı kaydırılması gereken durumlar vardır:
    Bunlar , sayfa kaydırıldıkça yüklenen elemanlar için

    Bu işlem javascript executer ile yapılır.Bu interface sayesinde
    sayfa kaydırma işlemi ve javascript komutları çalıştırılabilir
    sayfa üzerinde.

    hotels.com, https://p-del.co/
 */
        driver.get("https://triplebyte.com/");

        //JS komutlarini calistirmak icin once js degiskeni tanimladik!!

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
        // javascript komutu internetten bulunarak , executeScript metodu ile çalıştırıldı
        // window.scrollBy(0, 5000)  : window u kaydır x ve y miktarınca.
        // Burada sayfa 3000 pixel kaydırıldı.

        Bekle(2);

        js.executeScript("window.scrollBy(0,-500)");
        // Burada sayfa -500 pixel kaydırıldı.  - (eksi verildiğinden yukarı kaydırıldı.)

        Bekle(2);
        BekleVeKapat();


    }
}
