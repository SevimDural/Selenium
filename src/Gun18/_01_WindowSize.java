package Gun18;

import Utils.BaseStaticDriver;
import org.openqa.selenium.Dimension;

public class _01_WindowSize extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.manage().window().maximize(); // Ekranı tam hale getiriyor.

        Bekle(3);  // Ekranı yeni ölçülere göre set etme
        Dimension yeniOlcu=new Dimension(400, 600);
        driver.manage().window().setSize(yeniOlcu);

        Bekle(3);
        Dimension suAnkiOculer=driver.manage().window().getSize();
        System.out.println("suAnkiOculer.width = " + suAnkiOculer.width);
        System.out.println("suAnkiOculer.height = " + suAnkiOculer.height);

        BekleVeKapat();
    }
}
