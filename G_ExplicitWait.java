package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class G_ExplicitWait {
  /*
  Explicit wait is more powerful than implicit wait- Dynamic Wait
  Explicit wait will available inform of webDriver wait. (Predefined = Wait class)
  If we don't know the time : the best approach is explicit wait
  It can handle web elements and non web elements.
  No explicitly keyword or methods.
  Specific Element wait
   */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        WebDriverWait wait = new WebDriverWait(driver,20);//timeout
        wait.until(ExpectedConditions.titleContains("nopCommerce"));



        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("Tester@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Test@123");

        WebDriverWait wait1 = new WebDriverWait(driver,20);//timeout
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")));


    }

}
