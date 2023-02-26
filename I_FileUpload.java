package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class I_FileUpload {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("http://cgi-lib.berkeley.edu/ex/fup.html");

        Thread.sleep(2000);
        driver.findElement(By.name("upfile")).sendKeys("C:\\Testing\\123.txt");

//        driver.close();
    }

}
