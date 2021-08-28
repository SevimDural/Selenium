package Proje1.Part1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMe {

    /*

        1) Bu siteye gidin. ->  http://demoqa.com/text-box

        2) Full Name kısmına "Automation" girin.

        3) Email kısmına "Testing" girin.

        4) Current Address kısmına "Testing Current Address" girin.

        5) Permanent Address kısmına "Testing Permanent Address" girin.

        6) Submit butonuna tıklayınız.

        7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

        8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demoqa.com/text-box");

        WebElement fullname=driver.findElement(By.id("userName"));
        fullname.sendKeys("Automation");

        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("Testing@gmail.com");

        WebElement current=driver.findElement(By.id("currentAddress"));
        current.sendKeys("Testing Current Address");

        WebElement permanent=driver.findElement(By.id("permanentAddress"));
        permanent.sendKeys("Testing Permanent Address");

        WebElement button = driver.findElement(By.id("submit"));
        button.click();

        WebElement fullNameTest = driver.findElement(By.id("name"));
        String menuTxt=fullNameTest.getText();
        Assert.assertEquals("Name:Automation",menuTxt);

        WebElement fullNameTest1 = driver.findElement(By.id("email"));
        String menuTxt1=fullNameTest1.getText();
        Assert.assertEquals("Email:Testing@gmail.com",menuTxt1);

        Thread.sleep(3000);
        driver.quit();
    }
}
