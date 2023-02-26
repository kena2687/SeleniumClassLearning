package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_WebDriverBasic {


    public static void main(String[] args) throws InterruptedException {

//        2. Set up the chromedriver - Path
        System.setProperty("webdriver.chrome.driver","C:\\Software\\Driver\\chromedriver.exe");
//        1. Create an instance of webdriver.
        WebDriver driver = new ChromeDriver();
//        3.Navigate to Webpage
        driver.get("https://demo.nopcommerce.com/");
//        4.Get page Title
//            1.
//        System.out.println("Page title is: "+ driver.getTitle());
//            2.
        String PageTitle = driver.getTitle();
        System.out.println("Page title is: "+PageTitle);
//        5.Expected  Vs Actual - Validation
        if(PageTitle == "nopCommerce demo store"){
            System.out.println("Page title is correct" );
        }else{
            System.out.println("Page title is incorrect");
        }
//        if(PageTitle.equals("nopCommerce demo store1")){
//            System.out.println("Page title is correct" );
//        }else{
//            System.out.println("Page title is incorrect");
//        }
//        6.Navigation
        driver.findElement(By.className("ico-login")).click();
//        7.Navigate Back
        driver.navigate().back();
//        8.Navigate Forward
        driver.navigate().forward();
//        9.Maximize the window
        driver.manage().window().maximize();
//        10. Minimize the window
//        driver.manage().window().minimize();

        driver.manage().window().maximize();
        Thread.sleep(1000);
//        11. Reload
        driver.navigate().refresh();

//        12. get Current URL
        String URL = driver.getCurrentUrl();
        System.out.println("Current Url: "+URL);

//        13. Close the web page
//        driver.close();
        driver.quit();
    }
}
