package Gun16;
//https://www.selenium.dev/
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

import java.util.List;
import java.util.Set;

public class _05_Swichwindow extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev");

        List <WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement s:linkler)
        {
            s.click();
        }


        Set<String> windowIdLer=driver.getWindowHandles();
        for (String id:windowIdLer)
        {
            System.out.println("id= "+ id);
        }


BekleVeKapat();
    }
}
