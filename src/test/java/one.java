import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class one {

    @Test
    public void tc1(){
        String username = "tomsmith";
        String password = "SuperSecretPassword!";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.className("radius")).click();
        String actualresult = driver.findElement(By.id("flash")).getText();
        String expectedresult ="You logged into a secure area!";
        assertTrue(actualresult.contains(expectedresult));

        driver.close();

    }
}
