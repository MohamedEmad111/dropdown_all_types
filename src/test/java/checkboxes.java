import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class checkboxes {
    @Test
    public void checkox(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

driver.get("https://rahulshettyacademy.com/dropdownsPractise/");


        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();

        System.out.println(driver.findElement(By.cssSelector("label[for='ctl00_mainContent_chk_friendsandfamily']")).getText());

String actualresult = driver.findElement(By.cssSelector("label[for='ctl00_mainContent_chk_friendsandfamily']")).getText();
String expectedresult="Family and Friends";
            assertTrue(actualresult.contains(expectedresult));




        //مش هتنفع لانه بيختار واحده بس مش كله
//        List<WebElement> elements =  driver.findElements(By.cssSelector("input[type='checkbox']"));
//
//      for (WebElement element : elements){
//          element.click();
//      }

    }
}
