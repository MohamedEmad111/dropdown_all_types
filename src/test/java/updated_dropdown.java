import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class updated_dropdown {
    @Test
    public void updated_dropdown() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);

        for (int i =0;i<1;i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        for (int i =0;i<3;i++){
            driver.findElement(By.id("hrefIncChd")).click();
        }
        for (int i =0;i<4;i++){
            driver.findElement(By.id("hrefIncInf")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println("the passengers are : "+driver.findElement(By.id("divpaxinfo")).getText());
        driver.close();
    }
}
