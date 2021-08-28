package Gun16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;
import java.util.Set;

public class _07_closing extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev");
        String anaSayfaIdsi = driver.getWindowHandle();  // anasayfanin ID sini aldik


        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement s:linkler)
        {
            s.click();
        }


        Set<String> windowIdLer=driver.getWindowHandles();
        for (String id:windowIdLer)
        {
            if (id.equals(anaSayfaIdsi))  continue;

            System.out.println("id= "+ id);
            driver.switchTo().window(id);
            driver.close();
            Bekle(2);
        }


        driver.switchTo().window(anaSayfaIdsi).getTitle();
        System.out.println("driver.getTitle()= "+driver.getTitle());

        BekleVeKapat();

    }
}
