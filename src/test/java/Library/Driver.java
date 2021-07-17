package Library;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
public static WebDriver GetDriver(String browser){
    if(browser.equalsIgnoreCase("chrome")){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }else if(browser.equalsIgnoreCase("firefox")){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }else if(browser.equalsIgnoreCase("iedriver")){
        WebDriverManager.iedriver().setup();
        return new InternetExplorerDriver();
    }else if(browser.equalsIgnoreCase("safari")){

        return new SafariDriver();
    }else {
        System.out.println("Browser does not exist ");
        System.out.println("Please check Browser name ");
        System.out.println("current browser name = "+browser);
        return null;
    }

  }
}
