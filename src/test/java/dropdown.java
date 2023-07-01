import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class dropdown {

    @Test
    public void dropdown_practice(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement static_dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdwon =new Select(static_dropdown);
//        dropdwon.selectByIndex(3);
//        dropdwon.selectByVisibleText("AED");
        dropdwon.selectByValue("USD");
        String acutalresult=dropdwon.getFirstSelectedOption().getText();
        System.out.println("your currency is : "+acutalresult);
        String expectedresult="USD";
        assertTrue(acutalresult.contains(expectedresult));
    }

}
