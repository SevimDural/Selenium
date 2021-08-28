package Proje3;

import Utils.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ZeroUtil extends BaseUtil {

    public static void zeroDemoLogin( ) {

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement userName = driver.findElement(By.cssSelector("[id=user_login]"));
        userName.sendKeys("username");

        WebElement password = driver.findElement(By.cssSelector("[id=user_password]"));
        password.sendKeys("password");

        WebElement signin = driver.findElement(By.cssSelector("[id=user_remember_me]"));
        signin.click();

        WebElement submit = driver.findElement(By.cssSelector("[name=submit]"));
        submit.click();

        WebElement detailsButon = driver.findElement(By.cssSelector("[id=details-button]"));
        detailsButon.click();

        WebElement link = driver.findElement(By.cssSelector("[id=proceed-link]"));
        link.click();


    }

    public static void random(List<WebElement> accList) {
        int randomList = accList.size();
        Random random = new Random();
        int randomSelect = random.nextInt(randomList);
        accList.get(randomSelect).click();
    }
}
