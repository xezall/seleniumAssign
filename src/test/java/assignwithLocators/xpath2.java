package assignwithLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/b?node=283155");

        driver.findElement(By.xpath("//img[@onload='window.uet && uet.call && uet(\"af\");' and @alt='Books at Amazon']")).isDisplayed();

    }
}
