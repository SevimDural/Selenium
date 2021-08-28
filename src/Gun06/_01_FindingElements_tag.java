package Gun06;

import utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class _01_FindingElements_tag extends BaseStaticDriver {
    public static void main(String[] args) {
        //BaseStaticDriver in tum static kısmı buraya gelmiş oldu
        driver.get("http://www.practiceselenium.com"); // siteyi açıyoruz

        List<WebElement> liListe= driver.findElements(By.tagName("lii")); // // tagname yani etiketi li olan bütün elemalar
        for(WebElement e: liListe)
        {
            System.out.println(e.getText());
        }

       BekleVeKapat();
    }
}
