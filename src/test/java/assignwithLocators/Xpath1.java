package assignwithLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
    public static void main(String[] args) throws InterruptedException {
        /* Please go to amazon.com and locate elements below for 15 times. Due is next class
 locate elements by xpath using
-relative xpath
-Or/And
-Text
-Contains
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com/");
//        WebElement search=driver.findElement(By.xpath("//input[@aria-label='Search']"));
//        search.sendKeys("car tools");
//        driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("book");
//        driver.findElement(By.xpath("//input[@tabindex='0' and @type='submit']")).click();

        driver.findElement(By.xpath("/html/body/div[1]/header[1]/div[1]/div[4]/div[3]/div[1]/a")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
