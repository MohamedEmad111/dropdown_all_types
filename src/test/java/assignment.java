import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class assignment {
    @Test
    public void assignment() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//Check the first  Checkbox and verify if it is successfully checked
// and Uncheck it again to verify if it is successfully Unchecked
        driver.findElement(By.id("checkBoxOption1")).click();
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
        //should print true
        Thread.sleep(3000);
        driver.findElement(By.id("checkBoxOption1")).click();
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
//should print false

//        How to get the Count of number of check boxes present in the page

        System.out.println("the number of check boxes is : " + driver.findElements(By.cssSelector("input[type='checkbox']")).size());
driver.close();
    }
}
