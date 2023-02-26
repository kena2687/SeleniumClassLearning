package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class K1_DropDown extends K2_Utils{

    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.className("ico-register")).click();

//        1.
//        driver.findElement(By.name("DateOfBirthDay")).sendKeys("10");
//        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("May");
//        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1986");

//        2.
        WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement Year  = driver.findElement(By.name("DateOfBirthYear"));

//        Day.sendKeys("11");
//        Month.sendKeys("June");
//        Year.sendKeys("1985");

//        Select select = new Select(Day);
//        select.selectByIndex(19);
//        Select select1 = new Select(Month);
//        select1.selectByIndex(4);
//        Select select2 = new Select(Year);
//        select2.selectByIndex(68);

//        3. Generic method - Reusable methods which can be used with different data.

            selectValueFromDropDown(Day,"15");
            selectValueFromDropDown(Month,"July");
            selectValueFromDropDown(Year,"1984");



    }


}
