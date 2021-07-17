package assignwithLocators;

import Library.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Library.Driver.GetDriver;

public class asssignment {
    public static void main(String[] args) throws InterruptedException {
        /*
        1)Navigate to http://the-internet.herokuapp.com/
        2)Validate  page title
        3)Validate  page url
        4)Click Checkboxes
        5)Change Checkbox 1 to “Checked”
        6)Validate that its “checked”
        7)Change Checkbox 2 to “Unchecked”
        8)Validate that Checkbox 2 is “Unchecked”
        9)Navigate Back to //the-internet.herokuapp.com/ main page
        10)Click Dropdown
        11)Choose “Option 2” from the drop down
        12)Close the browser
         */
        WebDriver driver= Driver.GetDriver("chrome");

        String Url="http://the-internet.herokuapp.com/";
        driver.get(Url);
        String ActualURL=driver.getCurrentUrl();

        String expectedtitle="The Internet";
        String ActualTitle=driver.getTitle();

        if (Url.equals(ActualURL)){
            System.out.println("Valid URL");
        }else {
            System.out.println("Invalid URL");
        }
        if (expectedtitle.equals(ActualTitle)){
            System.out.println("Valid Title");
        }else {
            System.out.println("Invalid Title");
        }

        WebElement clickcheckBox=driver.findElement(By.xpath("//a[@href='/checkboxes']"));
        clickcheckBox.click();
        WebElement clickcheckbox1=driver.findElement(By.xpath("//html//body//div[2]//div[1]//div[1]//form//input[1]"));
        clickcheckbox1.click();
        Thread.sleep(2000);
        if (clickcheckbox1.isSelected()){
            System.out.println("successful");
        }else {
            System.out.println("sorry problem ");
        }

        WebElement checkbox2uncheck=driver.findElement(By.xpath("//html//body//div[2]//div[1]//div[1]//form//input[2]"));
        checkbox2uncheck.click();
        Thread.sleep(2000);

        if (checkbox2uncheck.isSelected()){
            System.out.println("checkbox 2 unchecked");
        }else {
            System.out.println("checkbox2 checked ");
        }

        driver.navigate().back();
        Thread.sleep(2000);
        WebElement clickdropdown= driver.findElement(By.xpath("//a[@href='/dropdown']"));
        clickdropdown.click();

        Thread.sleep(2000);
        WebElement selctdropdown= driver.findElement(By.xpath("//select"));
        selctdropdown.click();
        Thread.sleep(2000);

        WebElement option2=driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select slctoptn2=new Select(option2);
       slctoptn2.selectByIndex(2);
        Thread.sleep(2000);

       driver.quit();


    }

}
