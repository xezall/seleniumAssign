package assignwithLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        WebElement clickbmw=driver.findElement(By.cssSelector("#bmwradio"));
        clickbmw.click();

        boolean bmwselector=clickbmw.isSelected();
        if (bmwselector){
            System.out.println("successfull");
        }else{
            System.out.println("sorry problem");
        }


    }
}
