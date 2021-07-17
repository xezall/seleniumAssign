package assignwithLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get(" https://mail-pda.rambler.ru/");

        //driver.findElement(By.xpath("//a[@rel='noopener noreferrer'and@href='https://kino.rambler.ru/?utm_source=mail&utm_campaign=self_promo&utm_medium=topline&utm_content=kino_media']")).click();
        Thread.sleep(2000);
       // driver.findElement(By.xpath("#login")).sendKeys("Xezall");
    Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//span[@class='rui-Button-content']")).click();
//        Thread.sleep(2000);
        driver.quit();
    }
}
