package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_LocatorConcept {
/*
- Everything is a webelements on page
- To interact with each element Automation script require locators.
- There are 8 locators available in selenium

1. ID
2. ClassName
3. Xpath
4. CSS selector
5. LinkText
6. Partial Link Text
7. TagName
8. Full Path
 */
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(3000);

//        driver.findElement(By.className("ico-login")).click();
//        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
//        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.header > div.header-upper > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a")).click();
//        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.partialLinkText("Log")).click(); //Clicking on Login Link
//        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();


        driver.findElement(By.id("Email")).sendKeys("Tester@gmail.com"); //Entering Email
        driver.findElement(By.id("Password")).sendKeys("Test@123"); //Entering Password

        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click(); //Clicking on login Button




    }
}
